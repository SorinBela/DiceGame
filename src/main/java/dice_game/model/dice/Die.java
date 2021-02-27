package dice_game.model.dice;

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

    @Override
    public String toString() {
        return this.top.toString();
    }
}
