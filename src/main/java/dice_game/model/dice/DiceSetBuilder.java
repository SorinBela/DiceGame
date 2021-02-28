package dice_game.model.dice;

import java.util.ArrayList;
import java.util.List;

/**
 * The DiceSetBuilder can construct sets of Dice.
 *
 * @author Soeren Totzauer
 */
public class DiceSetBuilder {

    private static final DiceBuilder diceBuilder = new DiceBuilder();

    private DiceSetBuilder() {}

    /**
     * A standard set consisting of 5 standard Dice
     * @return A List&lt;Die&gt; which contains 5 Die objects
     */
    public static List<Die> standardSet() {
        ArrayList<Die> diceSet = new ArrayList<>();
        diceSet.add(diceBuilder.standardDie());
        diceSet.add(diceBuilder.standardDie());
        diceSet.add(diceBuilder.standardDie());
        diceSet.add(diceBuilder.standardDie());
        diceSet.add(diceBuilder.standardDie());
        return diceSet;
    }
}
