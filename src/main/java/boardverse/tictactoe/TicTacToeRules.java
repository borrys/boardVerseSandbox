package boardverse.tictactoe;

import boardverse.GameRules;
import boardverse.PlayState;

public class TicTacToeRules extends GameRules<TicTacToeMove> {
  public TicTacToeRules() {
    super(TicTacToeMove.class);
  }

  @Override
  protected void validateMove(TicTacToeMove move, PlayState playState) {
    System.out.println(move);
    System.out.println(playState);
    throw new IllegalStateException("Not implemented!");
  }

  @Override
  protected PlayState applyMove(TicTacToeMove move, PlayState playState) {
    throw new IllegalStateException("Not implemented!");
  }

  @Override
  protected PlayState checkResult(TicTacToeMove move, PlayState playState) {
    throw new IllegalStateException("Not implemented!");
  }
}
