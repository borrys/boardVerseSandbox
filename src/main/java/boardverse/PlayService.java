package boardverse;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlayService {
  private final GameRepository gameRepository;
  private final GameRulesFactory rulesFactory;

  public PlayService(GameRepository gameRepository, GameRulesFactory rulesFactory) {
    this.gameRepository = gameRepository;
    this.rulesFactory = rulesFactory;
  }

  public Play applyMove(Long playId, Move move) {
    Play play = gameRepository.findById(playId);
    GameRules<? extends Move> rules = rulesFactory.getRules(play);
    PlayState updatedState = rules.applyRules(move, play.state());
    play.withState(updatedState);
    return gameRepository.save(play);
  }

  public List<Play> getAllPlays() {
    return gameRepository.getAll();
  }
}
