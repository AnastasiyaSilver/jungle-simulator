package pl.asilver.junglesim.entity;

public class Crocodile {
    private int healthPoints = 100;
    private int energyPoints = 100;
    private int amplifierCoef = 3;

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getEnergyPoints() {
        return this.energyPoints;
    }

    public void setEnergyPoints(int energyPoints) {
        this.energyPoints = energyPoints;
    }

    public int getAmplifierCoef() {
        return this.amplifierCoef;
    }
}
