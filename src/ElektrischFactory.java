/**
 * ElektrischFactory
 */
public class ElektrischFactory implements AutoFactory {

    public ElektrischFactory(String[] lijst) {
	}

	public void createPerformanceAuto() {
        System.out.println("Create PerformanceElektrischAuto");
        // Builder performanceBuilder = new PerformanceBuilder(lijst met opties)
    }

    public void createBudgetAuto() {
        System.out.println("Create BudgetElektrischAuto");
    }
}