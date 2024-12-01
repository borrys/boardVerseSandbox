package boardverse;

import boardverse.rockpaperscissors.RockPaperScissorsMove;
import boardverse.tictactoe.TicTacToeMove;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = TicTacToeMove.class, name = "TIC_TAC_TOE"),
    @JsonSubTypes.Type(value = RockPaperScissorsMove.class, name = "ROCK_PAPER_SCISSORS")
})
public abstract class Move {
}
