package org.example.factory;

import org.example.interfaces.ISoldier;
import org.example.interfaces.impl.Soldier;

import java.util.HashMap;
import java.util.Map;

public class SoldierFactory {
    private static SoldierFactory instance;
    private static final Map<String, ISoldier> soldiers = new HashMap<>();

    private SoldierFactory() {}

    public static SoldierFactory getInstance() {
        if(instance == null ) return new SoldierFactory();
        return instance;
    }
    public synchronized ISoldier createSoldier(String name) {
        ISoldier soldier = soldiers.get(name);
        if (soldier == null) {
            waitingForCreateASoldier();
            soldier = new Soldier(name);
            soldiers.put(name, soldier);
        }
        return soldier;
    }

    public synchronized int getTotalOfSoldiers() {
        return soldiers.size();
    }

    private void waitingForCreateASoldier() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
