package dice_game.action;

public interface GameAction extends Action {

    void quit();
    void join();
    void surrender();
    void undo();
}
