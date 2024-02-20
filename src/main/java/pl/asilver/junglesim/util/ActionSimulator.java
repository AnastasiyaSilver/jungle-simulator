package pl.asilver.junglesim.util;

import pl.asilver.junglesim.entity.Crocodile;

public class ActionSimulator {
    public void simulateAction(Crocodile crocodile) throws InterruptedException {
        while (lifeChecker(crocodile)) {
            int probabilityNumber = (int) (Math.random() * 100);
            if (probabilityNumber >= 0 && probabilityNumber < 10) {
                swimAction(crocodile);
            } else if (probabilityNumber >= 10 && probabilityNumber < 20) {
                walkAction(crocodile);
            } else if (probabilityNumber >= 20 && probabilityNumber < 30) {
                baskAction(crocodile);
            } else if (probabilityNumber >= 30 && probabilityNumber < 40) {
                restAction(crocodile);
            } else if (probabilityNumber >= 40 && probabilityNumber < 50) {
                sleepAction(crocodile);
            } else if (probabilityNumber >= 50 && probabilityNumber < 60) {
                eatFishAction(crocodile);
            } else if (probabilityNumber >= 60 && probabilityNumber < 70) {
                eatFrogAction(crocodile);
            } else if (probabilityNumber >= 70 && probabilityNumber < 80) {
                eatSnakeAction(crocodile);
            } else if (probabilityNumber >= 80 && probabilityNumber < 90) {
                swimAwayAction(crocodile);
            } else if (probabilityNumber >= 90 && probabilityNumber <= 100) {
                fightAction(crocodile);
            }
            Thread.sleep(1000);
        }
        System.out.println("Ups! Crocodile died!:(");
    }

    private void swimAction(Crocodile crocodile) {
        int energy = crocodile.getEnergyPoints();
        energy = energy - 2;
        crocodile.setEnergyPoints(energy);
        setMinEnergy(crocodile);
        energyChecker(crocodile);
        System.out.println("Crocodile swam in the river. -2 energy. Current energy: "
                + crocodile.getEnergyPoints() + ".");
    }

    private void walkAction(Crocodile crocodile) {
        int energy = crocodile.getEnergyPoints();
        energy = energy - 5;
        crocodile.setEnergyPoints(energy);
        setMinEnergy(crocodile);
        energyChecker(crocodile);
        System.out.println("Crocodile walked on land. Current energy is: "
                + crocodile.getEnergyPoints() + ".");
    }

    private void baskAction(Crocodile crocodile) {
        int energy = crocodile.getEnergyPoints();
        energy = energy + 1;
        crocodile.setEnergyPoints(energy);
        setMaxEnergy(crocodile);
        int health = crocodile.getHealthPoints();
        health = health + 1;
        crocodile.setHealthPoints(health);
        setMaxEnergy(crocodile);
        energyChecker(crocodile);
        System.out.println("Crocodile basked in the sun! His statistics now: energy points " +
                crocodile.getEnergyPoints() + ", health points " +
                crocodile.getHealthPoints() + ".");
    }

    private void restAction(Crocodile crocodile) {
        int energy = crocodile.getEnergyPoints();
        energy = energy + 2;
        crocodile.setEnergyPoints(energy);
        setMaxEnergy(crocodile);
        energyChecker(crocodile);
        System.out.println("Crocodile rested in the water. His energy now: " +
                crocodile.getEnergyPoints() + ".");
    }

    private void sleepAction(Crocodile crocodile) {
        int energy = crocodile.getEnergyPoints();
        energy = energy + crocodile.getAmplifierCoef() * 7;
        crocodile.setEnergyPoints(energy);
        setMaxEnergy(crocodile);
        int health = crocodile.getHealthPoints();
        health = health + crocodile.getAmplifierCoef() * 5;
        crocodile.setHealthPoints(health);
        setMaxHealth(crocodile);
        energyChecker(crocodile);
        System.out.println("Crocodile slept peacefully! Current statistics: energy points " +
                crocodile.getEnergyPoints() + ", health points " +
                crocodile.getHealthPoints() + ".");
    }

