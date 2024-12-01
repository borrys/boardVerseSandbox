package boardverse;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayController {
private final PlayService playService;

  public PlayController(PlayService playService) {
    this.playService = playService;
  }

  @GetMapping("/plays")
  public List<Play> getAllPlays() {
    return playService.getAllPlays();
  }

  @PostMapping("/plays/{playId}/move")
  public Play applyMove(@PathVariable Long playId, @RequestBody Move move) {
    return playService.applyMove(playId, move);
  }
}
