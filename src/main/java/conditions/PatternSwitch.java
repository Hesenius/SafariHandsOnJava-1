package conditions;

import java.time.LocalDate;

public class PatternSwitch {
  public static void main(String[] args) {
//    CharSequence obj = "he";//LocalDate.now();//null;//"Hello";
    Object obj = "he";//LocalDate.now();//null;//"Hello";

    var msg = switch (obj) {
      case null -> "nonexistent!";
      case String s && s.length() > 3 -> "longish string: " + s.length();
      case String s -> "short String :) " + s.length();
//      case CharSequence cs -> "Some other char sequence";
      default -> "something else";
    };

    System.out.println(msg);
  }
}
