package conditions;

public class IfElseIf {
  public static void main(String[] args) {
    double d = Math.random(); // 0 <= d < 1.0

    if (d > 0.5) {
      System.out.println("Big");
    } else if (d > 0.25) {
      System.out.println("not too small");
    } else {
      System.out.println("small");
    }
  }
}
