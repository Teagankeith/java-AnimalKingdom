package animalKingdom;

import java.util.ArrayList;


public class Main {

    public static void printer(ArrayList<AbstractAnimal> animals, CheckAnimal tester) {
        for (AbstractAnimal animal : animals) {
            if (tester.test(animal)) {
                System.out.println(animal.getname());
            }}
        }
    public static void main(String[] args) {
        ArrayList<AbstractAnimal> animals =  new ArrayList<AbstractAnimal>();


        //Adding Mamals
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        animals.add(panda);
        animals.add(zebra);
        animals.add(koala);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(raccoon);
        animals.add(bigfoot);


        //Adding Birds

        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock =new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(parrot);
        animals.add(swan);

        //Adding Fish

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish= new Fish("Cat Fish", 1817);
        Fish perch = new Fish("Perch", 1758);

        animals.add(salmon);
        animals.add(catfish);
        animals.add(perch);


        System.out.println("\n*** Printing by Discovery Year (Descending)***");

        animals.sort((a1, a2) -> a2.getyeardiscovered() - a1.getyeardiscovered());

        System.out.println();

        animals.forEach(a -> System.out.println(a.getname()));
        

        System.out.print("\n***Printing by Alphabetical name");
        animals.sort((a1, a2) -> a1.getname().compareToIgnoreCase(a2.getname()));

        System.out.println();

        animals.forEach(a -> System.out.println(a.getname()));

        System.out.println("\n*** Printing by how Animals move***");
        animals.sort((a1,a2) -> a1.move().compareToIgnoreCase(a2.move()));

        System.out.println();

        animals.forEach(a -> System.out.println(a.getname()));

        System.out.println("\n*** Printing by what aniamls braethe with Lungs***");

        printer(animals, a -> a.breathe().equals("Lungs"));


        System.out.println("\n*** Printing by what aniamls that breath with lungs and were named in 1758***");

        printer(animals, a -> a.breathe().equals("Lungs") && a.getyeardiscovered() == 1758);


        System.out.println("\n*** Printing by what aniamls that lay eggs and breath with lungs***");

        printer(animals, a -> a.breathe().equals("Lungs") && a.reproduce().equals("eggs"));


        System.out.println("\n*** Printing by what aniamls that were nammed in 1758***");

        printer(animals, a-> a.getyeardiscovered() == 1758);



        
} }



