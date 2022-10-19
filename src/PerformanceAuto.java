/**
 * PerformanceAuto
 */
public abstract class PerformanceAuto implements Auto {
    String model = "performance";
    String velgen;
    String klimaatControle;
    String stoelen;
    String audioSysteem;
    int aantalDeuren;
    

    public void setVelgen(String _velgen){
        this.velgen = _velgen;
    }

    public void setKlimaatControle(String _klimaatControl){
        this.klimaatControle = _klimaatControl;
    }

    public void setAudioSysteem(String _audioSysteem){
        this.audioSysteem = _audioSysteem;
    }

    public void setAantalDeuren(int _aantalDeuren){
        this.aantalDeuren = _aantalDeuren;
    }

    public void setStoel(String _stoel){
        this.stoelen = _stoel;
    }
}