package conditions;

import java.util.Random;

public class NewSwitchA {
  public static void main(String[] args) {
    int val = new Random().nextInt(0, 4);
    switch (val) {
      case 0 -> {
        System.out.println("zero");
        System.out.println("really, 0");
      }
      case 1, 2 -> System.out.println("one or two");
      default -> System.out.println("something else");
    }

    // expression form (based on using in an expression context)
    // expression form MUST "cover" all possible value
    var msg = switch (val) {
      case 0 -> {
        String s = "Z";
        yield s + "ero"; // NOT return
      }
      case 1, 2 -> "middling value";
      case 3 -> "three";
      default -> throw new IllegalArgumentException("that can't happen");
    };
    System.out.println("message is " + msg);
  }
}
