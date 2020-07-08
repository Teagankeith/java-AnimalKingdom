package animalKingdom;

public class Mammal extends AbstractAnimal {
    public Mammal(String name, int yeardiscovered) {
        super(name, yeardiscovered);
    }

    @Override 
    public String move() {
        return "This Mammal just walked!";
    }

    @Override
    public String breathe() {
        return "Lungs";
    }

    @Override
    public String reproduce(){
        return "This Mammal just reproduced!";
    }


    @Override
    public String toString(){
        return "Mammal's Name: " + name + ", Year Discovered: " + yeardiscovered;
    }
}