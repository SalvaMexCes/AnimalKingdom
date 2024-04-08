package animalKingdom;

public class Cat extends Feline implements Pet{



    public Cat(String food, Size size) {
        super(food, size);
    }

    public void makeSound(){
        System.out.println("meow meow");
    }

    @Override
    public void printAnimalFood() {
        System.out.println(this.food);
    }


    public void scratch(){
        System.out.println("I am a cat. I scratch things");
    }

    @Override
    public void greetOwner() {
        System.out.println("lick face");
    }
}
