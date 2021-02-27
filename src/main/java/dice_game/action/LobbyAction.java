package dice_game.action;

public interface LobbyAction extends Action {

    void quit();
    void join();
    void surrender();

}
