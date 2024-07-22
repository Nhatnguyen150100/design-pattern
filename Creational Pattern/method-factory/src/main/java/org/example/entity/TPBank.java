package org.example.entity;

import org.example.interfaces.Bank;

public class TPBank implements Bank {
  @Override
  public void getBankName() {
    System.out.println("TP Bank");
  }
}
