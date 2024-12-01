package boardverse.rockpaperscissors;

import boardverse.Move;

public final class RockPaperScissorsMove extends Move {
  private final String player;
  private final RockPaperScissorsGesture gesture;

  public RockPaperScissorsMove(String player, RockPaperScissorsGesture gesture) {
    this.player = player;
    this.gesture = gesture;
  }

  public String getPlayer() {
    return player;
  }

  public RockPaperScissorsGesture getGesture() {
    return gesture;
  }
}
