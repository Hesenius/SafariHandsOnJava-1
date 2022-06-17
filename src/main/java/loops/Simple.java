package loops;

public class Simple {
  public static void main(String[] args) {
    int x = 4;
    while (x > 0) {
      System.out.println("x is " + x);
      x--; // also --x, ++x, x++
    }
    System.out.println("all done");

    do {
      System.out.println("x is " + x);
    } while (x != 0);
    System.out.println("done again");

  }
}
