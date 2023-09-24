public class SetLibrary {

    // TODO: Define the union set
    public arraySet UnionSet(arraySet SetOne, arraySet SetTwo, int arraySize) {
        arraySet unionSet = new arraySet("A U B", (arraySize * 2) + 1, false);

        // Ensure arrays are ordered
        SetOne.BubbleSort();
        SetTwo.BubbleSort();

        // manipulate local copies of the arrays
        int[] setOne = SetOne.GetArray();
        int[] setTwo = SetTwo.GetArray();

        // look at todo for counting sort.


        return unionSet;
    }

    // TODO: Define the intersection of these sets
    public void IntersectionSet(arraySet SetOne, arraySet SetTwo) {

    }

    // TODO: verify whether one of these sets is a subset of the other or not
    public void SubsetVerify(arraySet SetOne, arraySet SetTwo) {

    }


    //TODO: implement counting sort
    //TODO: use counting sort to get a count of each element, if c[i] > 0; place index as an element in the union
    // if c[i] == 0; do nothing

    //NOTE: Take a look at countingSort for these.
}
