package n3exercici6;

public class Zoo {

   private String name;
    private String[] animalsList;

    public Zoo(String name, String[] animalsList)
    {
        this.name = name;

        this.animalsList = animalsList;

    }

    public void printAnimal(int index)
    {
        System.out.println(animalsList[index]);
    }

    public String[] getAnimalsList() {
        return animalsList;
    }
}
