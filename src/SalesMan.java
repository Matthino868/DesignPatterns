import java.util.HashMap;
import java.util.Map;

/*
 * SalesMan
 */
 
public class SalesMan {

    Map<String, Email> klanten = new HashMap<>();

    public void subscribe(String bestelNummer, Email email) {
        this.klanten.put(bestelNummer, email);
    }

    public void unsubscribe(String bestelNummer) {
        klanten.remove(bestelNummer);
    }

    public void notify(String bestelNummer) {
        Email email = klanten.get(bestelNummer);
        email.update(bestelNummer);

    }
}