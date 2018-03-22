import java.awt.*;
import java.io.Serializable;

public class Rechteck extends Figur{
    private int hoehe;
    private int breite;

    public Rechteck(int x, int y, int hoehe, int breite, Color color){
        super(x, y, color);
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public int getHoehe() {
        return hoehe;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    @Override
    public void zeichne(Graphics g) {
        g.drawRect(getX(), getY(), breite, hoehe); //Macht einen leeren Rand
        g.setColor(getColor());
        g.fillRect(getX(), getY(), breite, hoehe); //Füllt es aus
    }

    @Override
    public String prepareToSave() {
        return Figurarten.RECHTECK.toString() + ";" + getX() + ";" + getY() + ";" + getColor().getRGB() + ";" + breite + ";" + hoehe;
    }
}
