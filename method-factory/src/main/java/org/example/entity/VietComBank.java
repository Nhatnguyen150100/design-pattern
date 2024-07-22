package org.example.entity;

import org.example.interfaces.Bank;

public class VietComBank implements Bank {
  @Override
  public void getBankName() {
    System.out.println("VietCom Bank");
  }
}
