import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Util {

    public void saveFigur(Figur f){
        try{
            BufferedWriter os = new BufferedWriter(new FileWriter("C:\\a\\savedGraphics.txt"));
            os.write(f.prepareToSave());
            os.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public ArrayList<Figur> loadFiur(){
        ArrayList<Figur> figuren = new ArrayList<>();
        try{
            BufferedReader is = new BufferedReader(new FileReader("C:\\a\\savedGraphics.txt"));
            String line;
            while ((line = is.readLine()) != null) {
                figuren.add(interprateData(line));
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        return figuren;
    }

    private Figur interprateData(String line){
        String[] value = line.split(";");
        int x = Integer.parseInt(value[1]);
        int y = Integer.parseInt(value[2]);
        Color color = new Color(Integer.parseInt(value[3]));
        switch (value[0]){
            case "RECHTECK":
                Rechteck rechteck = new Rechteck(x, y, Integer.parseInt(value[4]), Integer.parseInt(value[5]), color);
                return rechteck;
            case "KREIS":
                Kreis kreis = new Kreis(x, y, Integer.parseInt(value[4]), color);
                return kreis;
            case "LINIE":
                Linie linie = new Linie(x, y, Integer.parseInt(value[4]), Integer.parseInt(value[5]), color);
                return linie;
        }
        return null;
    }
}
