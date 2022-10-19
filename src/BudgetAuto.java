/**
 * BudgetAuto
 */
public abstract class BudgetAuto implements Auto {
    String model = "performance";
    String velgen;
    String klimaatControle;
    String stoelen;
    String audioSysteem;
    int aantalDeuren;
    

    public void setVelgen(String _velgen){
        this.velgen = _velgen;
    }

    // public String getVelgen(){
    //     return this.velgen;
    // }

    public void setKlimaatControle(String _klimaatControl){
        this.klimaatControle = _klimaatControl;
    }

    public String getKlimaatControle(){
        return klimaatControle;
    }

    public void setAudioSysteem(String _audioSysteem){
        this.audioSysteem = _audioSysteem;
    }

    public String getAudioSysteem(){
        return audioSysteem;
    }

    public void setAantalDeuren(int _aantalDeuren){
        this.aantalDeuren = _aantalDeuren;
    }

    public int getAantalDeuren(){
        return aantalDeuren;
    }

    public void setStoel(String _stoel){
        this.stoelen = _stoel;
    }

    public String getStoel(){
        return stoelen;
    }
}