package methods;

public class Examples {
  // public -> accessible anywhere in the running JVM (except for module system)
  // protected -> accessible anywhere default is accessible
  //    PLUS in sub-type (in some conditions)
  // <default> i.e. no keyword -> accessible in the same package
  // private -> accessible anywhere between the enclosing TOP-LEVEL
  // curly braces surrounding the declaration
  public static int add(int a, int b) {
//    if (a != 0 || a == 0) {
//      return a + b;
//    }
    return a + b;
  }

  // we do NOT have, named parameter passing
  // also do not have "default params"
//  public static boolean isValidDate(int day, int month, int year=2022 NOPE!!!!) {
  public static boolean isValidDate(int day, int month, int year) {
    return false;
  }
  // isValidDate(month=12, day=2, year=2022) NOPE
  public static boolean isValidDate(int day, int month) {
    return isValidDate(day, month, 2022);
  }

  public static void sayHello(String name) {
    System.out.println("Hello " + name);
    return; // unnecessary at the bottom of the method
  }

  // "name" of a function/method is actually:
  // package.class."name".type-sequence
  // methods.Examples.sumOf_int_int (kinda)
  // this name does NOT include return type
  public static int sumOf(int a, int b) {
    System.out.println("sumOf two args");
    return a + b;
  }

  public static int sumOf(int a, int b, int c) {
    System.out.println("sumOf THREE args");
    return a + b + c;
  }

  public static float sumOf(int a, float b) {
    System.out.println("sumOf int, float");
    return a + b;
  }

  public static float sumOf(float a, int b) {
    System.out.println("sumOf float, int");
    return a + b;
  }

//  public static int sumOf(int [] vals) {
  // varargs using ... ACTUALLY get an array
  public static int sumOf(int ... vals) { // vals is still an array of int
    int sum = 0;
    for (var v : vals) sum += v;
    return sum;
  }

  public static void main(String[] args) {
    add(1, 2);
    System.out.println(sumOf(1,2,3));
    System.out.println(sumOf(2,3));

    // return type can be ignored (fancy name "expression statement")
    sumOf(1,1);
    sumOf(1, 1F);

//    System.out.println(sumOf({1,2,3,4,5,6,7,8,9,10}));
    System.out.println(sumOf(new int[]{1,2,3,4,5,6,7,8,9,10}));
    System.out.println(sumOf(1,2,3,4,5,6,7,8,9,10));
  }
}
