package dice_game.model.dice;

import java.util.ArrayList;

public class StdSixSidedDie extends Die {

    public StdSixSidedDie() {
        this.sides = new ArrayList<>(6);
        this.sides.add(new Face(Symbol.ATK_MELEE, true));
        this.sides.add(new Face(Symbol.ATK_MELEE));
        this.sides.add(new Face(Symbol.ATK_RANGED));
        this.sides.add(new Face(Symbol.STEAL));
        this.sides.add(new Face(Symbol.DEF_MELEE));
        this.sides.add(new Face(Symbol.DEF_RANGED));
    }
}
