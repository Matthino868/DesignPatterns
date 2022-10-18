import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("start");

        // Lijst met opties
        // ArrayList[] lijst = {};
        // Object[] lijst = {"elektrisch", "brandstof"};
        List<Object> lijst = new ArrayList<Object>();
        lijst.add("elektrisch");
        lijst.add(true);

        AutoFactory factory;
        Auto auto;

        if (lijst.get(0) == "elektrisch") {
            factory = new ElektrischFactory();
        } else {
            factory = new BrandstofFactory();
        }

        auto = new Auto(factory);

        auto.bouw();


        // AutoBuilder autoMetOpties = new AutoBuilder(lijst);

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