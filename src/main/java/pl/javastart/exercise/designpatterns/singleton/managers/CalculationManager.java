package pl.javastart.exercise.designpatterns.singleton.managers;

import pl.javastart.exercise.designpatterns.singleton.Logger;

public class CalculationManager {

    private Logger logger;

    public CalculationManager() {
        logger = new Logger("log.txt");
    }

    public void doImportantCalculations() {
        logger.log("Doing important calculations");
    }
}
