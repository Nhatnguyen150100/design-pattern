package org.example.entity;

public class Cell implements Cloneable{

  private String color;
  private String coordinate;

  public Cell(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getCoordinate() {
    return coordinate;
  }

  public void setCoordinate(String coordinate) {
    this.coordinate = coordinate;
  }

  @Override
  public String toString() {
    return "Cell{" +
            "color='" + color + '\'' +
            ", coordinate='" + coordinate + '\'' +
            '}';
  }

  @Override
  public Cell clone() {
    try {
      return (Cell) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }
}
