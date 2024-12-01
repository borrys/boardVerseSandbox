package boardverse;

import boardverse.rockpaperscissors.RockPaperScissorsRules;
import boardverse.tictactoe.TicTacToeRules;
import org.springframework.stereotype.Component;

@Component
public class GameRulesFactory {

  public GameRules<? extends Move> getRules(Play play) {
    return switch (play.gameType()) {
      case TIC_TAC_TOE -> new TicTacToeRules();
      case ROCK_PAPER_SCISSORS -> new RockPaperScissorsRules();
    };
  }
}
