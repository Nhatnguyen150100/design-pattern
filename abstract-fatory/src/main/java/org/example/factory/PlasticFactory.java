package org.example.factory;

import org.example.entity.PlasticChair;
import org.example.entity.PlasticTable;
import org.example.interfaces.Chair;
import org.example.interfaces.FurnitureAbstractFactory;
import org.example.interfaces.Table;

/**
 * Sub class
 */
public class PlasticFactory implements FurnitureAbstractFactory {
  @Override
  public Chair createChair() {
    return new PlasticChair();
  }

  @Override
  public Table createTable() {
    return new PlasticTable();
  }
}
