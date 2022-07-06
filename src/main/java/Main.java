import java.util.Arrays;
import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {

        LinkedList<String> test = new LinkedList();

        test.add("yay");
        test.add("adf");
        test.add("yay1");
        test.add("adf1");

        for (String temp: test) {
            System.out.println(temp);
        }



        int sorted[] = {2,3,4,10,40};
        int x = 10;

        int result = Searches.binarySearch(sorted,0,sorted.length - 1, x);

        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
            System.out.println(sorted[result] == x);
        }


        int unsorted[] = {64,25,12,22,11};
        Searches.sort(unsorted);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(unsorted));


        int[] unsorted2 = { 6, 5, 12, 10, 9, 1 };

        Searches.mergeSort(unsorted2, 0, unsorted2.length - 1);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(unsorted2));
    }
}
