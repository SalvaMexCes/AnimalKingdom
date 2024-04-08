package animalKingdom;

public abstract class  Animal {

    private final Size size;
    protected String food;

    public int id;
    public static int uniqueID = 0;


    public Animal(String food, Size size){
        this.food = food;
        this.size = size;
        uniqueID++;
        id = uniqueID;
    }

    public Size getSize(){
        return size;
    }

    // 4 pillars of OOP

    //Polymorphism

    public static void printUniqueAnimalMethod(Animal animal){
        if(animal instanceof Dog){
            ((Dog) animal).fetch();
        }

        if(animal instanceof Cat){
            ((Cat) animal).scratch();
        }

    }

    public static void printAnimalSize(Animal animal){
        System.out.println(animal.getSize());
    }



    public void makeSound(){
        System.out.println("unknown animal sound");
    }

    public abstract void printAnimalFood(); // signature


}
