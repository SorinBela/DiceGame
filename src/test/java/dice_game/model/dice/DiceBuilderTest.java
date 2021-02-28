package dice_game.model.dice;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiceBuilderTest {

    @Test
    void givenDiceBuilder_whenConstructingStdDie_buildOk() {
        DiceBuilder builder = new DiceBuilder();
        Die stdDie = builder.die()
                .face(Symbol.ATK_MELEE)
                .manaFace(Symbol.ATK_MELEE)
                .face(Symbol.DEF_MELEE)
                .face(Symbol.ATK_RANGED)
                .face(Symbol.DEF_RANGED)
                .face(Symbol.STEAL)
                .build();
        assertEquals(6, stdDie.getSize());
        assertEquals("[⚔, ⚔+, ⛨, ⤖, ⎋, ⭍]", stdDie.getSides().toString());
        assertNull(builder.dieToBeConstructed);
    }

    @Test
    void whenConstructorArgumentIsNull_thenRaiseError() {
        DiceBuilder builder = new DiceBuilder();
        assertThrows(
                IllegalStateException.class,
                builder::build);
    }

    @Test
    void whenCreatingStdDice_thenDieOk() {
        DiceBuilder builder = new DiceBuilder();
        Die stdDie = builder.standardDie();
        assertEquals(6, stdDie.getSize());
        assertEquals("[⚔+, ⚔, ⤖, ⛨, ⎋, ⭍]", stdDie.getSides().toString());
        assertNull(builder.dieToBeConstructed);
    }

    @Test
    void whenCreatingStdSet_thenCreateOk() {
        List<Die> diceSet = DiceSetBuilder.standardSet();
        assertEquals(5, diceSet.size());
        for(Die die : diceSet) {
            assertEquals("[⚔+, ⚔, ⤖, ⛨, ⎋, ⭍]", die.getSides().toString());
        }
    }

}