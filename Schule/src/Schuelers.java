public class Schuelers {
    String _vorname;
    String _nachname;



    public Schuelers (String vorname, String nachname){
        this.setVorname(vorname);
        this.setNachname(nachname);

    }



    public void setNachname(String nachname) {
        _nachname = nachname;
    }
    public void setVorname(String vorname) {
        _vorname = vorname;
    }

public String getNachname() {
    return _nachname;
}
public String getVorname() {
    return _vorname;
}


}