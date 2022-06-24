package usingcollections;

import java.util.ArrayList;
import java.util.List;

public class LimitsOfGenerics {
  public static void main(String[] args) {
    // NOPE, generics is only usable with object types
    // NOT with primitives
//    List<int> numbers =
    List<Integer> numbers = new ArrayList<>();
//    numbers.add(Integer.valueOf(1));
//    numbers.add(Integer.valueOf(2));
    numbers.add(1); // autoboxing
    numbers.add(2);
    System.out.println(numbers);

//    Integer first = numbers.get(0);
//    Object first = numbers.get(0);
    int first = numbers.get(0); // auto-unboxing
    System.out.println(first);
//    System.out.println("type of first is " + first.getClass());

//    Integer one = 1; // yes, autobox an int to Integer
//    Object one = 1; // yes, autobox an int to Integer
//    Long one = 1L; // Yup :)
//    Integer one = 1L; // FAILS, can't autobox long to Integer wrapper

    // Wrapper types are immutable
    Integer one = 1;
    Integer two = 2;
    // illogical, but reuses reference variable for a different object
    two = two + one;

    // BAD BAD BAD!!! constructors for wrappers are deprecated
//    Integer anotherOne = new Integer(1);
    Integer anotherOne = Integer.valueOf(1);
    System.out.println(one == anotherOne);

    System.out.println("value of one " + one);
//    one++;
//    one = one + 1;
    one = Integer.valueOf(one.intValue() + 1);
    System.out.println("value of one following ++ " + one);

  }
}
