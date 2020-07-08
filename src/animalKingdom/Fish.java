package animalKingdom;

public class Fish extends AbstractAnimal{
    public Fish(String name, int yeardiscovered){
        super(name, yeardiscovered);
    }

    @Override
    public String move(){
        return "This fish swam!";
    }

    @Override
    public String breathe(){
        return "This fish breathed with it's gills!!";
    }

    @Override
    public String reproduce(){
        return "eggs";
    }

    public String toString(){
        return "Fish's Name: " + name + ", Year Discovered: " + yeardiscovered;
    }
}