package algorithms;

public class BinarySearch {
  public void binarySearch(int[] array, int target) {
    System.out.println("Binary Search");

    int length = array.length;
    int low = 0;
    int high = length - 1;
    boolean isFound = false;

    long startTime = System.nanoTime();

    while (low <= high) {
      int mid = (low + high) / 2;
      if (array[mid] == target) {
        System.out.println("Target element found at index " + mid);
        isFound = true;
        break;
      } else if (array[mid] > target) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    if (!isFound) {
      System.out.println("Target element not found1");
    }

    long endTime = System.nanoTime();
    long elapsedTime = endTime - startTime;
    System.out.println("Binary Search takes: " + elapsedTime + " to find the target element \n");
  }
}
