package n3exercici4;

public class Tree {

    private String species;
    private double height;

    public Tree(String species, double height)
    {
        this.species  = species;
        this.height = height;
    }

    public String getSpecies() {
        return species;
    }

    public double getHeight() {
        return height;
    }
}
