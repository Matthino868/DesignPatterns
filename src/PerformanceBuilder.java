import java.util.List;

/**
 * PerformanceBuilder
 */

public class PerformanceBuilder implements Builder {
    SalesMan KlaasJan;

    public PerformanceBuilder() {
        this.KlaasJan = new SalesMan("KlaasJan");
    }

    public Auto bouw(Auto auto, List<Object> opties) {
        String bestelNummer = (String) opties.get(8);
        KlaasJan.subscribe(bestelNummer, new Email());
        auto.setBestelNummer(bestelNummer);
        specialeVelgen(auto, (Boolean) opties.get(2));
        upgradeKlimaatControle(auto, (Boolean) opties.get(3));
        upgradeStoelen(auto, (Boolean) opties.get(4));
        upgradeAudioSysteem(auto, (Boolean) opties.get(5));
        setAantalDeuren(auto, (Boolean) opties.get(6));
        installeerToeter(auto, (int) opties.get(7));
        System.out.println();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("===========================");
        System.out.println("Auto:");
        auto.show();
        System.out.println();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("===========================");
        KlaasJan.notify(auto.getBestelNummer());
        KlaasJan.unsubscribe(bestelNummer);
        return auto;
    }

    public Auto specialeVelgen(Auto auto, Boolean velg) {
        if (velg) {
            auto.setVelgen("Sport velgen");
            System.out.println("Er worden sportvelgen gemonteerd");
        } else {
            auto.setVelgen("Normale velgen");
            System.out.println("Er worden normale velgen gemonteerd");
        }
        return auto;
    }

    public Auto upgradeKlimaatControle(Auto auto, Boolean klimaatcontrole) {
        if (klimaatcontrole) {
            System.out.println("Er wordt Stoelverwarming ingebouwd");
            auto.setKlimaatControle("Stoelverwarming");
        } else {
            System.out.println("Er wordt geen klimaat controle ingebouwd");
            auto.setKlimaatControle("Geen klimaat controle");
        }
        return auto;
    }

    public Auto upgradeStoelen(Auto auto, Boolean stoelSoort) {
        if (stoelSoort) {
            System.out.println("Er worden luxe alcantara stoelen ingezet");
            auto.setSoortStoelen("Alcantara stoelen");
        } else {
            System.out.println("Er worden nep leder stoelen ingezet");
            auto.setSoortStoelen("Nep lederen stoelen");
        }
        return auto;
    }

    public Auto upgradeAudioSysteem(Auto auto, Boolean upgradeAudioSysteem) {
        if (upgradeAudioSysteem) {
            System.out.println("Het audiosysteem wordt geupgrade naar Harman Kardon");
            auto.setAudioSysteem("Harman Kardon audiosysteem");
        } else {
            System.out.println("Het audiosysteem wordt niet geupgrade");
            auto.setAudioSysteem("Standaard audiosysteem");
        }
        return auto;
    }

    public Auto setAantalDeuren(Auto auto, Boolean aantalDeuren) {
        if (aantalDeuren) {
            System.out.println("Er worden 5 deuren gemonteerd");
            auto.setAantalDeuren(5);
        } else {
            System.out.println("Er worden 3 deuren gemonteerd");
            auto.setAantalDeuren(3);
        }
        return auto;
    }

    public Auto installeerToeter(Auto auto, int toeterType) {
        if (toeterType == 0) {
            System.out.println("Er wordt een trein toeter ge??nstalleerd");
            auto.setToeter(new TreinToeter());
        } else if (toeterType == 1) {
            System.out.println("Er wordt een sirene toeter ge??nstalleerd");
            auto.setToeter(new SireneToeter());
        } else if (toeterType == 2) {
            System.out.println("Er wordt een bel toeter ge??nstalleerd");
            auto.setToeter(new BelToeter());
        }
        return auto;
    }
}
