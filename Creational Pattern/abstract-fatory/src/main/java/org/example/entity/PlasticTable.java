package org.example.entity;

import org.example.interfaces.Table;

public class PlasticTable implements Table {
  @Override
  public void createTable() {
    System.out.println("Create plastic table");
  }
}
