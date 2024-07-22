package org.example.factory;

import org.example.entity.TPBank;
import org.example.entity.VietComBank;
import org.example.enums.BankType;
import org.example.interfaces.Bank;

public class BankFactory {
  private static BankFactory instance;

  private BankFactory(){};

  public static BankFactory getInstance() {
    if(instance == null) return new BankFactory();
    return instance;
  }

  public Bank getBank(BankType bankType) {
    return switch (bankType) {
      case TPBANK -> new TPBank();
      case VIETCOMBANK -> new VietComBank();
      default -> throw new IllegalArgumentException("This bank type is unsupported");
    };
  }
}
