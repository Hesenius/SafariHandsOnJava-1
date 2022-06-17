package equality;

public class Equality {
  public static void main(String[] args) {
    // boolean is boolean Java does NOT HAVE "truthy/falsy"
    int x = 99;
    int y = 99;
    int z = 100;
    System.out.println(x == y);
    System.out.println(x == z);

    String s1 = "Hello";
    String s2 = "Bonjour";
    System.out.println(s1 == s2);

    // String is IMMUTABLE
    String s3 = s1.concat(" world");
    System.out.println(s1);
    System.out.println(s3);

    String s4 = "He";
    // any time you have String + <anything>
    // Java converts the <anything> to text
    // + with String performs concatenation
    s4 = s4 + "llo";
    System.out.println(s4);

    System.out.println("s1 is: " + s1);
    System.out.println("s4 is: " + s4);
    System.out.println(s1 == s4);

    // equals method is always available (inherited from Object)
    // and intended for "content equivalence comparison"
    System.out.println(s1.equals(s4));
    // BUT not all objects provide it!!!
    StringBuilder sb1 = new StringBuilder("Hello");
    StringBuilder sb2 = new StringBuilder("Hello");
    System.out.println("sb1 is " + sb1);
    System.out.println("sb2 is " + sb2);
    System.out.println(sb1 == sb2);
    System.out.println(sb1.equals(sb2));

    // strings are immutable, so they be shared :)
    // so, *literal* strings with identical contents become
    // a single shared object in runtime
    String s5 = "Hello";
    System.out.println(s1 == s5);
    // can perform "interning" .intern() if you want this
    // pooling behavior for dynamically created Strings

  }
}
