package boardverse;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class GameRepository {
  private final AtomicLong lastId = new AtomicLong(0);
  private final Map<Long, Play> database = new HashMap<>();

  @PostConstruct
  void insertTestData() {
    create(GameType.TIC_TAC_TOE, new PlayState());
    create(GameType.ROCK_PAPER_SCISSORS, new PlayState());
  }

  public List<Play> getAll() {
    return List.copyOf(database.values());
  }

  public Play create(GameType type, PlayState initialState) {
    Play play = new Play(lastId.incrementAndGet(), type, initialState);
    database.put(play.id(), play);
    return play;
  }

  public Play findById(Long id) {
    return database.get(id);
  }

  public Play save(Play play) {
    database.put(play.id(), play);
    return play;
  }
}
