package boardverse;

public record Play(
    Long id,
    GameType gameType,
    PlayState state
) {
  Play withState(PlayState newState) {
    return new Play(id, gameType, newState);
  }
}
