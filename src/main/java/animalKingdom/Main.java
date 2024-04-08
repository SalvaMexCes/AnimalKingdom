package animalKingdom;

public class Main {
    public static void main(String[] args) {


        Animal dog = new Dog("Doggie treats", Size.LARGE);
        Animal cat = new Cat("Fish", Size.SMALL);
        Robot roboDog = new RoboDog();

        Animal.printAnimalSize(dog);
        Animal.printAnimalSize(cat);
        Robot.printSizeDescription(roboDog);

        /*
        Dog dog = new Dog("bones");
        System.out.println(dog.id); // 1

        Dog dog2 = new Dog("bones thugs N harmony");
        System.out.println(dog2.id); // 2

        Dog dog3 = new Dog("bones thugs N harmony");
        System.out.println(dog3.id); // 3

        //dog.food = "cookies"; // protected fields due to inheritance
        //dog.makeSound();

        Cat cat = new Cat("milk");
        System.out.println(cat.id); // 4
        System.out.println("=========");
        System.out.println(dog.id); //4

       // cat.makeSound();

        //System.out.println("=========");
        //Polymorphism
        Animal dogToCat = new Dog("bones");
        dogToCat = new Cat("worms");
        // ((Cat)dogToCat).scratch();

        System.out.println("==printUniqueAnimalMethod==");
        //Classname.staticMethodName():
        Animal.printUniqueAnimalMethod(cat);

        System.out.println("========interface========");

        RoboDog roboDog = new RoboDog();

        //Pet[] pets = new Pet[3];
        Pet[] anArrayOfPets = {cat, dog, roboDog}; //array literal
        Pet.printPetGreeting(anArrayOfPets);

        roboDog.printPetClassName(roboDog);

        */

    }
}