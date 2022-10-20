import java.util.List;

/**
 * BudgetBuilder
 */
public class BudgetBuilder implements Builder{
   
    public Auto bouw(Auto auto, List<Object> opties) {
        specialeVelgen(auto, (Boolean) opties.get(2));
        auto = upgradeKlimaatControle(auto, (Boolean)opties.get(3));
        upgradeStoelen(auto, (Boolean) opties.get(4));
        upgradeAudioSysteem(auto, (Boolean) opties.get(5));
        setAantalDeuren(auto, (Boolean) opties.get(6));
        return auto;
    }

    public Auto specialeVelgen(Auto auto, Boolean velg) {
        if (velg) {
            auto.setVelgen("Aerodynamische velgen");
            System.out.println("Er worden aerodynamische gemonteerd");
        } else {
            auto.setVelgen("Normale velgen");
            System.out.println("Er worden normale gemonteerd");
        }
        return auto;
    }

    public Auto upgradeKlimaatControle(Auto auto, Boolean klimaatcontrole){
        if (klimaatcontrole) {
            System.out.println("Er wordt Air Conditioning ingebouwd");
            auto.setKlimaatControle("Air Conditioning");
        } else {
            System.out.println("Er wordt geen klimaat controle ingebouwd");
            auto.setKlimaatControle("Geen klimaat controle");
        }
        return auto;
    }

    public Auto upgradeStoelen(Auto auto, Boolean stoelSoort) {
        if (stoelSoort) {
            System.out.println("Er worden luxe leren stoelen ingezet");
            auto.setSoortStoelen("Luxe leren");
        } else {
            System.out.println("Er worden normale suede stoelen ingezet");
            auto.setSoortStoelen("Normale suede");
        }
        return auto; 
    }

    public Auto upgradeAudioSysteem (Auto auto, Boolean upgradeAudioSysteem) {
        if (upgradeAudioSysteem) {
            System.out.println("Het audiosysteem wordt geupgrade naar Sound+");
            auto.setAudioSysteem("Sound+ audio");
        } else {
            System.out.println("Het audiosysteem wordt niet geupgrade");
            auto.setKlimaatControle("Normaal audiosysteem");
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



}