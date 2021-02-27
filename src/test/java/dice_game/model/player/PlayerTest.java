package dice_game.model.player;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PlayerTest {

    @Test
    void givenStdPlayerAndDiceSet_rollOk() {
        Player stdPlayer = PlayerFactory.createNewPlayer();
        assertEquals("[⎋, ⎋, ⎋, ⎋, ⎋]", stdPlayer.getDiceInPlay().toString());
        stdPlayer.roll();
        // This may fail in ((1/6)^5) ~ 0.00012% of all cases
        assertNotEquals("[⎋, ⎋, ⎋, ⎋, ⎋]", stdPlayer.getDiceInPlay().toString());
    }

}