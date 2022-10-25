import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("start");

        // Lijst met gekozen opties
        List<Object> opties = new ArrayList<Object>();
        opties.add("brandstof");
        opties.add("performance");
        // True = goeie / False = slechte//
        opties.add(false); // Velgen
        opties.add(false); // Klimaatcontrole
        opties.add(false); // Soort stoelen
        opties.add(false); // Audio systeem
        opties.add(false); // Aantal deuren
        opties.add("sirene"); // Toeter, keuze uit: trein, sirene, bel

        AutoFactory factory;
        Builder bob;
        Auto auto;
        String bestelNummer = ((Integer) ThreadLocalRandom.current().nextInt(1000, 10000)).toString();
        opties.add(bestelNummer);

        if (opties.get(0) == "elektrisch") {
            factory = new ElektrischFactory();
        } else {
            factory = new BrandstofFactory();
        }

        if (opties.get(1) == "budget") {
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