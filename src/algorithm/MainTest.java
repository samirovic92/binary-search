package algorithm;

public class MainTest {


    public static void main(String[] args) {

        int[] example1 = {2, 5, 10, 12, 15, 20, 25, 31, 40};

        int search = 20;
        int index = BinarySearch.findElementIndex(example1, search);
        System.out.println(String.format(" index of the element %s is %s", search, index)); // Exist

        search = 15;
        index = BinarySearch.findElementIndex(example1, search);
        System.out.println(String.format(" index of the element %s is %s", search, index)); // Exist

        search = 28;
        index = BinarySearch.findElementIndex(example1, search);
        System.out.println(String.format(" index of the element %s is %s", search, index)); // Not Exist

        search = 0;
        index = BinarySearch.findElementIndex(example1, search);
        System.out.println(String.format(" index of the element %s is %s", search, index)); // Not Exist

        search = 50;
        index = BinarySearch.findElementIndex(example1, search);
        System.out.println(String.format(" index of the element %s is %s", search, index)); // Not Exist
    }
}
