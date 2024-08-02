package org.example.pool;

import org.example.entity.Taxi;
import org.example.exception.TaxiNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class TaxiPool {
    private static final long EXPIRED_TIME_IN_MILISECOND = 1200;
    private static final int NUMBER_OF_TAXI = 4;

    private final List<Taxi> availableTaxi = Collections.synchronizedList(new ArrayList<>());
    private final List<Taxi> inUseTaxi = Collections.synchronizedList(new ArrayList<>());

    private final AtomicInteger count = new AtomicInteger(0);
    private final AtomicBoolean waiting = new AtomicBoolean(false);

    public synchronized Taxi getTaxi() {
        if(!availableTaxi.isEmpty()) {
            Taxi taxi = availableTaxi.removeFirst();
            inUseTaxi.add(taxi);
            return taxi;
        }
        if(count.get() == NUMBER_OF_TAXI) {
            this.waitingUntilTaxiAvailable();
            return this.getTaxi();
        }
        Taxi taxi = this.createTaxi();
        inUseTaxi.add(taxi);
        return taxi;
    }

    public synchronized void release(Taxi taxi) {
        inUseTaxi.remove(taxi);
        availableTaxi.add(taxi);
        System.out.println(taxi.getName() + " is free");
    }

    private Taxi createTaxi() {
        waiting(200); // The time to create a taxi
        Taxi taxi = new Taxi("Taxi " + count.incrementAndGet());
        System.out.println(taxi.getName() + " is created");
        return taxi;
    }

    private void waitingUntilTaxiAvailable() {
        if (waiting.get()) {
            waiting.set(false);
            throw new TaxiNotFoundException("No taxi available");
        }
        waiting.set(true);
        waiting(EXPIRED_TIME_IN_MILISECOND);
    }

    private void waiting(long numberOfSecond) {
        try {
            TimeUnit.MILLISECONDS.sleep(numberOfSecond);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
