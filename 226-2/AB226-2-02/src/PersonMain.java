abstract class Person {
    private String name;
    private String vorname;
    private int personalNummer;
    private int alter;

    Person(){

    }

    Person(String name, String vorname, int personalNummer, int alter){
        this.name = name;
        this.vorname = vorname;
        this.personalNummer = personalNummer;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getPersonalNummer() {
        return personalNummer;
    }

    public void setPersonalNummer(int personalNummer) {
        this.personalNummer = personalNummer;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void print(){
        System.out.print("Vorname: " + vorname + " Nachname: " + name + " Personalnummer: " + personalNummer);
    }

    public abstract int berechneFerien();
}

class Firma {
    private Person[] mitarbeiter;

    public Firma (Person[] p) {
        mitarbeiter = p;
    }

    public Person[] getMitarbeiter() {
        return mitarbeiter;
    }

    public void setMitarbeiter(Person[] mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }
}

class Chef extends Person {
    String abteilung;

    Chef(String name, String vorname, int personalNummer, int alter, String abteilung){
        super(name, vorname, personalNummer, alter);
        this.abteilung = abteilung;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" Abteilung: " + abteilung);
    }

    @Override
    public int berechneFerien() {
        if(getAlter() >= 55){
            return 6;
        }
        if(getAlter() >= 45){
            return 5;
        }
        return 4;
    }
}

class Fachangestellter extends Person {
    Chef vorgesetzter;

    Fachangestellter(String name, String vorname, int personalNummer, int alter, Chef chef){
        super(name, vorname, personalNummer, alter);
        this.vorgesetzter = chef;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" Vorgesetzter: " + vorgesetzter.getName() + " " + vorgesetzter.getVorname());
    }

    @Override
    public int berechneFerien() {
        if(getAlter() >= 60){
            return 6;
        }
        if(getAlter() >= 50){
            return 5;
        }
        return 4;
    }
}

class Lehrnende extends Person {
    int lehrjahr;

    Lehrnende(String name, String vorname, int personalNummer, int alter, int lehrjahr){
        super(name, vorname, personalNummer, alter);
        this.lehrjahr = lehrjahr;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" Lehrjahr: " + lehrjahr);
    }

    @Override
    public int berechneFerien() {
        return 5;
    }
}

public class PersonMain {
    public static void main (String args[]) {

        Firma f = new Firma(
                new Person[] {new Chef("Sattler", "Beatrice",1, 45, "Verkauf")} );

        Chef c = new Chef("Borter", "Florian", 2, 16,"Informatik");
        c.print();
        System.out.println(c.berechneFerien());
        Fachangestellter fa = new Fachangestellter("Cornu", "Pascal", 3,17, c);
        fa.print();
        System.out.println(fa.berechneFerien());
        Lehrnende l = new Lehrnende("Jolie", "Angelina", 4 , 15, 2);
        l.print();
        System.out.println(l.berechneFerien());

    }
}
