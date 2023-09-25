import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String yes; // used to control main loop
        Scanner reader = new Scanner(System.in);    // used for receiving input from the user.

        int arraySizeOne;  // variable that the user needs to set for the array sizes.
        int arraySizeTwo;

        SetLibrary sets = new SetLibrary(); // instantiate for set related functions

        // main loop of program
        do {
            // Prompt user for the array sizes and must be less than 50.
            boolean correctSize = false;

            do {
                System.out.print("\nPlease pick a size for the first Array (size must between 1-50): ");
                arraySizeOne = reader.nextInt();
                reader.nextLine();

                if (arraySizeOne <= 0 || arraySizeOne > 50) {
                    System.out.println("Please make sure to correctly set the size in the specified bounds!");
                } else {
                    correctSize = true;
                }
            } while (!correctSize);

            correctSize = false;
            do {
                System.out.print("\nPlease pick a size for the Second Array (size must between 1-50): ");
                arraySizeTwo = reader.nextInt();
                reader.nextLine();

                if (arraySizeTwo <= 0 || arraySizeTwo > 50) {
                    System.out.println("Please make sure to correctly set the size in the specified bounds!");
                } else {
                    correctSize = true;
                }
            } while (!correctSize);

            System.out.println("\n");

            // instantiate the two sets
            arraySet setOne = new arraySet("Set A", arraySizeOne, true);
            arraySet setTwo = new arraySet("Set B", arraySizeTwo, true);

            System.out.println("Union of the two sets");
            // display both sets to know what they are.
            setOne.Display();
            setTwo.Display();
            // union between set one & two
            arraySet unionSet = sets.UnionSet(setOne, setTwo);
            unionSet.Display();

            System.out.println("\n");

            System.out.println("Intersection of the two sets");
            // display both sets to know what they are.
            setOne.Display();
            setTwo.Display();
            // intersection between set one and two
            arraySet intersectionSet = sets.IntersectionSet(setOne, setTwo);
            intersectionSet.Display();

            System.out.println("\n");

            System.out.println("Subset verification");
            // display both sets to know what they are.
            setOne.Display();
            setTwo.Display();
            // subset check between one and two
            sets.SubsetVerify(setOne, setTwo);

            // give user the option to continue testing or not.
            System.out.print("\nWould you like to continue the program, (Y (yes) or N (no)): ");
            yes = reader.nextLine().toLowerCase();
        } while (yes.equals("y") || yes.equals("yes"));
    }
}