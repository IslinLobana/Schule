public class Schulen{
    String _name;
    String _standort;


    public Schulen (String name, String standort) {
        this.setName(name);
        this.setStandort(standort);

    }
    public void setName(String name) {
        _name = name;
    }
    public void setStandort(String standort) {
        _standort = standort;
    }
    public String getName() {
        return _name;
    }
    public String getStandort() {
        return _standort;
    }
}