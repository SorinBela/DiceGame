package dice_game.model.player;

import dice_game.model.dice.StdSixSidedDie;
import dice_game.model.dice.Symbol;
import dice_game.model.dice.TestDie;

public class PlayerFactory {

    private PlayerFactory() {}

    public static Player createNewPlayer() {
        return new Player(
                new StdSixSidedDie(),
                new StdSixSidedDie(),
                new StdSixSidedDie(),
                new StdSixSidedDie(),
                new StdSixSidedDie()
        );
    }

    public static Player createTestPlayer() {
        return new Player(
                new TestDie(Symbol.ATK_MELEE, true)
        );
    }
}
