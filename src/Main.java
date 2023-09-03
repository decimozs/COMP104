import algorithms.LinearSearch;

public class Main {
    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();

        int[] array = new int[1000];
        int length = array.length;

        for (int i = 0; i <  length; i++) {
            array[i] = i + 1;
        }

        ls.linearSearch(array, 500);
    }
}