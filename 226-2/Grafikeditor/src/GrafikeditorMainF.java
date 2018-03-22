import java.awt.*;
import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GrafikeditorMainF {
    public static void main(String[] args) {
        Util util = new Util();
        Display display = new Display();
        Gruppe rechtecke = new Gruppe("Rechtecke");

        Rechteck rechteck = new Rechteck(50, 50, 200, 50, Color.BLUE);
        Kreis kreis = new Kreis(100, 100, 200, Color.YELLOW);
        Linie linie = new Linie(400, 0, 200, 200, Color.RED);
        ArrayList<Integer> xPoints = new ArrayList<>();
        xPoints.add(750);
        xPoints.add(426);
        xPoints.add(354);
        ArrayList<Integer> yPoints = new ArrayList<>();
        yPoints.add(200);
        yPoints.add(213);
        yPoints.add(177);
        Polygon polygon = new Polygon(0, 0, Color.ORANGE, xPoints, yPoints);


        //display.hinzufuegen(rechteck);
        display.hinzufuegen(kreis);
        display.hinzufuegen(linie);
        display.hinzufuegen(polygon);

        rechtecke.add(new Rechteck(500, 0, 40, 40, Color.BLACK));
        rechtecke.add(new Rechteck(400, 0, 40, 40, Color.GREEN));
        display.hinzufuegenAusGruppe(rechtecke);

        util.saveFigur(rechteck);
        util.loadFiur()
                .forEach(f -> display.hinzufuegen(f));
    }
}
