/**
 * BrandstofFactory
 */
public class BrandstofFactory implements AutoFactory {
    public BrandstofFactory(String[] lijst) {
	}

	public void createPerformanceAuto() {
        System.out.println("Create PerformanceBrandstofAuto");
    }

    public void createBudgetAuto() {
        System.out.println("Create Budget BrandstofAuto");
    }
}