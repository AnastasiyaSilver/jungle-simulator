package pl.asilver.junglesim.util;

import pl.asilver.junglesim.entity.Crocodile;

public class ActionSimulator {
    public void simulateAction(Crocodile crocodile) throws InterruptedException {
        while (lifeChecker(crocodile) == true) {
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
                slipAction(crocodile);
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
        if (energy < 0) {
            energy = 0;
        }
        crocodile.setEnergyPoints(energy);
        energyChecker(crocodile);
        System.out.println("Crocodile swam in the river. -2 energy. Current energy: "
                + crocodile.getEnergyPoints() + ".");
    }

    private void walkAction(Crocodile crocodile) {
        int energy = crocodile.getEnergyPoints();
        energy = energy - 5;
        if (energy < 0) {
            energy = 0;
        }
        crocodile.setEnergyPoints(energy);
        energyChecker(crocodile);
        System.out.println("Crocodile walked on land. Current energy is: "
                + crocodile.getEnergyPoints() + ".");
    }

    private void baskAction(Crocodile crocodile) {
        int energy = crocodile.getEnergyPoints();
        energy = energy + 1;
        if (energy > 100) {
            energy = 100;
        }
        crocodile.setEnergyPoints(energy);
        int health = crocodile.getHealthPoints();
        health = health + 1;
        if (health > 100) {
            health = 100;
        }
        crocodile.setHealthPoints(health);
        energyChecker(crocodile);
        System.out.println("Crocodile basked in the sun! His statistics now: energy points " +
                crocodile.getEnergyPoints() + ", health points " +
                crocodile.getHealthPoints() + ".");
    }

    private void restAction(Crocodile crocodile) {
        int energy = crocodile.getEnergyPoints();
        energy = energy + 2;
        if (energy > 100) {
            energy = 100;
        }
        crocodile.setEnergyPoints(energy);
        energyChecker(crocodile);
        System.out.println("Crocodile rested in the water. His energy now: " +
                crocodile.getEnergyPoints() + ".");
    }

    private void slipAction(Crocodile crocodile) {
        int energy = crocodile.getEnergyPoints();
        energy = energy + crocodile.getAmplifierCoef() * 7;
        if (energy > 100) {
            energy = 100;
        }
        crocodile.setEnergyPoints(energy);
        int health = crocodile.getHealthPoints();
        health = health + crocodile.getAmplifierCoef() * 5;
        if (health > 100) {
            health = 100;
        }
        crocodile.setHealthPoints(health);
        energyChecker(crocodile);
        System.out.println("Crocodile slept peacefully! Current statistics: energy points " +
                crocodile.getEnergyPoints() + ", health points " +
                crocodile.getHealthPoints() + ".");
    }

    private void eatFishAction(Crocodile crocodile) {
        int energy = crocodile.getEnergyPoints();
        energy = energy - crocodile.getAmplifierCoef() * 1;
        if (energy < 0) {
            energy = 0;
        }
        crocodile.setEnergyPoints(energy);
        int health = crocodile.getHealthPoints();
        health = health + crocodile.getAmplifierCoef() * 1;
        if (health > 100) {
            health = 100;
        }
        crocodile.setHealthPoints(health);
        energyChecker(crocodile);
        System.out.println("Crocodile ate a fish! Current statistics: energy "
                + crocodile.getEnergyPoints() + ", health points: "
                + crocodile.getHealthPoints() + ".");
    }

    private void eatFrogAction(Crocodile crocodile) {
        int energy = crocodile.getEnergyPoints();
        energy = energy - crocodile.getAmplifierCoef() * 2;
        if (energy < 0) {
            energy = 0;
        }
        crocodile.setEnergyPoints(energy);
        int health = crocodile.getHealthPoints();
        health = health + crocodile.getAmplifierCoef() * 2;
        if (health > 100) {
            health = 100;
        }
        crocodile.setHealthPoints(health);
        energyChecker(crocodile);
        System.out.println("Crocodile ate a frog! Currents statistics: energy points "
                + crocodile.getEnergyPoints() + ", health points "
                + crocodile.getHealthPoints() + ".");
    }

    private void eatSnakeAction(Crocodile crocodile) {
        int energy = crocodile.getEnergyPoints();
        energy = energy - crocodile.getAmplifierCoef() * 3;
        if (energy < 0) {
            energy = 0;
        }
        crocodile.setEnergyPoints(energy);
        int health = crocodile.getHealthPoints();
        health = health + crocodile.getAmplifierCoef() * 5;
        if (health > 100) {
            health = 100;
        }
        crocodile.setHealthPoints(health);
        energyChecker(crocodile);
        System.out.println("Crocodile ate a snake!Currents statistics: energy points "
                + crocodile.getEnergyPoints() + ", health points "
                + crocodile.getHealthPoints() + ".");
    }

    private void swimAwayAction(Crocodile crocodile) {
        int energy = crocodile.getEnergyPoints();
        energy = energy - crocodile.getAmplifierCoef() * 6;
        if (energy < 0) {
            energy = 0;
        }
        crocodile.setEnergyPoints(energy);
        energyChecker(crocodile);
        System.out.println("Crocodile swam away from hippo! Current energy is: "
                + crocodile.getEnergyPoints());
    }

    private void fightAction(Crocodile crocodile) {
        int energy = crocodile.getEnergyPoints();
        energy = energy - crocodile.getAmplifierCoef() * 13;
        if (energy < 0) {
            energy = 0;
        }
        crocodile.setEnergyPoints(energy);
        int health = crocodile.getHealthPoints();
        health = health - crocodile.getAmplifierCoef() * 18;
        if (health < 0) {
            health = 0;
        }
        crocodile.setHealthPoints(health);
        energyChecker(crocodile);
        System.out.println("Crocodile was attacked by hippo! Current statistics after fight: energy points " +
                crocodile.getEnergyPoints() + ", health points " + crocodile.getHealthPoints() + ".");
    }

    private void energyChecker(Crocodile crocodile) {
        if (crocodile.getEnergyPoints() <= 0) {
            int health = crocodile.getHealthPoints();
            health = health - 10;
            if (health <= 0) {
                health = 0;
            }
            crocodile.setEnergyPoints(health);
        }
    }

    private boolean lifeChecker(Crocodile crocodile) {
        System.out.println("Current statistics: eh - " + crocodile.getEnergyPoints() +
                ", hp: " + crocodile.getHealthPoints() + ".");
        if (crocodile.getHealthPoints() <= 0) {
            return false;
        } else {
            return true;
        }
    }
}
