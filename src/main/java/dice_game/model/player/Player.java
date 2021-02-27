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

    private int maxHp = 20;
    private int currentHp = maxHp;
    private int mana = 0;

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
        for(Die die : this.diceInPlay) {
            die.roll();
        }
    }

    @Override
    public void keep(Die die) {
        this.diceInPlay.remove(die);
        this.keepPile.add(die);
    }

    @Override
    public void retrieveDice() {
        this.diceInPlay.addAll(this.keepPile);
    }

}
