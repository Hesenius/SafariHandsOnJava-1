package usingclasses;

public class Thing {
  // fields are initialized top-to-bottom (this includes
  // instance initializers
//  String y = "value of x is " + this.x;
  int x = 99;
  { // another instance initializer
    System.out.println("running the first initializer");
  }
  String y = "value of x is " + x;
  String z;
  { // Instance initializer block
    int x = 0;
    for (int i = 0; i < 3; i++) {
      x += i;
    }
    z = "amazing, the value is now " + x;
    System.out.println("ran second initilizer, set z to " + z);
  }

  // initializers run BEFORE our constructor
  public Thing() {
    System.out.println("zero-arg Thing constructor...");
  }

  public Thing(int x) {
    // delegate to a matching constructor (really INITIALIZER)
    this(); // DO NOT CALL NEW -- you'll make another object
    System.out.println("Thing(int)");
  }

  public Thing(String s) {
    this(99);
    System.out.println("Thing(String)");
//    this(99); // NOPE, any delegation MUST BE FIRST
  }

  public static void main(String[] args) {
    Thing t = new Thing("x");
    System.out.println("t.x is " + t.x);
    System.out.println("t.y is " + t.y);
  }
}
