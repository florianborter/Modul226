import java.awt.*;

public class Kreis extends Figur {
    int radius;

    public Kreis(int x, int y, int radius, Color color){
        super(x, y, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void zeichne(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), radius, radius);
    }
}
