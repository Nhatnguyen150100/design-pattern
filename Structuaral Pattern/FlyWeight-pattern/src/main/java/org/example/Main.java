package org.example;

import org.example.entity.Context;
import org.example.factory.SoldierFactory;
import org.example.interfaces.ISoldier;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final List<ISoldier> soldiers = new ArrayList<>();

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        createSoldier(5, "Yuri", 1);
        createSoldier(5, "Spy", 1);
        createSoldier(3, "Spy", 3);
        createSoldier(2, "Yuri", 2);
        long endTime = System.currentTimeMillis();
        System.out.println("---");
        System.out.println("Total soldiers made : " + soldiers.size());
        System.out.println("Total time worked : " + Duration.ofMillis(endTime - startTime).getSeconds() + " seconds");
        System.out.println("Total type of soldiers made : " + SoldierFactory.getInstance().getTotalOfSoldiers());
        for (ISoldier element : soldiers) {
            System.out.println("address: " + System.identityHashCode(element));
        }
    }

    private static void createSoldier(int numberOfSoldier, String soldierName, int numberOfStar) {
        for (int i = 1; i <= numberOfSoldier; i++) {
            Context star = new Context("Soldier " + (soldiers.size() + 1), numberOfStar);
            ISoldier soldier = SoldierFactory.getInstance().createSoldier(soldierName);
            soldier.promote(star);
            soldiers.add(soldier);
        }
    }
}