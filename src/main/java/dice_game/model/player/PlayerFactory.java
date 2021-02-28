package dice_game.model.player;

import dice_game.model.dice.DiceSetBuilder;

public class PlayerFactory {

    private PlayerFactory() {}

    public static Player createNewPlayer() {
        return new Player(
                DiceSetBuilder.standardSet()
        );
    }
}
