package org.example.factory;

import org.example.enums.MaterialType;
import org.example.interfaces.FurnitureAbstractFactory;

public class FurnitureFactory {
  public FurnitureFactory() {
  }

  public static FurnitureAbstractFactory getFactory(MaterialType factoryType) {
    switch (factoryType) {
      case WOOD -> {
        return new WoodFactory();
      }
      case PLASTIC -> {
        return new PlasticFactory();
      }
      default -> throw new UnsupportedOperationException("This furniture is unsupported ");
    }
  }
}
