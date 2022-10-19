import java.util.List;

/**
 * Builder
 */
public interface Builder {

    Auto bouw(Auto auto, List<Object> opties );

    Auto specialeVelgen(Auto auto, String velg);

    void upgradeKlimaatControle();

    void upgradeStoelen();

    void upgradeAudioSysteem();

    // void setAantalDeuren();

}