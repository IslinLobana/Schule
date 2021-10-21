public class Ags{
    String _name;
    Lehrers _lehrer;
    String _uhrzeit;

    public Ags (String name, Lehrers lehrer, String uhrzeit) {
        this.setName(name);
        this.setLehrers(lehrer);
        this.setUhrzeit(uhrzeit);
    }
    public void setLehrers(Lehrers lehrer) {
        _lehrer = lehrer;
    }
    public void setName(String name) {
        _name = name;
    }
    public void setUhrzeit(String uhrzeit) {
        _uhrzeit = uhrzeit;
    }
    public Lehrers getLehrers() {
        return _lehrer;
    }
    public String getName() {
        return _name;
    }
    public String getUhrzeit() {
        return _uhrzeit;
    }

}