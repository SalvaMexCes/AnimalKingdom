package animalKingdom;

public class Robot {

    private Size size;

    public Robot(Size size) {
        this.size = size;
    }

    public static void printSizeDescription(Robot animal) {
        switch (animal.size) {
            case SMALL:
                System.out.println("Animal is small.");
                break;
            case MEDIUM:
                System.out.println("Animal is medium-sized.");
                break;
            case LARGE:
                System.out.println("Animal is large.");
                break;
            default:
                System.out.println("Unknown size.");
        }
    }

}
