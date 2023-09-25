public class SetLibrary {

    // TODO: Define the union set
    public arraySet UnionSet(arraySet SetOne, arraySet SetTwo) {
        // get max size for the returning set
        int arraySize = GetArraySize(SetOne.GetNumElems(), SetTwo.GetNumElems());

        // instantiate the union set
        arraySet unionSet = new arraySet("A ∪ B", (arraySize * 2) + 1, false);

        // Based off of the counting sort algo
        int[] C = new int[(arraySize * 2) + 1]; // + 1 so we can get 0 index plus the max number an element can be
        for (int i: SetOne.GetArray()) C[i] += 1;
        for (int i: SetTwo.GetArray()) C[i] += 1;

        // automatically comes out sorted since we are inserting the iterator index
        for (int i = 0; i < C.length; i++) {
            if (C[i] > 0) unionSet.Insert(i);
        }

        return unionSet;
    }

    // TODO: Define the intersection of these sets
    public arraySet IntersectionSet(arraySet SetOne, arraySet SetTwo) {
        // get max size for the returning set
        int arraySize = GetArraySize(SetOne.GetNumElems(), SetTwo.GetNumElems());

        // instantiate the intersection set
        arraySet intersectionSet = new arraySet("A ∩ B", arraySize, false);

        // simple double nested iteration, linear check
        for (int A: SetOne.GetArray()) {
            for (int B: SetTwo.GetArray()) {
                if (A == B) {
                    intersectionSet.Insert(A); // can be A or B since they are the same
                    break;  // prevent repeats
                }
            }
        }

        return intersectionSet;
    }

    // TODO: verify whether one of these sets is a subset of the other or not
    public void SubsetVerify(arraySet SetOne, arraySet SetTwo) {
        // NOTE: need to finish this to work on other stuff so keep it simple
        boolean isSubset = true;

        int[] A = SetOne.GetArray();
        int[] B = SetTwo.GetArray();

        int j;

        // check for A subset of B
        for (int i = 0; i < SetOne.GetNumElems(); i++) {

            for (j = 0; j < SetTwo.GetNumElems(); j++) {
                if (A[i] == B[j]) {
                    break;
                }
            }

            if (j == SetTwo.GetNumElems()) {
                isSubset = false;
                break;
            }
        }

        if (!isSubset) {
            // Check for B subset of A
            isSubset = true;
            for (int i = 0; i < SetTwo.GetNumElems(); i++) {

                for (j = 0; j < SetOne.GetNumElems(); j++) {
                    if (B[i] == A[j]) {
                        break;
                    }
                }

                if (j == SetOne.GetNumElems()) {
                    isSubset = false;
                    break;
                }
            }

            if (isSubset) {
                System.out.println("B ⊆ A: B is a subset of or equal to A");
            } else {
                System.out.println("A ⊈ B: A is neither a Subset of nor Equal To B");
            }

        } else {
            System.out.println("A ⊆ B: A is a subset of or equal to B");
        }
    }

    private int GetArraySize(int a, int b) {
        int c;

        if (a > b) {
            c = a;   // SetOne is bigger
        } else if (a < b) {
            c = b;   // SetTwo is bigger
        } else {
            c = a;   // means both sets are the same size
        }

        return c;
    }

}
