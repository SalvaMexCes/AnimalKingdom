package animalKingdom;

public class RoboDog extends Robot implements Pet{


    public RoboDog() {
        super(Size.MEDIUM);
    }

    @Override
    public void greetOwner() {
        System.out.println("rolls on wheel and lights up");
    }
}
