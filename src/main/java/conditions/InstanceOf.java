package conditions;

public class InstanceOf {
  public static void main(String[] args) {
    String s1 = "Hello";
    StringBuilder sb1 = new StringBuilder("Hello world!");

    Object obj = sb1;

    if (obj instanceof String) {
      System.out.println("it's a String");
//      obj.length(); // can't do that
      String s = (String)obj;
      // can do that
      System.out.println("Length of string is " + s.length());
    } else if (obj instanceof StringBuilder) {
      System.out.println("StringBuilder");
    }

    // newer that Java 11
    // "pattern matching for instanceof
    if (!(obj instanceof String s)) {
//      System.out.println("String is of length " + s.length());
    } else {
      System.out.println("String is of length " + s.length());

    }
  }
}
