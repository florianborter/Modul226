import java.awt.*;
public class Polygon extends Figur{

    private int[] xPoints;
    private int[] yPoints;

    public Polygon(int x, int y, Color color, int[] xPoints, int[] yPoints) {
        super(x, y, color);
        this.xPoints = xPoints;
        this.yPoints = yPoints;
    }

    @Override
    public void zeichne(Graphics g) {
        g.drawPolygon(xPoints, yPoints, xPoints.length);
        g.setColor(getColor());
        g.fillPolygon(xPoints, yPoints, xPoints.length);
    }
}
