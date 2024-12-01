package boardverse.tictactoe;

import boardverse.Move;

public final class TicTacToeMove extends Move {
  private final String player;
  private final int row;
  private final int column;

  public TicTacToeMove(String player, int row, int column) {
    this.player = player;
    this.row = row;
    this.column = column;
  }

  public String getPlayer() {
    return player;
  }

  public int getRow() {
    return row;
  }

  public int getColumn() {
    return column;
  }

  @Override
  public String toString() {
    return "TicTacToeMove{" +
        "player='" + player + '\'' +
        ", row=" + row +
        ", column=" + column +
        '}';
  }
}
