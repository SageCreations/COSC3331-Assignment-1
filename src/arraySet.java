import java.util.Random;

public class arraySet {
    //TODO: make these private before turning in!!!
    private String setName;
    private int[] set;
    private int nElems;

    public arraySet(String name, int maxSize, boolean populate) {
        setName = name;
        set = new int[maxSize];
        nElems = 0;

        //Go ahead and populate the array on instantiation since there is only one set of rules for the sets.
        if (populate) {
            PopulateArray();
        }
    }

    public int[] GetArray() {
        return set;
    }

    public int GetNumElems() {
        return nElems;
    }

    public void insert(int value)
    {
        set[nElems] = value;
        nElems++;
    }

    public void Display()
    {
        System.out.print(setName + ": ");
        for (int j = 0; j<nElems; j++) {
            System.out.print(set[j] + " ");
        }
        System.out.println(" ");
    }

    private void PopulateArray() {
        Random Rand = new Random(); // Instantiate the random class for the random number generation

        for (int i = 0; i < set.length; i++) {

            boolean isRepeated = false; // flag for repeated numbers
            int randomNumber = Rand.nextInt(set.length * 2) + 1; // random int within range [1, arraySize * 2] inclusive

            // check for repeats
            for (int j = 0; j < nElems; j++) {
                if (set[j] == randomNumber)
                {
                    isRepeated = true;
                    break;
                }
            }

            // insert the random number or repeat loop logic
            if (isRepeated) {
                --i;    // decrement i so that next iteration of the for-loop ends up repeating instead
            } else {
                insert(randomNumber);
            }
        }
    }

    // Bubble sort algo from the book
    public void BubbleSort() {
        int out, in;

        for (out = nElems-1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (set[in] > set[in+1]) {
                    Swap(in, in+1);
                }
            }
        }
    }

    // swap func used in the book with the bubble sort
    private void Swap(int one, int two) {
        int temp = set[one];
        set[one] = set[two];
        set[two] = temp;
    }


}
