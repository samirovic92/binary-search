package algorithm;

public class BinarySearch {

    public static int findElementIndex(int[] data, int item) {

        int start = 0;
        int end = data.length - 1;

        while (start <= end) {
            int mid = (end + start) / 2;
            if (item == data[mid]) {
                return mid;
            } else if (item < data[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
