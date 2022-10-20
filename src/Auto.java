/**
 * Auto
 */
public interface Auto {

    String getType();

    String getModel();

    void setVelgen(String velg);
    String getVelgen();

    void setKlimaatControle(String klimaatControle);
    String getKlimaatControle();

    void setAudioSysteem(String audioSysteem);

    void setAantalDeuren(int aantalDeuren);
    int getAantalDeuren();

    void show();

    void setSoortStoelen(String stoel);
    String getSoortStoelen();
    // public Auto(AutoFactory factory) {
    // factory.
    // }

    // public void bouw() {
    // bouwmotor();
    // }

}