package dice_game.action;

import dice_game.model.dice.Die;

public interface DiceAction {

    void roll();
    void keep(Die die);
    void retrieveDice();

}
