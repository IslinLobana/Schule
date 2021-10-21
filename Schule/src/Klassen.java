public class Klassen {
    int _klassengroesse;
    Lehrers _lehrer;
    Schuelers[] _schuelers;
    Schuelers _schueler;

    public Klassen (int klassengroesse, Lehrers lehrer, Schuelers schueler) {
        this.setKlassengroesse(klassengroesse);
        this.setLehrers(lehrer);
        this.setSchuelers(schueler);
    }
public void setKlassengroesse(int klassengroesse) {
    _klassengroesse = klassengroesse;
}
public void setLehrers(Lehrers lehrer) {
    _lehrer = lehrer;
}
public void setSchuelers(Schuelers schueler) {
    _schueler = schueler;
}
public int getKlassengroesse() {
    return _klassengroesse;
}
public Lehrers getLehrers() {
    return _lehrer;
}
public Schuelers getSchuelers() {
    return _schueler;
}
}