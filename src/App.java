import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("start");

        System.out.println("ELEKTRISCH BUDGET---------------");
        // Lijst met gekozen opties
        List<Object> opties = new ArrayList<Object>();
        opties.add("elektrisch");
        opties.add("budget");
        //True = goeie / False = slechte//
        opties.add(true); // Velgen
        opties.add(true); // Klimaatcontrole
        opties.add(true); // Soort stoelen
        opties.add(true); // Audio systeem
        opties.add(true); // aantal deuren

        AutoFactory factory;
        Auto auto;


        if (opties.get(0) == "elektrisch") {
            factory = new ElektrischFactory();
        } else {
            factory = new BrandstofFactory();
        }

        if (opties.get(1) == "budget") {
            auto = factory.createBudgetAuto();
            // System.out.println("budget");
        } else {
            auto = factory.createPerformanceAuto();
            // System.out.println("performance");

        }

        // auto.show();

        Builder bob;

        if (opties.get(1) == "budget") {
            bob = new BudgetBuilder();
        } else {
            bob = new PerformanceBuilder();
        }

        Auto finalauto = bob.bouw(auto, opties);
        finalauto.show();





        System.out.println("\n\n\n");
        System.out.println("ELEKTRISCH PERFORMANCE-----------");

        List<Object> opties2 = new ArrayList<Object>();
        opties2.add("elektrisch");
        opties2.add("performance");
        //True = goeie / False = slechte//
        opties2.add(false); //velgen         
        opties2.add(true);  //KlimaatControle
        opties2.add(true);  //Soort stoelen
        opties2.add(true);  //Audiosysteem
        opties2.add(false);  //Aantal deuren

        Auto auto2;
        
        if (opties2.get(0) == "elektrisch") {
            factory = new ElektrischFactory();
        } else {
            factory = new BrandstofFactory();
        }

        if (opties2.get(1) == "budget") {
            auto2 = factory.createBudgetAuto();
            // System.out.println("budget");
        } else {
            auto2 = factory.createPerformanceAuto();
            // System.out.println("performance");

        }

        if (opties2.get(1) == "budget") {
            bob = new BudgetBuilder();
        } else {
            bob = new PerformanceBuilder();
        }

        Auto finalauto2 = bob.bouw(auto2, opties2);
        finalauto2.show();

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