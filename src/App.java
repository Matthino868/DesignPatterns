import java.util.ArrayList;
import java.util.List;

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
        Auto auto;

        if (opties.get(0) == "elektrisch") {
            factory = new ElektrischFactory();
        } else {
            factory = new BrandstofFactory();
        }

        if (opties.get(1) == "budget") {
            auto = factory.createBudgetAuto();
        } else {
            auto = factory.createPerformanceAuto();
        }

        Builder bob;

        if (opties.get(1) == "budget") {
            bob = new BudgetBuilder();
        } else {
            bob = new PerformanceBuilder();
        }

        Auto finalauto = bob.bouw(auto, opties);
        finalauto.show();
        finalauto.toeter();

    }
}

/*
 * 
 * interface AutoFactory {
 * void createPerformanceAuto
 * void createBudgetAuto
 * }
 * 
 * 
 *
 * class Elektrischfactory implements autoFactory
 * class BrandstofFactory implements autoFactory
 * 
 * interface BudgetAuto
 * 
 * interface PerformanceAuto
 * 
 * class ElektrischBudgetAuto implements BudgetaAuto
 * 
 * class ElektrischPerformanceAuto implements PerformanceAuto
 * 
 * class BrandstofBudgetAuto implements BudgetAuto
 * 
 * class BrandstofPerformanceAuto implements PerformanceAuto
 * 
 */