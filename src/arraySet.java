import java.util.Random;

public class arraySet {
    //TODO: make these private before turning in!!!
    int[] set;
    int nElems;

    public arraySet(int maxSize) {
        set = new int[maxSize];
        nElems = 0;

        PopulateArray();
    }

    public void insert(int value)
    {
        set[nElems] = value;
        nElems++;
    }

    public void Display()
    {
        for (int j = 0; j<nElems; j++) {
            System.out.print(set[j] + " ");
        }
        System.out.println(" ");
    }

    public void PopulateArray() {
        Random Rand = new Random();
        for (int i = 0; i < set.length; i++) {
            int randomNumber = Rand.nextInt(set.length * 2) + 1;    // random int within range [1, arraySize * 2]
            //TODO: research ways to keep track of elements already in the set so to not repeat duplicated
            // other idea was to just start a linearCheck with a second for loop (not optimal at all lol)


            insert(randomNumber);
        }
    }


}
