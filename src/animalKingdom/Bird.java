package animalKingdom;

public class Bird extends AbstractAnimal{
    public Bird(String name, int yeardiscovered){
        super(name, yeardiscovered);
    }

    @Override
    public String move(){
        return "This bird flew!";
    }

    @Override
    public String breathe(){
        return "This bird breathed!";
    }

    @Override
    public String reproduce(){
        return "eggs";
    }
    
    public String toString(){
        return "Bird's Name: " + name + ", Year Discovered: " + yeardiscovered;
    }
}