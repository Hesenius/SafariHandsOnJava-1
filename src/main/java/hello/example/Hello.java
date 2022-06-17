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

    // assignments cannot be made "narrowing"
    int y;
//    y = 99L;
    y = (int)99L; // casts are likely to lose value!!!

    // one exception to narrowing conversions.
    // compile time constant of int type small enough for target, then ok
    final var twentyFour = 24;
//    twentyFour = 25; // same as const in JavaScript, C# BUT NOT C, C++
    byte b = twentyFour;
  }
}

//interface Thing {}
//record OddBall(int x) {}