package dice_game.action;

public interface GameAction {

    void quit();
    void join();
    void surrender();
    void undo();
}
