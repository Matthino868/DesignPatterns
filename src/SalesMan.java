import java.util.HashMap;
import java.util.Map;

/*
 * SalesMan
 */

public class SalesMan {

    Map<String, Email> bestelNummers = new HashMap<>();

    public void subscribe(String bestelNummer, Email email) {
        this.bestelNummers.put(bestelNummer, email);
    }

    public void unsubscribe(String bestelNummer) {
        this.bestelNummers.remove(bestelNummer);
    }

    public void notify(String bestelNummer) {
        Email email = bestelNummers.get(bestelNummer);
        email.update(bestelNummer);
    }
}