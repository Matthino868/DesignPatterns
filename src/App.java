import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static List<Object> check() {
        List<Object> opties = new ArrayList<Object>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Goeiedag!\nWelkom bij onze dealership. Wij verkopen verschillende soorten auto's");

        while (opties.size() != 7) {

            switch (opties.size()) {
                case 0:
                    // Brandstof of elektrisch
                    System.out.println("Welke soort brandstof zoekt u?");
                    System.out.println("0: Elektrisch");
                    System.out.println("1: Benzine");
                    break;
                case 1:
                    // Budget of performance
                    System.out.println("Wat is uw budget?");
                    System.out.println("0: Budget");
                    System.out.println("1: Performance");
                    break;
                case 2:
                    // Velgen
                    System.out.println("Wilt u de velgen upgraden?");
                    System.out.println("0: Nee");
                    System.out.println("1: Ja");
                    break;
                case 3:
                    // Klimaatcontrole
                    System.out.println("Wilt u Klimaatcontrole?");
                    System.out.println("0: Nee");
                    System.out.println("1: Ja");
                    break;
                case 4:
                    // soort stoelen
                    System.out.println("Wilt u premium stoelen?");
                    System.out.println("0: Nee");
                    System.out.println("1: Ja");
                    break;
                case 5:
                    // soort audio systeem
                    System.out.println("Wilt u een beter audio systeem?");
                    System.out.println("0: Nee");
                    System.out.println("1: Ja");
                    break;
                case 6:
                    // aantal deuren
                    System.out.println("Hoeveel deuren wilt u?");
                    System.out.println("0: 3");
                    System.out.println("1: 5");
                    break;
            }
            try {
                int i = scanner.nextInt();
                if (i == 0 || i == 1) {
                    opties.add(i == 1);
                    continue;
                } else {
                    System.out.println("Voer een 0 of 1 in.");
                }
            } catch (Exception e) {
                scanner = new Scanner(System.in);
                System.out.println("Voer een 0 of 1 in.");
            }
        }
        while (true) {
            // Soort toeter
            System.out.println("Welke soort toeter wilt u?");
            System.out.println("0: Trein toeter");
            System.out.println("1: Sirene toeter");
            System.out.println("2: Bel toeter");
            try {
                int i = scanner.nextInt();
                if (i == 0 || i == 1 || i == 2) {
                    opties.add(i);
                    break;
                }
                System.out.println("Voer een 0, 1 of 2 in.");
            } catch (Exception e) {
                scanner = new Scanner(System.in);
                System.out.println("Voer een 0 of 1 in.");
            }
        }
        scanner.close();
        System.out.println(
                "Okay!\nDat was de intake. Ik zal de bestelling voor u plaatsen en dan krijgt u een mailtje als de auto klaar staat.\n");
        return opties;
    }

    public static void main(String[] args) throws Exception {
        // System.out.println("start");

        // Lijst met gekozen opties
        // List<Object> opties = new ArrayList<Object>();
        List<Object> opties = check();
        // System.out.println(Arrays.toString(opties.toArray()));
        // return;
        // Scanner scanner = new Scanner(System.in);
        // int i = scanner.nextInt();
        // // check ? opties.add("brandstof") : opties.add("elektrisch");
        // opties.add(i == 1 ? "brandstof" : "performance");

        // opties.add("brandstof");
        // opties.add("performance");
        // // True = goeie / False = slechte//
        // opties.add(false); // Velgen
        // opties.add(false); // Klimaatcontrole
        // opties.add(false); // Soort stoelen
        // opties.add(false); // Audio systeem
        // opties.add(false); // Aantal deuren
        // opties.add("sirene"); // Toeter, keuze uit: trein, sirene, bel

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