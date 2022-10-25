
import java.util.List;



/**
 * Builder
 */
public interface Builder {

    Auto bouw(Auto auto, List<Object> opties );

    Auto specialeVelgen(Auto auto, Boolean velg);

    Auto upgradeKlimaatControle(Auto auto, Boolean klimaatcontrole);

    Auto upgradeStoelen(Auto auto, Boolean stoelen);

    Auto upgradeAudioSysteem(Auto auto, Boolean upgradeAudioSysteem);

    Auto setAantalDeuren(Auto auto, Boolean aantalDeuren);

    Auto installeerToeter(Auto auto, String toeterType);

    // void setEvent(String string, Email email);
}