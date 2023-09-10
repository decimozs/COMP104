package problems.arrays;

/*
  Description: Find the largest element in an array.
  Input: An array of integers, e.g., [5, 8, 2, 11, 9].
  Output: The largest element, e.g., 11.
*/

/** LargestElement */
public class LargestElement {

  public static int largestElement(int[] array) {
    int largest = 0;

    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] > array[i + 1]) {
        largest = array[i];
      }
    }

    return largest;
  }

  public static void main(String[] args) {
    int[] array = {5, 8, 2, 11, 9};
    int output = largestElement(array);
    System.out.println(output);
  }
}
