package org.example.interfaces.impl;

import org.example.entity.Context;
import org.example.interfaces.ISoldier;

public class Soldier implements ISoldier {
    private final String name;

    public Soldier(String name) {
        this.name = name;
        System.out.printf("Soldier is created! - %s%n", this.name);
    }

    @Override
    public void promote(Context context) {
        System.out.println(this.name + " " + context.getId() + " promoted " + context.getStar());
    }
}
