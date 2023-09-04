package structures;

/** Array */
public class Array {
  public static void main(String[] args) {
    System.out.println("Array");

    // basic implementation of array
    int[] array1 = {1, 2, 3, 4, 5};

    // another way of implementing array
    int[] array2 = new int[5];
    // then we initialize each index to its expected value
    array2[0] = 1;
    array2[1] = 2;
    array2[2] = 3;
    array2[3] = 4;
    array2[4] = 5;

    // changing the value of any data inside the array
    array2[1] = 10; // the 2nd index of the array2 will be change;

    // view the value of certain element inside the array
    int element = array2[1];
    System.out.println("The value for this data is: " + element);

    // iterate through the array using common for loop
    for (int i = 0; i < array1.length; i++) {
      System.out.println(array1[i]);
    }

    // iterate through the array using for each loop
    for (int i : array2) {
      System.out.println(array2[i]);
    }
  }
}
