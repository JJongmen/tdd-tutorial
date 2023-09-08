package appC;

public class Game {
    private final GameNumGen gameNumGenerator;

    public Game(final GameNumGen gameNumGenerator) {
        this.gameNumGenerator = gameNumGenerator;
    }

    public void init(final GameLevel gameLevel) {
        gameNumGenerator.generate(gameLevel);
    }
}
