package algorithms;

public class LinearSearch {
    public void linearSearch (int[] array, int target) {
        System.out.println("Linear Search");
        boolean isFound = false;

        long startTime = System.nanoTime();

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

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println("Linear Search takes: " + elapsedTime + " to find the target element \n" );
    }
}
