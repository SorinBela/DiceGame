package dice_game.model.dice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DieTest {

    @Test
    void testRoll() {
        Die die = new StdSixSidedDie();
        Face face = die.roll();
        System.out.println(face.getSymbol());
    }

    @Test
    void testToString() {
        Die die = new TestDie(Symbol.ATK_MELEE, true);
        assertEquals("⚔+", die.toString());
    }
}