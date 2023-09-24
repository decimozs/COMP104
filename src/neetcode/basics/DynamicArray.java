package neetcode.basics;

/** DynamicArray */
public class DynamicArray {

  int[] array;
  int length = array.length;

  public DynamicArray(int capacity) {
    capacity = new int[capacity];
  }

  public int get(int i) {
    boolean isFound = false;
    for (i = 0; i < length; i++) {
      if (i == array[i]) {
        isFound = true;
        return array[i];
      }
    }
    if (!isFound) {
      return -1;
    }
    return -1;
  }

  public void insert(int i, int n) {
    if (length == 0 || array == null) {
      System.out.println("Array is not initialized!");
    }
    for (i = 0; i < length; i++) {
      if (i == i) {
        array[i] = n;
      } else {
        System.out.println("Array not found!");
      }
    }
  }
}
