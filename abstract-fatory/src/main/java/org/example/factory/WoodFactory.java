package org.example.factory;

import org.example.entity.PlasticTable;
import org.example.entity.WoodChair;
import org.example.interfaces.Chair;
import org.example.interfaces.FurnitureAbstractFactory;
import org.example.interfaces.Table;

/**
 * Sub class
 */
public class WoodFactory implements FurnitureAbstractFactory {
  @Override
  public Chair createChair() {
    return new WoodChair();
  }

  @Override
  public Table createTable() {
    return new PlasticTable();
  }
}
