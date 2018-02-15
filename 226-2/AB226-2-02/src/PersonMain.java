class Person {
    private String name;
    private String vorname;
    private int personalNummer;

    Person(){

    }

    Person(String name, String vorname, int personalNummer){
        this.name = name;
        this.vorname = vorname;
        this.personalNummer = personalNummer;
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

}

class Firma {
    private Person[] mitarbeiter;

    public Firma (Person[] p) {
        mitarbeiter = p;
    }
}

class Chef extends Person {
    String abteilung;

    Chef(String name, String vorname, int personalNummer, String abteilung){
        super(name, vorname, personalNummer);
        this.abteilung = abteilung;
    }
}

class Fachangestellter extends Person {
    Chef vorgesetzter;

    Fachangestellter(String name, String vorname, int personalNummer, Chef chef){
        super(name, vorname, personalNummer);
        this.vorgesetzter = chef;
    }
}

public class PersonMain {
    public static void main (String args[]) {
        /*Chef personal3 = new Chef("Sattler", "Beatrice", 0,"Verkauf");
        Fachangestellter personal1 = new Fachangestellter("Klein", "Thomas", 1, personal3);
        Fachangestellter personal2 = new Fachangestellter("","",2, personal3);
        Person personal4 = new Person();*/

        Firma f = new Firma(
                new Person[] {new Chef("Sattler", "Beatrice",25, "Verkauf")} );


        /*personal1.vorgesetzter=personal3; 		//*1
        personal4 = personal1; 				//*2
        personal4.vorgesetzter = personal3; 		//*3
        personal1 = personal4; 				//*4
        personal1 = (Fachangestellter) personal4; 	//*5*/

    }
}
