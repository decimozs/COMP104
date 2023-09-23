import java.util.Scanner;

/** ArrayLab */
public class ArrayLab {
  private static Scanner sc = new Scanner(System.in);
  private static int[] array = null;

  private static void createArrays() {
    System.out.println("Create your array");
    System.out.print("Enter the size of your array: ");
    int size = sc.nextInt();
    array = new int[size];

    System.out.println("Enter the data of your array:");
    for (int i = 0; i < array.length; i++) {
      array[i] = sc.nextInt();
    }

    System.out.print("Your array is now created: [ ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println("]");
    main(null);
  }

  private static void insertElement() {
    if (array == null) {
      System.out.println("Array is not yet created!");
    }

    System.out.println("Enter the index to insert");
    int index = sc.nextInt();
    if (index < 0 || index >= array.length) {
      System.out.println("Invalid Index");
    } else {
      System.out.println("Enter the element you to insert in index " + index);
      int element = sc.nextInt();
      array[index] = element;
      System.out.println("Element Inserted");
      displayElement();
    }

    main(null);
  }

  private static void deleteElement() {
    if (array == null) {
      System.out.println("Array is not yet created!");
    }

    System.out.println("Enter the index to delete");
    int index = sc.nextInt();
    if (index < 0 || index >= array.length) {
      System.out.println("Invalid Index");
    } else {
      array[index] = 0;
      System.out.println("Element Deleted");
      displayElement();
    }
    main(null);
  }

  private static void displayElement() {
    if (array == null) {
      System.out.println("Array is not yet created!");
    }

    System.out.println("Display Element");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }

    main(null);
  }

  private static void searchElement() {
    if (array == null) {
      System.out.println("Array is not yet created!");
    }

    boolean isFound = false;
    System.out.print("Enter the element you want to search: ");
    int element = sc.nextInt();
    for (int i = 0; i < array.length; i++) {
      if (element == array[i]) {
        System.out.println("Element found at index " + i);
        isFound = true;
        break;
      }
    }
    if (!isFound) {
      System.out.println("Element not found!");
    }

    main(null);
  }

  private static void menu() {
    System.out.println("Enter your option: ");
    int option = sc.nextInt();

    switch (option) {
      case 1 -> createArrays();
      case 2 -> insertElement();
      case 3 -> searchElement();
      case 4 -> displayElement();
      case 5 -> deleteElement();
      default -> System.out.println("Invalid Choice");
    }
  }

  public static void main(String[] args) {
    menu();
  }
}
