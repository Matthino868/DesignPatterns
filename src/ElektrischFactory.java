/**
 * ElektrischFactory
 */
public class ElektrischFactory implements AutoFactory {

    public ElektrischFactory() {
        System.out.println("Het wordt een elektrische auto");
    }

    public Auto createPerformanceAuto() {
        System.out.println("Het wordt het performance model");
        return new ElektrischPerformanceAuto();
    }

    public Auto createBudgetAuto() {
        System.out.println("Het wordt het budget model");
        return new ElektrischBudgetAuto();
    }
}