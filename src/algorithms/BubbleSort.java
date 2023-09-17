package algorithms;

import java.util.Arrays;

/** BubbleSort */

/*
 * steps
 * 1. start with a unsorted list
 * 2. in each pass:
 * - compare the adjacent elements
 * - if the left > right element, swap them
 * - continue the process until you reach the last element of the list
 * 3. after one pass through the list, the largest element will bubbled up to
 * its correct position at the end
 * 4. repeat the steps 2 and 3
 * 5. continue all the process until no more swaps are needed in a pass
 */

public class BubbleSort {

  public static void bubbleSort(int[] arr) {
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
    System.out.println("Bubble Sort");

    System.out.println("Unsorted Array");
    int[] arr = {10, 9, 1, 2, 5, 3, 8, 4, 7, 6};
    System.out.println(Arrays.toString(arr));

    // sorting
    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
