package animalKingdom;

public abstract class AbstractAnimal {
    private static int maxId= 0;
    protected int id;
    protected String name;
    protected int yeardiscovered;


    public AbstractAnimal(String name, int yeardiscovered) {
       maxId++;
       id = maxId;
       this.name = name;
       this.yeardiscovered = yeardiscovered;
    }


    public int getyeardiscovered() {
        return yeardiscovered;
    }

    public String getname() {
        return name;
    }

    public String eat(){
        return "This Animal just ate!";
    }

    public String move(){
        return "This Animal just moved!";
    }

    public String breathe() {
        return "This Animal just breathed!";
    }

    public String reproduce() {
        return "This Animal just reproduced!";
    }
}


