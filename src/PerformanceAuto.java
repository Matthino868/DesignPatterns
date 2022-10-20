/**
 * PerformanceAuto
 */
public abstract class PerformanceAuto implements Auto {
    String model = "performance";
    String velgen;
    String klimaatControle;
    String soortStoelen;
    String audioSysteem;
    int aantalDeuren;
    Toeter toeter;

    @Override
    public void show() {
        System.out.println("Dit is het " + getType() + " " + getModel() + " model");
        System.out.println("Velgen: " + getVelgen());
        System.out.println("Klimaat controle: " + getKlimaatControle());
        System.out.println("Stoelen: " + getSoortStoelen());
        System.out.println("Audio: " + getAudioSysteem());
        System.out.println("Aantal deuren: "+ getAantalDeuren());
    }

    public void toeter(){
        toeter.toeter();
    }


    public String getModel() {
        return this.model;
    }

    public void setVelgen(String _velgen) {
        this.velgen = _velgen;
    }

    public String getVelgen() {
        return this.velgen;
    }

    public void setKlimaatControle(String _klimaatControl) {
        this.klimaatControle = _klimaatControl;
    }

    public String getKlimaatControle() {
        return this.klimaatControle;

    }

    public void setAudioSysteem(String _audioSysteem) {
        this.audioSysteem = _audioSysteem;
    }
    public String getAudioSysteem() {
        return audioSysteem;
    }

    public void setAantalDeuren(int _aantalDeuren) {
        this.aantalDeuren = _aantalDeuren;
    }
    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public void setSoortStoelen(String _stoel) {
        this.soortStoelen = _stoel;
    }

    public String getSoortStoelen() {
        return this.soortStoelen;
    }

    public void setToeter(Toeter toeter){
        this.toeter = toeter;
    }

    public Toeter getToeter(){
        return toeter;
    }
}
    