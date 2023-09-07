package appC;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;

import static org.mockito.BDDMockito.*;

public class GameTest {

    @Test
    void init() {
        GameNumGen genMock = mock(GameNumGen.class);
        final Game game = new Game(genMock);
        game.init(GameLevel.EASY);

        then(genMock).should(only()).generate(any());
    }
}
