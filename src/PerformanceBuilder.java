import java.util.List;

/**
 * PerformanceBuilder
 */
public class PerformanceBuilder implements Builder{
    
    public PerformanceAuto bouw(Auto auto, List<Object> opties ) {

        specialeVelgen(auto, opties.get(3));
        return null;
    }

    public void specialeVelgen(Auto auto, boolean bool){
        if(bool){
            auto.setVelgen("Sportvelgen");
        }
        else{
            auto.setVelgen("Normalevelgen");
        }
    }

    public void upgradeKlimaatControle(Auto auto){

    }

    public void upgradeStoelen(Auto auto){

    }

    public void upgradeAudioSysteem(Auto auto){

    }

    public void setAantalDeuren(Auto auto){

    }


}
