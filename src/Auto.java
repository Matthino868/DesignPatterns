// package Factory;
/**
 * Auto
 */
public interface Auto {
    void show();
    void toeter();

    String getType();
    String getModel();

    void setVelgen(String velg);
    String getVelgen();

    void setKlimaatControle(String klimaatControle);
    String getKlimaatControle();

    void setAudioSysteem(String audioSysteem);
    String getAudioSysteem();
    
    void setAantalDeuren(int aantalDeuren);
    int getAantalDeuren();
    
    void setSoortStoelen(String stoel);
    String getSoortStoelen();

    void setToeter(Toeter toeter);
    Toeter getToeter();
    // public Auto(AutoFactory factory) {
    // factory.
    // }

    // public void bouw() {
    // bouwmotor();
    // }

}