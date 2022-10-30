import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * SalesMan
 */

public class SalesMan {
    String naam;
    Map<String, Email> bestelNummers = new HashMap<>();

    SalesMan(String naam){
        this.naam = naam;
    }

    public void subscribe(String bestelNummer, Email email) {
        this.bestelNummers.put(bestelNummer, email);
    }

    public void unsubscribe(String bestelNummer) {
        this.bestelNummers.remove(bestelNummer);
    }

    public void notify(String bestelNummer) {
        Email email = bestelNummers.get(bestelNummer);
        System.out.println("Salesman: ");
        System.out.println("Hallo ik ben " + naam);
        email.update(bestelNummer);
    }

    public List<Object> intake() {
        List<Object> opties = new ArrayList<Object>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Goeiedag!\nWelkom bij onze dealership. Mijn naam is "+naam+" en ik ben 1 van de Salesmannen hier. Wij verkopen verschillende soorten auto's");

        while (opties.size() != 7) {

            switch (opties.size()) {
                case 0:
                    // Brandstof of elektrisch
                    System.out.println("Wilt u op brandstof of elektrisch rijden?");
                    System.out.println("0: Elektrisch");
                    System.out.println("1: Brandstof");
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
}