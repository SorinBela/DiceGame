package dice_game.model.dice;

/**
 * 1-sided Test Die
 */
public class TestDie extends Die {

    public TestDie(Symbol symbol, boolean grantMana) {
        this.sides.add(new Face(symbol, grantMana));
        this.top = this.sides.get(0);
    }
}
