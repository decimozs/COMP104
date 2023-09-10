package problems.arrays;

/*
  Description: Write a program that calculates the sum of all elements in an array.
  Input: An array of integers, e.g., [1, 2, 3, 4, 5].
  Output: The sum of all elements, e.g., 15.
*/

/** ArraySum */
public class ArraySum {

  public static int sum(int[] array) {
    int sum = 0;

    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }

    return sum;
  }

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    int output = sum(array);
    System.out.println(output);
  }
}
