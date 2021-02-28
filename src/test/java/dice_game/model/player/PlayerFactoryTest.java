package dice_game.model.player;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings({"unused"})
class PlayerFactoryTest {

    @Test
    void whenConstructorArgumentIsNull_thenRaiseError() {
        assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Player player = new Player(null);
                });
    }

}