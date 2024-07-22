package org.example.entity;

import org.example.interfaces.Chair;

public class WoodChair implements Chair {
  @Override
  public void createChair() {
    System.out.println("Create wood chair");
  }
}
