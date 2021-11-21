import java.util.ArrayList;

public class Quicksort {

    /**
     *
     * @param a
     * @param low
     * @param high
     */
    public void quickSort (ArrayList<Float> a, int low, int high) {
        int p;
        if (low >= high) {
            return;
        }
        p = particio(a, low, high);
        quickSort(a, p+1, high);
        quickSort(a, low, p);

    }

    /**
     *
     * @param a
     * @param i
     * @param j
     * @return
     */
    private int particio(ArrayList<Float> a, int i, int j) {
        int l, r, mig;
        float pivot;
        l = i;
        r = j;
        mig = (i + j) / 2;
        pivot = a.get(mig);
        while (true) {
            while (a.get(l) < pivot) {
                l++;
            }
            while (a.get(r) > pivot) {
                r--;
            }

            if (l >= r) {
                return r;
            }

            float aux;
            //swap the values in the positions l and r
            aux = a.get(l);
            a.set(l, a.get(r));
            a.set(r, aux);
            l++;
            r--;
        }
    }
}


