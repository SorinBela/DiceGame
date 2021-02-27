package dice_game.model.player;

import dice_game.action.DiceAction;
import dice_game.model.dice.Die;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Getter
public class Player implements DiceAction {

    private final PlayerStats playerStats = new PlayerStats();

    private int totalRolls = 3;
    private int remainingRolls = 3;

    private List<Die> dice = new ArrayList<>();
    private List<Die> keepPile = new ArrayList<>();
    private List<Die> diceInPlay = new ArrayList<>();

    protected Player(Die... dice) {

        if(dice == null) {
            throw new IllegalArgumentException("Player Constructor received _null_ as Dice");
        }

        List<Die> diceToInsert = Arrays.stream(dice).
                filter(Objects::nonNull)
                .collect(Collectors.toList());
        if(diceToInsert.isEmpty()) {
            throw new IllegalArgumentException("Cannot instantiate Player with given Dice.");
        }
        this.dice.addAll(diceToInsert);
        this.diceInPlay.addAll(diceToInsert);
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
