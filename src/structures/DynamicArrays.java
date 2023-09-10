package structures;

public class DynamicArrays {

  // insert method will insert an certain data in the array
  public static int[] insert(int[] struct, int data) {
    int[] newArray = new int[struct.length + 1];

    for (int i = 0; i < struct.length; i++) {
      newArray[i] = struct[i];
    }

    newArray[struct.length - 1] = data;

    return newArray;
  }

  // delete method will delete specifid data in the array
  public static int[] delete(int[] struct, int index) {
    if (index < 0 || index >= struct.length) {
      return struct;
    }

    int[] newArray = new int[struct.length - 1];
    int newIndex = 0;

    for (int i = 0; i < struct.length; i++) {
      if (i != index) {
        newArray[newIndex++] = struct[i];
      }
    }

    return newArray;
  }

  // update method will update specified data inside the array
  public static void update(int[] struct, int index, int newUpdatedData) {
    if (index >= 0 && index < struct.length) {
      struct[index] = newUpdatedData;
    } else {
      System.out.println("Invalid index, cannot update the element.");
    }
  }

  // sorting method will sort into acsending order
  public static void sort(int[] struct) {
    int length = struct.length;
    boolean swapped;
    do {
      swapped = false;
      for (int i = 0; i < struct.length; i++) {
        if (struct[i - 1] > struct[i]) {
          int temp = struct[i - 1];
          struct[i - 1] = struct[i];
          struct[i] = temp;
          swapped = true;
        }
      }
      length--;
    } while (swapped);
  }

  // display method will display the specific content inside of an array
  public static void display(int[] struct, int index) {
    boolean found = false;

    for (int i : struct) {
      if (i == index) {
        System.out.println("The index of " + index + " has an data of " + struct[i]);
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("Data not found on the array");
    }
  }

  // search method will find the data inside the array
  public static void search(int[] struct, int data) {
    boolean found = false;

    for (int i : struct) {
      if (struct[i] == data) {
        System.out.println("Data found at index " + i);
        found = true;
        break;
      }
    }

    if (!found) {
      System.out.println("Data not found on the array");
    }
  }

  // isEmpty method will check if the array is has an item if not then it will
  // return false otherwise true
  public static boolean isEmpty(int[] struct) {
    return struct.length == 0 || struct == null;
  }

  // traverse method will print all the element of the arrays
  public static void traverse(int[] struct) {
    System.out.print("[ ");
    for (int i = 0; i < struct.length; i++) {
      System.out.print(struct[i] + " ");
    }
    System.out.print("]");
  }

  public static void main(String[] args) {
    System.out.println("Dynamic Arrays");
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // insert a data inside of an array
    int[] newArray = insert(array, 11);
    int[] deleteArray = delete(array, 7);

    // print the array
    traverse(array);
    System.out.println();
    // print the new array with insertion of new data
    traverse(newArray);
    System.out.println();
    // print the new array with deletion of new data
    traverse(deleteArray);
    System.out.println();
    // update the new array with updating of new data
    update(array, 5, 60);
    traverse(array);

    // check the array if its empty
    System.out.println("\n" + isEmpty(array));

    // search data on the array
    search(array, 7);

    // display the content inside the array
    display(array, 7);
  }
}
