package org.example;

import org.example.enums.MaterialType;
import org.example.factory.FurnitureFactory;
import org.example.interfaces.Chair;
import org.example.interfaces.FurnitureAbstractFactory;
import org.example.interfaces.Table;

public class Main {
  public static void main(String[] args) {
    FurnitureAbstractFactory plasticFactory = FurnitureFactory.getFactory(MaterialType.PLASTIC);
    Chair plasticChair = plasticFactory.createChair();
    Table plasticTable = plasticFactory.createTable();
    System.out.println(plasticChair);
    System.out.println(plasticTable);

    FurnitureAbstractFactory woodFactory = FurnitureFactory.getFactory(MaterialType.WOOD);
    Chair woodChair = woodFactory.createChair();
    Table woodTable = woodFactory.createTable();
    System.out.println(woodChair);
    System.out.println(woodTable);
  }
}