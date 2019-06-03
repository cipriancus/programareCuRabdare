package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortJava {

  public static void main(String[] args) {

    int[] array = {4, 2, 9, 6, 23, 12, 34, 0, 1};

    System.out.println("Array before the sort");
    for (int i : array) {
      System.out.print(i + " ");
    }

    System.out.println("");

    Arrays.sort(array);

    System.out.println("Array after  sort");
    for (int i : array) {
      System.out.print(i + " ");
    }
  }
}
