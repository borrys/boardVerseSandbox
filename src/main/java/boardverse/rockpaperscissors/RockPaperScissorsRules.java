package boardverse.rockpaperscissors;

import boardverse.GameRules;
import boardverse.PlayState;

public class RockPaperScissorsRules extends GameRules<RockPaperScissorsMove> {
  public RockPaperScissorsRules() {
    super(RockPaperScissorsMove.class);
  }

  @Override
  protected void validateMove(RockPaperScissorsMove move, PlayState playState) {
    throw new IllegalStateException("Not implemented!");

  }

  @Override
  protected PlayState applyMove(RockPaperScissorsMove move, PlayState playState) {
    throw new IllegalStateException("Not implemented!");
  }

  @Override
  protected PlayState checkResult(RockPaperScissorsMove move, PlayState playState) {
    throw new IllegalStateException("Not implemented!");
  }
}
