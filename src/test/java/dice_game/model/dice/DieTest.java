package dice_game.model.dice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DieTest {

    @Test
    void testRoll() {
        Die die = new StdOerloegD6();
        Face face = die.roll();
        assertTrue("⚔⤖⛨⎋⭍".contains(face.getSymbol().toString()));
    }

    @Test
    void testToString() {
        Die die = new TestDie(Symbol.ATK_MELEE, true);
        assertEquals("⚔+", die.toString());
    }
}