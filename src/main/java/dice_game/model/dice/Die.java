package dice_game.model.dice;

import dice_game.model.player.PlayerStats;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Die {

    protected Face top;
    protected List<Face> sides = new ArrayList<>();

    public Face roll() {
        Collections.shuffle(sides);
        this.top = sides.get(0);
        return this.top;
    }

    protected void addFace(Face face) {
        this.sides.add(face);
        this.top = face;
    }

    public void affect(PlayerStats playerStats) {
        switch (top.getSymbol()) {
            case ATK_MELEE:
                playerStats.addAtkMelee(1);
                break;
            case ATK_RANGED:
                playerStats.addAtkRanged(1);
                break;
            case DEF_MELEE:
                playerStats.addDefMelee(1);
                break;
            case DEF_RANGED:
                playerStats.addDefRanged(1);
                break;
            case STEAL:
                playerStats.addSteal(1);
                break;
            default:
                break;
        }
    }

    @Override
    public String toString() {
        return this.top.toString();
    }
}
