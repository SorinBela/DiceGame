package dice_game.model.dice;

public class Face {

    private Die container;
    private Symbol symbol;
    private boolean grantMana;

    public Face(Symbol symbol, boolean grantMana) {
        this.symbol = symbol;
        this.grantMana = grantMana;
    }

    public Face(Symbol symbol) {
        this(symbol, false);
    }

    public Die getContainer() {
        return this.container;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public Symbol getSymbol() {
        return this.symbol;
    }

    public void setGrantMana(boolean grantMana) {
        this.grantMana = grantMana;
    }

    public boolean isGrantMana() {
        return this.grantMana;
    }

    protected void setContainer(Die die) {
        this.container = die;
    }

    @Override
    public String toString() {
        return this.symbol + (this.isGrantMana() ? "+" : "");
    }

}
