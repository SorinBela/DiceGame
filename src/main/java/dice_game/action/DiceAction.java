package dice_game.action;

import dice_game.model.dice.Die;

public interface DiceAction extends Action {

    void roll();
    void keep(Die die);
    void retrieveDice();

}
