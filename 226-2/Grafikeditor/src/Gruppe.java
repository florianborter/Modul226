import java.util.ArrayList;
import java.util.List;

public class Gruppe {
    private String name;
    private List<Figur> figuren = new ArrayList<>();

    public Gruppe(String name){
        this.name = name;
    }

    public void add(Figur f){
        figuren.add(f);
    }

    public void getElement(int index){
        figuren.get(index);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Figur> getFiguren() {
        return figuren;
    }

    public void setFiguren(List<Figur> figuren) {
        this.figuren = figuren;
    }
}
