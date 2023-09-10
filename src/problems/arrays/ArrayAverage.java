package problems.arrays;

/*
  Description: Calculate the average of elements in an array.
  Input: An array of integers, e.g., [10, 20, 30, 40, 50].
  Output: The average of the elements, e.g., 30.
*/

/** ArrayAverage */
public class ArrayAverage {

  public static int average(int[] array) {
    int avg;
    int sum = 0;

    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }

    avg = sum / array.length;

    return avg;
  }

  public static void main(String[] args) {
    int[] array = {10, 20, 30, 40, 50};
    int output = average(array);
    System.out.println(output);
  }
}
