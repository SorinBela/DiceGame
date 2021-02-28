package dice_game.model.dice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DieTest {

    @Test
    void testRoll() {
        Die die = new DiceBuilder().standardDie();
        Face face = die.roll();
        assertTrue("⚔⤖⛨⎋⭍".contains(face.getSymbol().toString()));
    }

}