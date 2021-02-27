package dice_game.model.player;

import lombok.Getter;

public class PlayerStats {

    private int maxHp = 20;
    private int currentHp = maxHp;

    @Getter
    private int atkMelee = 0;
    @Getter
    private int atkRanged = 0;
    @Getter
    private int defMelee = 0;
    @Getter
    private int defRanged = 0;
    @Getter
    private int steal = 0;
    @Getter
    private int mana;

    private HealthStatus healthStatus;

    public void doDamage(int damage) {
        this.currentHp -= damage;
        if (this.currentHp <= 0) {
            this.healthStatus = HealthStatus.DEAD;
        }
    }

    public HealthStatus getHealthStatus() {
        return healthStatus;
    }

    public void addAtkMelee(int value) {
        this.atkMelee += value;
    }

    public void addAtkRanged(int value) {
        this.atkRanged += value;
    }

    public void addDefMelee(int value) {
        this.defMelee += value;
    }

    public void addDefRanged(int value) {
        this.defRanged += value;
    }

    public void addSteal(int value) {
        this.steal += value;
    }

    @Override
    public String toString() {
        return
                "Atk-M("+ this.atkMelee +")" +
                "Atk-R(" + this.atkRanged + ")" +
                "Def-M(" + this.defMelee + ")" +
                        "Def-R(" + this.defRanged + ")" +
                "Steal("+ this.steal +")";
    }

    public int sumStats() {
        return this.atkMelee + this.atkRanged + this.defMelee + this.defRanged + this.steal;
    }
}
