public class App {
    static Ags[] _ags;
    static Klassen[] _klassen;
    static Lehrers[] _lehrers;
    static Schuelers[] _schuelers;
    static Schulen[] _schulen;

    public static void addAg(Ags ags){
        addObject(ags, getALLAgs());
    }
    public static Ags[] getALLAgs(){
        return _ags;
    }
    public static void addKlasse(Klassen klassen){
        addObject(klassen, getALLKlassen());
    }
    public static Klassen[] getALLKlassen(){
        return _klassen;
    }
    public static void addLehrer(Lehrers lehrers){
        addObject(lehrers, getALLLehrers());
    }
    public static Lehrers[] getALLLehrers(){
        return _lehrers;
    }
    public static void addSchueler(Schuelers schuelers){
        addObject(schuelers, getALLSchuelers());
    }
    public static Schuelers[] getALLSchuelers(){
        return _schuelers;
    }
    public static void addSchule(Schulen schulen){
        addObject(schulen, getALLSchulen());
    }
    public static Schulen[] getALLSchulen(){
        return _schulen;
    }

    public static void addObject(Object ele, Object[] array){
        int i = 0;
        for (Object a :array){
            if(a == null){
                array[i] = ele;
                break;
            }
            i = i+ 1;
        }
    }
    public static void main(String[] args) throws Exception {





        Menu menu = new Menu();
        menu.startMenu();
    }

}
