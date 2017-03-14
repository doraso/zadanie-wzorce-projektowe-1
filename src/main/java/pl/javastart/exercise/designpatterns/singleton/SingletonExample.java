package pl.javastart.exercise.designpatterns.singleton;

import pl.javastart.exercise.designpatterns.singleton.managers.CalculationManager;
import pl.javastart.exercise.designpatterns.singleton.managers.FinanceManager;

public class SingletonExample {

    public static void main(String[] args) {

        FinanceManager financeManager = new FinanceManager();

        financeManager.doFinanceStuff();
        financeManager.doFinanceStuff();
        CalculationManager calculationManager = new CalculationManager();
        calculationManager.doImportantCalculations();
        calculationManager.doImportantCalculations();
        calculationManager.doImportantCalculations();
        calculationManager.doImportantCalculations();
        financeManager.doFinanceStuff();
        financeManager.doFinanceStuff();
        financeManager.doFinanceStuff();
    }

}
