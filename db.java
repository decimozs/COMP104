public class db {

  public static void display(int[] arr, int index) {
    boolean found = false;

    for (int i = 0; i < arr.length; i++) {
      if (index == arr[i]) {
        System.out.println(arr[i]);
        found = true;
        break;
      }
    }

    if (!found) {
      System.out.println("Index not found!");
    }
  }

  public static void traverse(int[] arr) {
    System.out.print("[ ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println("]");
  }

  public static void main(String[] args) {
    System.out.println("Db");

    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    traverse(arr);
    display(arr, 5);
  }
}
