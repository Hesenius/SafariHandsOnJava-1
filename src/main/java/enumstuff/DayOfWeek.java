package enumstuff;

import java.util.Arrays;

// enum is final whether you like it or not
public enum DayOfWeek /*extends is not permitted, always extends Enum*/ {
  MONDAY("Lundi"), TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
  String french;
  // enums are classes, they can have constructors, fields, and methods
  // constructors are by default private and must be if we're explicit
  /*private */DayOfWeek() {}
  DayOfWeek(String s) {
    french = s;
  }

  public String getFrench() {
    return (french != null) ? french : "inconnu!";
  }

  @Override
  public String toString() {
    return super.toString().toLowerCase();
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(DayOfWeek.values()));
    for (var d : DayOfWeek.values()) {
      System.out.println(d.name()); // name is final
    }
    System.out.println(DayOfWeek.FRIDAY.ordinal());
  }
}
