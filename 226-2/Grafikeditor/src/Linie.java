import java.awt.*;

public class Linie extends Figur {

    int xEnd;
    int yEnd;

    public Linie(int x, int y, int xEnd, int yEnd, Color color){
        super(x, y, color);
        this.xEnd = xEnd;
        this.yEnd = yEnd;
    }

    public int getxEnd() {
        return xEnd;
    }

    public void setxEnd(int xEnd) {
        this.xEnd = xEnd;
    }

    public int getyEnd() {
        return yEnd;
    }

    public void setyEnd(int yEnd) {
        this.yEnd = yEnd;
    }

    @Override
    public void zeichne(Graphics g) {
        g.setColor(getColor());
        g.drawLine(getX(), getY(), xEnd, yEnd);
    }

    @Override
    public String prepareToSave() {
        return Figurarten.LINIE.toString() + ";" + getX() + ";" + getY() + ";" + getColor().toString() + ";" + xEnd + ";" + yEnd;
    }
}
