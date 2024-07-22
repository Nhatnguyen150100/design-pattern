package org.example.factory;

import org.example.entity.Cell;
import org.example.enums.Color;

import java.util.HashMap;
import java.util.Map;

public class CellFactory {
  private static final Map<Color, Cell> CELL_CACHE = new HashMap<>();

  private static CellFactory instance;

  public CellFactory() {}

  public static CellFactory getInstance() {
    if(instance == null) return new CellFactory();
    return instance;
  }

  public Cell generateCell(Color color) {
    if(!CELL_CACHE.containsKey(color)) {
      Cell cell = new Cell(color.name());
      CELL_CACHE.put(color, cell);
    }
    return CELL_CACHE.get(color).clone();
  }
}
