package org.example.entity;

import org.example.interfaces.Table;

public class WoodTable implements Table {
  @Override
  public void createTable() {
    System.out.println("Create wood table");
  }
}
