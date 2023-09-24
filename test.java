import java.util.Scanner;

/** test */

/*
 * Array Operations
 * 1. create array
 * 2. insert element
 * 3. delete element
 * 4. search element
 * 5. delete element
 * 6. exit
 */

public class test {

  private static Scanner sc = new Scanner(System.in);
  private static int[] array;

  private static void createArray() {
    System.out.println("Enter your array size: ");
    int size = sc.nextInt();
    array = new int[size];
    System.out.println("Enter your date element for your array: ");
    for (int i = 0; i < array.length; i++) {
      array[i] = sc.nextInt();
    }
    System.out.println("Your array is now created!");
    displayElement();
    main(null);
  }

  private static void insertElement() {
    if (array.length == 0 || array == null) {
      System.out.println("Please create an array first!");
    }

    System.out.println("Enter the index that you want to be inserted: ");
    int index = sc.nextInt();
    for (int i = 0; i < array.length; i++) {
      if (index < 0 || index >= array.length) {
        System.out.println("Index not found!");
        return;
      } else {
        System.out.println("Enter the element you want to insert on that index: ");
        int element = sc.nextInt();
        array[index] = element;
        displayElement();
      }
    }

    main(null);
  }

  private static void deleteElement() {
    if (array.length == 0 || array == null) {
      System.out.println("Please create an array first!");
    }

    System.out.println("Enter the index you want to delete");
    int index = sc.nextInt();
    for (int i = 0; i < array.length; i++) {
      if (index < 0 || index >= array.length) {
        System.out.println("Index not found!");
        return;
      } else {
        array[index] = 0;
        displayElement();
      }
    }
  }

  private static void searchElement() {
    if (array.length == 0 || array == null) {
      System.out.println("Please create an array first!");
    }

    boolean isFound = false;
    System.out.println("Enter the element you want to find: ");
    int element = sc.nextInt();

    for (int i = 0; i < array.length; i++) {
      if (element == array[i]) {
        System.out.println("Element found at index " + i);
        isFound = true;
        break;
      }
    }

    if (!isFound) {
      System.out.println("Element not found");
    }

    main(null);
  }

  private static void displayElement() {
    System.out.print("Array: [ ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + ", ");
    }
    System.out.print("]");

    main(null);
  }

  private static void menu() {
    System.out.println("[1] Create Array");
    System.out.println("[2] Insert Element");
    System.out.println("[3] Delete Element");
    System.out.println("[4] Search Element");
    System.out.println("[5] Display Element");
    System.out.println("[6] Exit");
  }

  public static void main(String[] args) {
    menu();
    System.out.println("Enter your operations: ");
    int operation = sc.nextInt();
    switch (operation) {
      case 1 -> createArray();
      case 2 -> insertElement();
      case 3 -> deleteElement();
      case 4 -> searchElement();
      case 5 -> displayElement();
      case 6 -> System.exit(0);
      default -> System.out.println("Invalid operation choice! Please enter a valid operation");
    }
  }
}
