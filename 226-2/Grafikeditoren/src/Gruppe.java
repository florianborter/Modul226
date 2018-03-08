import java.util.ArrayList;
import java.util.List;

public class Gruppe {

    private String name;
    private List<Figur> figures = new ArrayList<>();

    public Gruppe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Figur f) {
        figures.add(f);
    }
}
