package arrays;

import java.time.LocalDate;
import java.util.Arrays;

public class ArraysAndLoops {
  public static void main(String[] args) {
//    int [] ia;
    // all java objects will receive at least zeroing initialization
    int[] ia = new int[4];

    System.out.println("ia has length " + ia.length);
    System.out.println("element zero " + ia[0]);
    ia[1] = 99;
    System.out.println(ia[1]);
    System.out.println("the array is: " + ia);
    System.out.println("the array is: " + Arrays.toString(ia));

    // use this form anywhere for an "immediate" array literal
//    int [] ia2 = new int[]{1, 1, 2, 3, 5};
    // leave off the new int[] ONLY where initializing explicit array
    int[] ia2 = {1, 1, 2, 3, 5};
    System.out.println(Arrays.toString(ia2));

    // long form:
    for (int idx = 0; idx < ia2.length; idx++) {
      System.out.println(ia2[idx]);
    }
    System.out.println("-----------------");
    // slightly newer form :) "enhanced for loop" works
    // on arrays and "collections"
    for (var n : ia2) {
      System.out.println(n);
    }

    CharSequence cs = new StringBuilder("");
    CharSequence[] csa = {
        "Hello", new StringBuilder("Bonjour")/*, LocalDate.now()*/
    };
  }
}
