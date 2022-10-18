import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Lijst met opties
        //ArrayList[] lijst = {};
        String[] lijst = {"elektrisch", "brandstof"};


        if(lijst[0] == "elektrisch"){
            AutoFactory elektrischAuto = new ElektrischFactory(lijst);
        }
        else if(lijst[0]== "brandstof"){
            AutoFactory brandstofAuto = new BrandstofFactory(lijst);
        }
        else{
            throw new Exception("Onbekende optie");
        }

    }
}

/*
 * 
 * interface AutoFactory {
        void createPerformanceAuto
        void createBudgetAuto
    }
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