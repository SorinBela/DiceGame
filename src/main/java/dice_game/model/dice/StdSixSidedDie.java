package dice_game.model.dice;

import java.util.ArrayList;

public class StdSixSidedDie extends Die {

    public StdSixSidedDie() {
        this.addFace(new Face(Symbol.ATK_MELEE, true));
        this.addFace(new Face(Symbol.ATK_MELEE));
        this.addFace(new Face(Symbol.ATK_RANGED));
        this.addFace(new Face(Symbol.STEAL));
        this.addFace(new Face(Symbol.DEF_MELEE));
        this.addFace(new Face(Symbol.DEF_RANGED));
    }
}
