package problems.sorting.bubblesort;

import java.util.Arrays;

/** ReverseBubbleSort */
public class OptimizedBubbleSort {

  public static void optimizedBubbleSort(int[] arr) {
    int length = arr.length - 1;
    boolean swapped;

    for (int i = 0; i < length; i++) {
      swapped = false;
      for (int j = 0; j < length; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapped = true;
        }
      }
      if (!swapped) {
        break;
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("reverse bubble sort");

    System.out.println("Original array");
    int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    System.out.println(Arrays.toString(arr));

    System.out.println("Reverse Sorted Array");
    optimizedBubbleSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
