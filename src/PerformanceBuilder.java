import java.util.List;

/**
 * PerformanceBuilder
 */
public class PerformanceBuilder implements Builder {

    public Auto bouw(Auto auto, List<Object> opties) {
        if ((Boolean) opties.get(3) == true) {
            auto = specialeVelgen(auto, "Sport velgen");
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

    public void upgradeKlimaatControle() {
        // return auto;
    }

    public void upgradeStoelen() {
        // auto.setStoel(stoel);
    }

    public void upgradeAudioSysteem() {

    }

    public void setAantalDeuren() {

    }

}
