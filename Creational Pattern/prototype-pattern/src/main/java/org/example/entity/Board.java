package org.example.entity;

import org.example.enums.Color;
import org.example.factory.CellFactory;

public class Board {
  /**
   * Số hàng trong 1 bàn cờ
   */
  public static final int NO_OF_ROWS = 8;

  /**
   * Số cột trong 1 bàn cờ
   */
  public static final int NO_OF_COLUMNS = 8;

  private final Cell[][] board;

  public Board() {
    this.board = new Cell[NO_OF_ROWS][NO_OF_COLUMNS];
    Cell cell;
    for (int row = NO_OF_ROWS - 1; row >= 0; row--) {
      for (int col = NO_OF_COLUMNS - 1; col >= 0; col--) {
        if ((row + col) % 2 == 0) {
          cell = CellFactory.getInstance().generateCell(Color.WHITE);
        } else {
          cell = CellFactory.getInstance().generateCell(Color.BLACK);
        }
        cell.setCoordinate(String.format("%dx%d", row, col));
        board[row][col] = cell;
      }
    }
  }

  public void print() {
    for (int row = 0; row < NO_OF_ROWS; row++) {
      for (int col = 0; col < NO_OF_COLUMNS; col++) {
        System.out.print(board[row][col] + " ");
      }
      System.out.println();
    }
  }
}