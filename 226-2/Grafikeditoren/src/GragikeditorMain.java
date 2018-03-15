import java.awt.*;

public class GragikeditorMain {
    public static void main(String[] args) {
        Display d = new Display();

        Gruppe kreise = new Gruppe("Kreise");
        Gruppe linien = new Gruppe("Linien");
        Gruppe rechtecke = new Gruppe("Rechtecke");
        Gruppe polygone = new Gruppe("Polygone");



        Rechteck r = new Rechteck(50, 50, Color.BLUE, 40, 40);
        Kreis k = new Kreis(100, 100, Color.PINK, 80);
        Linie l = new Linie(500, 500, Color.ORANGE, 700, 400);
        Polygon p = new Polygon(250, 200, Color.RED, new int[]{250, 100, 300}, new int[]{150, 200, 200});

        rechtecke.add(r);
        linien.add(l);
        kreise.add(k);
        polygone.add(p);

        d.hinzufuegen(kreise);
        d.hinzufuegen(linien);
        d.hinzufuegen(rechtecke);
        d.hinzufuegen(polygone);


    }


}
