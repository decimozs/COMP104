public class test {

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

    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }

    linearSearch(array, 97);
  }
}
