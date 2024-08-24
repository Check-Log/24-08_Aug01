package Practicals01;

public class Cherub {

    String name;
    String species;
    String alignment;

    public Cherub(String name, String species, String alignment) {
        this.name = name;
        this.species = species;
        this.alignment = alignment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }
}
