import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Polygon extends Figur {
    List<Integer> xPoints = new ArrayList<>();
    List<Integer> yPoints = new ArrayList<>();

    public Polygon() {
    }

    public Polygon(int x, int y, Color color, ArrayList<Integer> xPoints, ArrayList<Integer> yPoints) {
        super(x, y, color);
        this.xPoints = xPoints;
        this.yPoints = yPoints;
    }

    @Override
    public void zeichne(Graphics g) {
        if(xPoints.size() == yPoints.size()){
            int[] xArray = new int[xPoints.size()];
            int[] yArray = new int[xPoints.size()];
            for (int i = 0; i < xPoints.size(); i++){
                xArray[i] = xPoints.get(i);
                yArray[i] = yPoints.get(i);
            }

            g.setColor(getColor());
            g.fillPolygon(xArray, yArray, xPoints.size());
        }
    }

    public List<Integer> getxPoints() {
        return xPoints;
    }

    public void setxPoints(List<Integer> xPoints) {
        this.xPoints = xPoints;
    }

    public List<Integer> getyPoints() {
        return yPoints;
    }

    public void setyPoints(List<Integer> yPoints) {
        this.yPoints = yPoints;
    }
}
