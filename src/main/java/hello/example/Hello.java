package hello.example;

//import static java.lang.System.*;
//import static java.lang.System.out;
//import java.lang.System; // is not actually needed :)
//import java.lang.*;

import java.util.Date;

public class Hello {
  public static void main(String[] args) {
//    java.lang.System.out.println("Hello World!");
    System.out.println("Hello World!");
//    out.println("Hello World!");

    // variables must be declare (and initialized) before
    // use, and they all have STRONG STATIC TYPE
//    int x = 99; // 99 is an int type literal
    var x = 3_000_000_000L;

    // boolean, byte, short, char (16 bit unsigned unicode)
    // int (32 bits), long (64), float (32 IEEE 754), double (64 bit)
    // Literals 99->int, 99L ->long, 3.14 314E-2 etc. -> double 3.14F -> float

    // widening conversions are automatic
    // (not only primitives, but also for object type)
    long lng = 99;

    // assignments cannot be made "narrowing"
    int y;
//    y = 99L;
    y = (int)99L; // casts are likely to lose value!!!

    // one exception to narrowing conversions.
    // compile time constant of int type small enough for target, then ok
    final var twentyFour = 24;
//    twentyFour = 25; // same as const in JavaScript, C# BUT NOT C, C++
    byte b = twentyFour;

    // Computations: "operators"
    // + - * /
    // Divide... ALL JAVA primitive arithmetic
    // is performed AT LEAST int type
    short s1 = 5;
    short s2 = 7;
//    short s3 = s1 + s2; // produces an int result
    short s3 = (short)(s1 + s2);
    // also for divide
    // result type is larger of operand types
    var res = 3 / 2F;

    int uninitialized;
    /*final */boolean b1 = true;
    if (b1) {
      uninitialized = 99;
    } else {
      uninitialized = 100;
    }
    System.out.println(uninitialized);

    /*
    MORE operators
    % - remainder (not the same as "mod")
    Comparisons: > < >= <=
    Equality: (be careful) == !=
    Bitwise operators: & (bitwise and) | (bitwise or)
    ^ (bitwise xor) ~ (bitwise negate) -- also with boolean type
    Logical: && || (short-circuit and, or) false and anything -> false
      avoids evaluating right hand side
     */
  }
}

//interface Thing {}
//record OddBall(int x) {}