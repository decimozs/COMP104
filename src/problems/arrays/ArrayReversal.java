package problems.arrays;

/*
  Description: Reverse the elements of an array.
  Input: An array of elements, e.g., [1, 2, 3, 4, 5].
  Output: The reversed array, e.g., [5, 4, 3, 2, 1].
*/

/** ArrayReversal */
public class ArrayReversal {

  public static void reverse(int[] array) {
    int start = 0;
    int end = array.length - 1;

    while (start < end) {
      int temp = array[start];
      array[start] = array[end];
      array[end] = temp;

      start++;
      end--;
    }

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    reverse(array);
  }
}
