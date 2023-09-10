package problems.arrays;

/*
  Description: Find the smallest element in an array.
  Input: An array of integers, e.g., [15, 3, 7, 2, 9].
  Output: The smallest element, e.g., 2.
*/

/** SmallestElement */
public class SmallestElement {

  public static int smallestElement(int[] array) {
    int smallest = 0;

    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] < array[i + 1]) {
        smallest = array[i];
      }
    }

    return smallest;
  }

  public static void main(String[] args) {
    int[] array = {15, 3, 7, 2, 9};
    int output = smallestElement(array);
    System.out.println(output);
  }
}
