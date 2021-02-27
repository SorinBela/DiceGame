package dice_game.model.dice;

public enum Symbol {

    ATK_MELEE("⚔"),
    ATK_RANGED("⤖"),
    DEF_MELEE("⛨"),
    DEF_RANGED("⎋"),
    STEAL("⭍"),
    BLANK("");

    private final String character;

    Symbol(String symbol) {
        this.character = symbol;
    }

    @Override
    public String toString() {
        return this.character;
    }

}
