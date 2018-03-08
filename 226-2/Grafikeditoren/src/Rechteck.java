import java.awt.*;

public class Rechteck extends Figur {
    private int breite;
    private int hoehe;

    public Rechteck(int x, int y, Color color, int breite, int hoehe) {
        super(x, y, color);
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    @Override
    public void zeichne(Graphics g) {
        g.drawRect(getX(), getY(), breite, hoehe);
        g.setColor(getColor());
        g.fillRect(getX(), getY(), breite, hoehe);
    }
}
