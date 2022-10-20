// package Factory;
/**
 * BrandstofFactory
 */
public class BrandstofFactory implements AutoFactory {
    public BrandstofFactory() {
        System.out.println("Het wordt een brandstof auto");

    }

    public Auto createPerformanceAuto() {
        System.out.println("Het wordt het performance model");
        return new BrandstofPerformanceAuto();
        // Builder performanceBuilder = new PerformanceBuilder(lijst met opties)
    }

    public Auto createBudgetAuto() {
        System.out.println("Het wordt het budget model");
        return new BrandstofBudgetAuto();
    }
}