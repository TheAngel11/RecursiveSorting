import java.util.ArrayList;

/**
 * Merge sort is a divide-and-conquer algorithm based on the idea of breaking down a list into several sub-lists until
 * each sublist consists of a single element and merging those sublists in a manner that results into a sorted list.
 *
 *             ------------
 *            | 3 | 2 | 1 |
 *             -----------
 *               |      |         ---
 *               |      |_______ | 1 |
 *               v               ----
 *             --------            |
 *            | 3 | 2 |            |
 *            --------             |
 *                |                |
 *                |                |
 *           ----------            |
 *           |         |           |
 *           v         v           |
 *           ----      ----        |
 *          | 3 |     | 2 |        |
 *          ----      ----         |
 *            |         |          |
 *            ----------           |
 *                |                |
 *                v                |
 *            --------             |
 *           | 2 | 3 |             |
 *           --------              |
 *               |                 |
 *               ___________________
 *                        |
 *                        v
 *                  ------------
 *                 | 1 | 2 | 3 |  Finally, the array is correctly sorted.
 *                  -----------
 *
 */

public class MergeSort {
    /**
     *
     * @param array
     * @param low
     * @param high
     * @return
     */
    public ArrayList<Integer> mergeSort (ArrayList<Integer> array, int low, int high){
        if (low >= high){
            return array;
        } else {
            int middle = (low + high)/2;
            array = mergeSort(array, middle + 1, high);
            array = mergeSort(array, low, middle);
            array = merge(array, low, middle, high);
            return array;
        }
    }

    /**
     *
     * @param array
     * @param low
     * @param middle
     * @param high
     * @return
     */
    public ArrayList<Integer> merge(ArrayList<Integer> array, int low, int middle, int high) {
        int start = 0, end = 0, cursor = 0, i = 0;
        start = low;
        end = middle + 1;
        cursor = low;

        ArrayList<Integer> temp_array = new ArrayList<>();
        for (int j = 0; j < array.size(); j++) {
            temp_array.add(0);
        }

        while ((start <= middle) && (end <= high)){
            if (array.get(start) <= array.get(end)){
                temp_array.set(cursor, array.get(start));
                start++;
                cursor++;
            } else {
                temp_array.set(cursor, array.get(end));
                end++;
                cursor++;
            }
        }
        while (start <= middle){
            temp_array.set(cursor, array.get(start));
            start++;
            cursor++;
        }
        while (end <= high){
            temp_array.set(cursor, array.get(end));
            end++;
            cursor++;
        }
        i = low;
        while (i <= high){
            array.set(i, temp_array.get(i));
            i++;
        }
        return array;
    }
}
