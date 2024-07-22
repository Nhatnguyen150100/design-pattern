package org.example;

import org.example.enums.BankType;
import org.example.factory.BankFactory;
import org.example.interfaces.Bank;

public class Main {
  public static void main(String[] args) {
    Bank bank = BankFactory.getInstance().getBank(BankType.TPBANK);
    bank.getBankName();
  }
}