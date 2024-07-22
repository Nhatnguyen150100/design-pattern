package org.example.entity;

import org.example.interfaces.Chair;

public class PlasticChair implements Chair {
  @Override
  public void createChair() {
    System.out.println("Create plastic chair");
  }
}
