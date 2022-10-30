/**
 * Auto
 */
public interface Auto {
    void show();
    void toeter();

    void setBestelNummer(String bestelNummer);
    String getBestelNummer();

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
    String getToeter();
}