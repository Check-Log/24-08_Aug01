import java.util.List;

public class Spell {

    private List<String> listOfMages;
    private int id;
    private String name;

    public Spell(String name) {
        this.name = name;
    }

    public List<String> getListOfMages() {
        return listOfMages;
    }

    public void setListOfMages(List<String> listOfMages) {
        this.listOfMages = listOfMages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
