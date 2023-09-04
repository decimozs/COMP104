import src.extras.AlgorithmTimer;

public class test {
  public static <T extends Comparable<T>> void binarySearch(T[] array, T target) {
    if (array == null || target == null) {
      throw new IllegalArgumentException("Array and target cannot be null");
    }

    int length = array.length;
    int low = 0;
    int high = length - 1;
    boolean isFound = false;

    while (low <= high) {
      int mid = low + (high - low) / 2;
      int result = array[mid].compareTo(target);
      if (result == 0) {
        System.out.println("Target fount at index " + mid);
        isFound = true;
        break;
      } else if (result > 0) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    if (!isFound) {
      System.out.println("Target cannot found!");
    }
  }

  public static <T> void linearSearch(T[] array, T target) {
    int length = array.length;
    boolean isFound = false;

    if (array == null || target == null) {
      throw new IllegalArgumentException("Array and target cannot be null.");
    }

    for (int i = 0; i < length; i++) {
      if (array[i].equals(target)) {
        System.out.println("Target found at index " + i);
        isFound = true;
        break;
      }
    }

    if (!isFound) {
      System.out.println("Target cannot found!");
    }
  }

  public static void main(String[] args) {
    System.out.println("test");

    Integer[] array = new Integer[1000];
    AlgorithmTimer timer = new AlgorithmTimer();

    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }

    Runnable bs =
        () -> {
          binarySearch(array, 100);
        };

    long executionTime = timer(bs);
    System.out.println(executionTime);
  }
}
