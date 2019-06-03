package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortJava {

    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(4, 2, 9, 6, 23, 12, 34, 0, 1);
        ArrayList<Integer> numbersToSort = new ArrayList<Integer>();

        for (Integer arg : input) {
            try {
                numbersToSort.add(arg);
            } catch (NumberFormatException ex) {
                System.out.println(arg + " is not a number. Please enter only numbers into the bubble sort!");
            }
        }

        System.out.println("Array before the bubble sort");
        for (int i : numbersToSort) {
            System.out.print(i + " ");
        }

        bubbleSort(numbersToSort);

        System.out.println("");

        System.out.println("Array after bubble sort");
        for (int i : numbersToSort) {
            System.out.print(i + " ");
        }
    }

    private static void bubbleSort(ArrayList<Integer> numbersToSort) {

        int temp = 0;
        for (int i = 0; i < numbersToSort.size() - 1; i++) {
            for (int j = 1; j < (numbersToSort.size() - i); j++) {
                if (numbersToSort.get(j - 1) > numbersToSort.get(j)) {
                    temp = numbersToSort.get(j - 1);
                    numbersToSort.set(j - 1, numbersToSort.get(j));
                    numbersToSort.set(j, temp);
                }

            }
        }
    }
}