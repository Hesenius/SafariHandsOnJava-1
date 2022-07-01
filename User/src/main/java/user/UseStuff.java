package user;

//import support.MoreStuff;

import java.lang.reflect.Field;

public class UseStuff {
  public static void main(String[] args) throws Throwable {
    System.out.println("message is " + provide.Stuff.message);
    Class<?> cl = provide.Stuff.class;
    Field field = cl.getDeclaredField("secretMessage");
    field.setAccessible(true); // disable access check
    System.out.println("secret message: " + field.get(null));
  }
}
