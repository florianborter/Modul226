import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Zeichnung extends JFrame{
    private List<Figur> figuren = new ArrayList<>();

    public void zeichneFiguren(Graphics g){
        figuren.forEach(f -> f.zeichne(g));
    }

    public List<Figur> getFiguren() {
        return figuren;
    }

    public void setFiguren(List<Figur> figuren) {
        this.figuren = figuren;
    }
}
