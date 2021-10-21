import java.util.Scanner;
public class Menu {
    Scanner _scanner;

    public Menu(){
        this.setScanner(new Scanner(System.in));
    }
    public void setScanner(Scanner scanner) {
        _scanner = scanner;
    }
    public Scanner getScanner() {
        return _scanner;
    }
    public void startMenu(){
        System.out.println("Bitte wähle aus: ");
        System.out.println("(1) Neue AG");
        System.out.println("(2) Neue Klasse");
        System.out.println("(3) Neuer Lehrer");
        System.out.println("(4) Neuer Schüler");
        System.out.println("(5) Zeige alle AGs");
        System.out.println("(6) Zeige alle Klassen");
        System.out.println("(7) Zeige alle Lehrer");
        System.out.println("(8) Zeige alle Schüler");
        System.out.println("(9) Zeige alle Schulen");
        String choice = getScanner().nextLine();
        System.out.println("Deine Auswahl ist: " + choice);
    
    if(choice.equals("1")){
        createAgMenu();
    }
    else if(choice.equals("2")){
        createKlasseMenu();
    }
    else if(choice.equals("3")){
        createLehrerMenu();
    }
    else if(choice.equals("4")){
        createSchuelerMenu();
    }
    else if(choice.equals("5")){
        showAgs();
    }
    else if(choice.equals("6")){
        showKlassen();
    }
    else if(choice.equals("7")){
        showLehrers();
    }
    else if(choice.equals("8")){
        showSchuelers();
    }
    else{
        System.out.println("Bitte nur 1-9 eingeben");
    }
    startMenu();
}

    public void showAgs(){
        for (Ags ags : App.getALLAgs()){
            if(ags != null){
                System.out.println("AGs" + ags.getName() + "Lehrer: " + ags.getLehrers().getVorname() + " " + ags.getLehrers().getNachname() + "Uhrzeit: " + ags.getUhrzeit());
            }
        }  
    }
    public void showKlassen(){
        for (Klassen klassen : App.getALLKlassen()){
            if(klassen != null){
                System.out.println("Größe" + klassen.getKlassengroesse() + "Lehrer: " + klassen.getLehrers().getVorname() + " " + klassen.getLehrers().getNachname() + "Schüler: " + klassen.getSchuelers().getVorname() + " " + klassen.getSchuelers().getNachname());
            }
        }  
    }
    public void showLehrers(){
        for (Lehrers lehrers : App.getALLLehrers()){
            if(lehrers != null){
                System.out.println("Vorname" + lehrers.getVorname() + " " + lehrers.getNachname());
            }
        }  
    }
    public void showSchuelers(){
        for (Schuelers schuelers: App.getALLSchuelers()){
            if(schuelers != null){
                System.out.println("Vorname: " + schuelers.getVorname() + "Nachname:  " + schuelers.getNachname());
            }
        }  
    }
    public void showSchulen(){
        for (Schulen schulen: App.getALLSchulen()){
            if(schulen != null){
                System.out.println("Name: " + schulen.getName() + "Lehrer: " + schulen.getStandort());
            }
        }  
    }
    public void createAgMenu(){
        System.out.println("Neue AG erstellen: ");
        System.out.println("Namen erstellen: ");
        String choicename = getScanner().nextLine();
        int a = 0;
        System.out.println("Lehrer auswählen: ");
        for (Lehrers lehrers : App.getALLLehrers()){
            if(lehrers != null){
                System.out.println(a + lehrers.getVorname() + " " + lehrers.getNachname());
                a++;
            }
        }  
        String lehrerchoice = getScanner().next();
        int lehrer_index = Integer.valueOf(lehrerchoice);
        System.out.println(App.getALLLehrers());
        a = 0;

        System.out.println("Uhrzet erstellen: ");
        String choiceuhrzeit = getScanner().nextLine();

        System.out.println("Es wurde eine neue AG eingetragen.");
        App.addAg(new Ags(choicename, App.getALLLehrers()[lehrer_index], choiceuhrzeit));
        System.out.println(App.getALLAgs());
    }

    public void createKlasseMenu(){
        System.out.println("Neue Klasse erstellen: ");
        System.out.println("Klassengröße erstellen: ");
        String choiceklassengroesse = getScanner().nextLine();
        int klassengroesse = Integer.valueOf(choiceklassengroesse);
        int a = 0;
        System.out.println("Lehrer auswählen: ");
        for (Lehrers lehrers : App.getALLLehrers()){
            if(lehrers != null){
                System.out.println(a + lehrers.getVorname() + " " + lehrers.getNachname());
                a++;
            }
        }  
        String lehrerchoice = getScanner().next();
        int lehrer_index = Integer.valueOf(lehrerchoice);
        System.out.println(App.getALLLehrers());
        a = 0;

        int b = 0;
        System.out.println("Schüler auswählen: ");
        for (Schuelers schuelers : App.getALLSchuelers()){
            if(schuelers != null){
                System.out.println(b + schuelers.getVorname() + " " + schuelers.getNachname());
                b++;
            }
        }  
        String schuelerschoice = getScanner().next();
        int schueler_index = Integer.valueOf(schuelerschoice);
        System.out.println(App.getALLLehrers());
        b = 0;



        System.out.println("Es wurde eine neue Klasse eingetragen.");
        App.addKlasse(new Klassen(klassengroesse, App.getALLLehrers()[lehrer_index], App.getALLSchuelers()[schueler_index]));
        System.out.println(App.getALLKlassen());
    }
    public void createLehrerMenu(){
        System.out.println("Neuen Lehrer erstellen: ");
        System.out.println("Vorname eingeben: ");
        String choicevorname = getScanner().nextLine();
        System.out.println("Nachname eingeben: ");
        String choicenachname = getScanner().nextLine();
        System.out.println("Es wurde ein neuer Lehrer eingetragen.");
        App.addLehrer(new Lehrers(choicevorname, choicenachname));
        System.out.println(App.getALLLehrers());
    }

        public void createSchuelerMenu(){
            System.out.println("Neuen Schueler erstellen: ");
            System.out.println("Vorname eingeben: ");
            String choicevorname = getScanner().nextLine();
            System.out.println("Nachname eingeben: ");
            String choicenachname = getScanner().nextLine();
            System.out.println("Es wurde ein neuer Lehrer eingetragen.");
            App.addSchueler(new Schuelers(choicevorname, choicenachname));
            System.out.println(App.getALLSchuelers());
        }
}
