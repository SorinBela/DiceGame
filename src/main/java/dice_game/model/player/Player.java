package dice_game.model.player;

import dice_game.action.DiceAction;
import dice_game.model.dice.Die;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Player implements DiceAction {

    private final PlayerStats playerStats = new PlayerStats();

    private int totalRolls = 3;
    private int remainingRolls = 3;

    private List<Die> dice = new ArrayList<>();
    private List<Die> keepPile = new ArrayList<>();
    private List<Die> diceInPlay = new ArrayList<>();

    protected Player(List<Die> diceSet) {

        if(diceSet == null || diceSet.isEmpty()) {
            throw new IllegalArgumentException("Cannot construct Player without DiceSet. DiceSet provided was " + diceSet);
        }

        this.dice.addAll(diceSet);
        this.diceInPlay.addAll(diceSet);
    }

    public List<Die> getDiceKept() {
        return this.keepPile;
    }

    public List<Die> getDiceInPlay() {
        return this.diceInPlay;
    }

    @Override
    public void roll() {
        if(this.remainingRolls <= 0) return;

        for(Die die : this.diceInPlay) {
            die.roll();
        }
        this.remainingRolls--;
    }

    @Override
    public void keep(Die die) {
        this.diceInPlay.remove(die);
        this.keepPile.add(die);
    }

    @Override
    public void keepAll() {
        this.keepPile.addAll(diceInPlay);
        this.diceInPlay.clear();
    }


    @Override
    public void retrieveDice() {
        this.diceInPlay.addAll(this.keepPile);
    }

    public boolean hasRollsRemaining() {
        return 0 < this.remainingRolls;
    }

    public boolean isDead() {
        return this.playerStats.getHealthStatus() == HealthStatus.DEAD;
    }

    public void updateStats() {
        for(Die die : this.getDiceKept()) {
            die.affect(this.playerStats);
        }
    }
}
