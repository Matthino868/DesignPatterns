import java.util.List;

/**
 * BudgetBuilder
 */
public class BudgetBuilder implements Builder{
   
    public Auto bouw(Auto auto, List<Object> opties) {
        if ((Boolean) opties.get(3) == true) {
            auto = specialeVelgen(auto, "Aerodynamische velgen");
        } else {
            auto = specialeVelgen(auto, "Normale velgen");
        }
        return auto;
    }

    public Auto specialeVelgen(Auto auto, String velg) {
        System.out.println("Er worden " + velg + " gemonteerd");
        auto.setVelgen(velg);
        return auto;
    }

    public void upgradeKlimaatControle(){

    }

    public void upgradeStoelen(){

    }

    public void upgradeAudioSysteem(){

    }

    public void setAantalDeuren(){

    }



}