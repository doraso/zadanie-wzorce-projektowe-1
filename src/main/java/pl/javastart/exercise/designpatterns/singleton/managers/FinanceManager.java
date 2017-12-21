package pl.javastart.exercise.designpatterns.singleton.managers;

import pl.javastart.exercise.designpatterns.singleton.Logger;

public class FinanceManager {

    private Logger logger;

    public FinanceManager() {
        logger = new Logger();
    }

    public void doFinanceStuff() {
        logger.log("Doing important finance stuff");
    }
}
