package algorithms;

public class LinearSearch {
    public void linearSearch (int[] array, int target) {
        boolean isFound = false;

        for (int index : array) {
            if (array[index] == target) {
                System.out.println("Target element found at index " + index);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Target element not found");
        }
    }
}
