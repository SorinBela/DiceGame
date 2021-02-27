package dice_game.action;

import dice_game.model.player.Player;

public interface ResolveAction {

    void attack(Player victim);
}
