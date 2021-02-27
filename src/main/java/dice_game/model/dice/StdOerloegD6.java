package dice_game.model.dice;

public class StdOerloegD6 extends Die {

    public StdOerloegD6() {
        this.addFace(new Face(Symbol.ATK_MELEE, true));
        this.addFace(new Face(Symbol.ATK_MELEE));
        this.addFace(new Face(Symbol.ATK_RANGED));
        this.addFace(new Face(Symbol.STEAL));
        this.addFace(new Face(Symbol.DEF_MELEE));
        this.addFace(new Face(Symbol.DEF_RANGED));
    }
}
