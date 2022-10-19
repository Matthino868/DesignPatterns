import java.util.List;

/**
 * Builder
 */
public interface Builder {

    Auto bouw(Auto auto, List<Object> opties );

    void specialeVelgen();

    void upgradeKlimaatControle();

    void upgradeStoelen();

    void upgradeAudioSysteem();

    void setAantalDeuren();

}