    private void eatFishAction(Crocodile crocodile) {
        int energy = crocodile.getEnergyPoints();
        energy = energy - crocodile.getAmplifierCoef() * 1;
        crocodile.setEnergyPoints(energy);
        setMinEnergy(crocodile);
        int health = crocodile.getHealthPoints();
        health = health + crocodile.getAmplifierCoef() * 1;
        crocodile.setHealthPoints(health);
        setMaxHealth(crocodile);
        energyChecker(crocodile);
        System.out.println("Crocodile ate a fish! Current statistics: energy "
                + crocodile.getEnergyPoints() + ", health points: "
                + crocodile.getHealthPoints() + ".");
    }

    private void eatFrogAction(Crocodile crocodile) {
        int energy = crocodile.getEnergyPoints();
        energy = energy - crocodile.getAmplifierCoef() * 2;
        crocodile.setEnergyPoints(energy);
        setMinEnergy(crocodile);
        int health = crocodile.getHealthPoints();
        health = health + crocodile.getAmplifierCoef() * 2;
        crocodile.setHealthPoints(health);
        setMaxEnergy(crocodile);
        energyChecker(crocodile);
        System.out.println("Crocodile ate a frog! Currents statistics: energy points "
                + crocodile.getEnergyPoints() + ", health points "
                + crocodile.getHealthPoints() + ".");
    }

    private void eatSnakeAction(Crocodile crocodile) {
        int energy = crocodile.getEnergyPoints();
        energy = energy - crocodile.getAmplifierCoef() * 3;
        crocodile.setEnergyPoints(energy);
        setMinEnergy(crocodile);
        int health = crocodile.getHealthPoints();
        health = health + crocodile.getAmplifierCoef() * 5;
        crocodile.setHealthPoints(health);
        setMaxHealth(crocodile);
        energyChecker(crocodile);
        System.out.println("Crocodile ate a snake!Currents statistics: energy points "
                + crocodile.getEnergyPoints() + ", health points "
                + crocodile.getHealthPoints() + ".");
    }

    private void swimAwayAction(Crocodile crocodile) {
        int energy = crocodile.getEnergyPoints();
        energy = energy - crocodile.getAmplifierCoef() * 6;
        crocodile.setEnergyPoints(energy);
        setMinEnergy(crocodile);
        energyChecker(crocodile);
        System.out.println("Crocodile swam away from hippo! Current energy is: "
                + crocodile.getEnergyPoints());
    }

    private void fightAction(Crocodile crocodile) {
        int energy = crocodile.getEnergyPoints();
        energy = energy - crocodile.getAmplifierCoef() * 13;
        crocodile.setEnergyPoints(energy);
        setMinEnergy(crocodile);
        int health = crocodile.getHealthPoints();
        health = health - crocodile.getAmplifierCoef() * 18;
        crocodile.setHealthPoints(health);
        setMinHealth(crocodile);
        energyChecker(crocodile);
        System.out.println("Crocodile was attacked by hippo! Current statistics after fight: energy points " +
                crocodile.getEnergyPoints() + ", health points " + crocodile.getHealthPoints() + ".");
    }

    private void setMinEnergy(Crocodile crocodile) {
        if (crocodile.getEnergyPoints() < 0) {
            crocodile.setEnergyPoints(0);
        }
    }

    private void setMaxEnergy(Crocodile crocodile) {
        if (crocodile.getEnergyPoints() > 100) {
            crocodile.setEnergyPoints(100);
        }
    }

    private void setMinHealth(Crocodile crocodile) {
        if (crocodile.getHealthPoints() < 0) {
            crocodile.setHealthPoints(0);
        }
    }

    private void setMaxHealth(Crocodile crocodile) {
        if (crocodile.getHealthPoints() > 100) {
            crocodile.setHealthPoints(100);
        }
    }

    private void energyChecker(Crocodile crocodile) {
        if (crocodile.getEnergyPoints() <= 0) {
            int health = crocodile.getHealthPoints();
            health = health - 10;
            crocodile.setEnergyPoints(health);
            setMinHealth(crocodile);
        }
    }

    private boolean lifeChecker(Crocodile crocodile) {
        System.out.println("Current statistics: ep - " + crocodile.getEnergyPoints() +
                ", hp: " + crocodile.getHealthPoints() + ".");
        return crocodile.getHealthPoints() > 0;
    }
}
