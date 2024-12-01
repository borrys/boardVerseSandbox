package boardverse;

public abstract class GameRules<M extends Move> {
  private final Class<M> moveType;

  public GameRules(Class<M> moveType) {
    this.moveType = moveType;
  }

  public PlayState applyRules(Move move, PlayState playState) {
    var verifiedMove = cast(move);
    validateMove(verifiedMove, playState);
    var appliedMove = applyMove(verifiedMove, playState);
    return checkResult(verifiedMove, appliedMove);
  }

  protected abstract void validateMove(M move, PlayState playState);
  protected abstract PlayState applyMove(M move, PlayState playState);
  protected abstract PlayState checkResult(M move, PlayState playState);


  private M cast(Move move) {
    if (moveType.isInstance(move)) {
      return moveType.cast(move);
    } else {
      throw new IllegalArgumentException("Unexpected move type: %s. Required: %s".formatted(move.getClass(), moveType));
    }
  }
}
