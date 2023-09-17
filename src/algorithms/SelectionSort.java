package algorithms;

import java.util.Arrays;

/** SelectionSort */
public class SelectionSort {

  public static void selectionSort(int[] arr) {
    int length = arr.length - 1;
    boolean swapped = false;
  }

  public static void main(String[] args) {
    System.out.println("Selection Sort");
    System.out.println("Unsorted Array");
    int[] arr = {10, 9, 1, 2, 5, 3, 8, 4, 7, 6};
    System.out.println(Arrays.toString(arr));

    // sorting
    selectionSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
