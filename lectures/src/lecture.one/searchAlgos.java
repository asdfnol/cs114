package lecture.one;
public class searchAlgos{
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 45, 6, 7, 8, 9};


    }
    public static <E extends Comparable<? super E>> int bsearch(E[] arr, E key) {
        return bsearch(arr, key, 0, arr.length - 1);
    }
    private static <E extends Comparable<? super E>> int bsearch(E[] arr, E key, int left, int right) {
        if (left <= right) {
            int cmp, mid = (left + right) / 2;
            if ((cmp = key.compareTo(arr[mid])) == 0) {
                return mid;
            } else if (cmp < 0) {
                return bsearch(arr, key, left, mid - 1);
            } else {
                return bsearch(arr, key, mid + 1, right);
            }
        }
        return -1;
    }

    /*
     *
    public static <E extends Comparable<? super E>> int ssearch (E[] arr, E key) {
        return ssearch(arr, key, 0);
    }
    // idk 
    private static <E extends Comparable<? super E>> int ssearch (E[] arr, E key, int index) {
        if (index < arr.length) {
            if (key.compareTo(arr[index]) == 0) {
                return ssearch(arr, key, index+1);
            }
        }
        return -1;
    }
    *
    */
}
