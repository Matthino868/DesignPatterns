import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        SalesMan Antonio = new SalesMan("Antonio");
        List<Object> opties = Antonio.intake();
        AutoFactory factory;
        Builder bob;
        Auto auto;
        String bestelNummer = ((Integer) ThreadLocalRandom.current().nextInt(1000,
                10000)).toString();
        opties.add(bestelNummer);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("===========================");
        System.out.println("Process:");
        if (opties.get(0) == (Integer) 0) {
            factory = new ElektrischFactory();
        } else {
            factory = new BrandstofFactory();
        }
        if (opties.get(1) == (Integer) 0) {
            auto = factory.createBudgetAuto();
            bob = new BudgetBuilder();
        } else {
            auto = factory.createPerformanceAuto();
            bob = new PerformanceBuilder();
        }
        Auto finalauto = bob.bouw(auto, opties);
        finalauto.toeter();

    }
}