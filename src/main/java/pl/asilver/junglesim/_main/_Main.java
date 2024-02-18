package pl.asilver.junglesim._main;

import pl.asilver.junglesim.entity.Crocodile;

import pl.asilver.junglesim.util.ActionSimulator;

public class _Main {
    public static void main(String[] args) throws InterruptedException {
        Crocodile crocodile = new Crocodile();
        ActionSimulator actionSimulator = new ActionSimulator();
        actionSimulator.simulateAction(crocodile);
    }
}
