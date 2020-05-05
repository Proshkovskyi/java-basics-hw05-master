import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zoo {

    /**
     * Feeds different bird sections of the zoo.
     *
     * @param list list of birds of particular type.
     */

    public static void feed(List<? extends Bird> list) {
        System.out.println("Feeding birds");

        printBirds(list);
        list.forEach(Bird::eat);
    }

    /**
     * Adds birds to a flying section of the zoo.
     *
     * @param list list of birds of particular type.
     * @param bird a new bird.
     */

    public static void acceptBird(List<? super FlyingBird> flyingBird, FlyingBird bird) {
        System.out.println("Accepting a bird to a section");
        bird.checkWings();
        flyingBird.add(bird);
        System.out.println(bird);
    }

    /**
     * Adds bird to the general list.
     *
     * @param list    list of birds.
     * @param newBird bird to add.
     */
    public static void registerBird(List<Bird> newBirds, Bird newBird) {
        System.out.println("Adding a bird to the birds list");
        newBirds.add(newBird);
        printBirds(newBirds);
    }

    private static void printBirds(List<?> listOfBirds) {
        for (Object b : listOfBirds) {
            System.out.println(b);
        }
    }
}