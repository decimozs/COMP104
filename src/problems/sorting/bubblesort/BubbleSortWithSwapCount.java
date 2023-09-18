package problems.sorting.bubblesort;

import java.util.Arrays;

/** BubbleSortWithSwapCount */
public class BubbleSortWithSwapCount {

  public static void bubbleSortWithSwapCount(int[] arr) {
    int length = arr.length - 1;
    boolean swapped;
    int swapCount = 0;

    for (int i = 0; i < length; i++) {
      swapped = false;
      for (int j = 0; j < length; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapCount++;
        }
      }

      if (!swapped) {
        break;
      }
    }

    System.out.println("Swap count:" + swapCount);
  }

  public static void main(String[] args) {
    System.out.println("Bubble sort with swap count");
    System.out.println("Original Array");
    int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    System.out.println(Arrays.toString(arr));

    System.out.println("Sorted Array with Swap Count");
    bubbleSortWithSwapCount(arr);
    System.out.println(Arrays.toString(arr));
  }
}
