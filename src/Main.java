import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String yes; // used to control main loop
        Scanner reader = new Scanner(System.in);    // used for receiving input from the user.

        int arraySize;  // variable that the user needs to set for the array sizes.

        // main loop of program
        do {
            // Prompt user for the array sizes and must be less than 50.
            boolean correctSize = false;
            do {
                System.out.print("\nPlease pick a size for the first Array (size must between 1-50): ");
                arraySize = reader.nextInt();
                reader.nextLine();

                if (arraySize <= 0 || arraySize > 50) {
                    System.out.println("Please make sure to correctly set the size in the specified bounds!");
                } else {
                    correctSize = true;
                }
            } while (!correctSize);

            // Create the Two sets
            arraySet setOne = new arraySet(arraySize);
            arraySet setTwo = new arraySet(arraySize);

            //System.out.println(setOne.set.length);
            setOne.Display();

            // give user the option to continue testing or not.
            System.out.print("\nWould you like to continue the program, (Y (yes) or N (no)): ");
            yes = reader.nextLine().toLowerCase();
        } while (yes.equals("y") || yes.equals("yes"));
    }
}