package lambdas;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class Ex1 {
  public static void main(String[] args) {

// almost, but not quite :)
// function literal as a first class part of the language
//    fs = s -> s.length();
//    int len = fs("Hello");

// Java is OO, all expressions are either primitives, or Object references
//    Function<String, Integer> fs = new Function<String, Integer>() {
//      @Override
//      public Integer apply(String s) {
//        return s.length();
//      }
//    };
//
//    System.out.println("length of Hello is " + fs.apply("Hello"));

//    Function<String, Integer> fs = (String s) -> {
//        return s.length();
//      }
//    ;
//    Function<String, Integer> fs = (s) -> {
//    Function<String, Integer> fs = s -> {
//        return s.length();
//      }
//    ;
    Function<String, Integer> fs = s -> s.length() ;

    System.out.println("type of fs is " + fs.getClass());
//    fs.equals... it's really an object!!!
    System.out.println("length of Hello is " + fs.apply("Hello"));
    System.out.println(fs);
    System.out.println(fs.equals("banana"));

    IntUnaryOperator addOne = getAdder(1);
    IntUnaryOperator addFive = getAdder(5);

    System.out.println("two addOne is " + addOne.applyAsInt(2));
    System.out.println("seven addFive is " + addFive.applyAsInt(7));

    StringBuilder extension = new StringBuilder("More");
    UnaryOperator<StringBuilder> uosb = getExtender(extension);
    extension.append("extra");
    System.out.println(uosb.apply(new StringBuilder("Stuff")));
  }

  // valOne must be final or "effectively final"
  public static IntUnaryOperator getAdder(/*final */int valOne) {
//    valOne++;
    return x -> x + valOne;
  }

  public static IntUnaryOperator getAdder(int[] valOne) {
//    valOne++;
    return x -> x + valOne[0];
  }

  public static UnaryOperator<StringBuilder> getExtender(StringBuilder cs) {
    return s -> cs.append(s);
  }
}
