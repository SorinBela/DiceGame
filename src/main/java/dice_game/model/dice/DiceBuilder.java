package dice_game.model.dice;

/**
 * With this class you can construct a single custom Die and designate the number of
 * {@link Face}s, which {@link Symbol} is on said Face and if this Face grants mana or not.
 *
 * @author Soeren Totzauer
 */
public class DiceBuilder {

    Die dieToBeConstructed;

    public DiceBuilder() {
        this.dieToBeConstructed = null;
    }

    public DiceBuilder die() {
        this.dieToBeConstructed = new DieMold();
        return this;
    }

    /**
     * adds a Face to the die with the designated {@link dice_game.model.dice.Symbol]
     * @param symbol - The Symbol of the side of the die
     * @return - The DiceBuilder holding the die to be constructed
     */
    public DiceBuilder face(Symbol symbol) {
        this.dieToBeConstructed.addFace(new Face(symbol, false));
        return this;
    }

    public DiceBuilder manaFace(Symbol symbol) {
        this.dieToBeConstructed.addFace(new Face(symbol, true));
        return this;
    }

    public Die build() {
        if(this.dieToBeConstructed == null)
            throw new IllegalStateException("DieBuilder has no DieMold. Call a die() method first.");
        Die constructedDie = this.dieToBeConstructed;
        this.dieToBeConstructed = null;
        return constructedDie;
    }

    public Die standardDie() {
        return this.die()
                .manaFace(Symbol.ATK_MELEE)
                .face(Symbol.ATK_MELEE)
                .face(Symbol.ATK_RANGED)
                .face(Symbol.DEF_MELEE)
                .face(Symbol.DEF_RANGED)
                .face(Symbol.STEAL)
                .build();
    }
}
