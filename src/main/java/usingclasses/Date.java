package usingclasses;

import java.util.List;

public class Date {
  class OddThing {
    private int x;
  }
  // public means accessible anywhere in the same JVM
  // -- **if running without modules**
  // -- more restricted if modular.

  // "default" accessibility, i.e. no keyword at all, means
  // -- accessible anywhere in the same package

  // private means accessible anywhere inside the enclosing TOP-LEVEL
  // curly braces around the declaration
  private int day;
  private int month;
  private int year;
//  int banana;

  public static boolean isLeapYear(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }

  public static int daysInMonth(int month, int year) {
    return switch (month) {
      case 9, 4, 6, 11 -> 30;
      case 2 -> isLeapYear(year) ? 29 : 28;
      case 1, 3, 5, 7, 8, 10, 12 -> 31;
      default -> throw new IllegalArgumentException("Bad month: " + month);
    };
  }

  private static List<String> names = List.of("Jan", "Feb", "Mar", "Apr", "May", "June",
      "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
  public static String getMonthName(int month) {
    return names.get(month - 1);
  }

  // Zeller's congruence
  public static int getDayOfWeek(int day, int month, int year) {
    if (month < 3) {
      month += 12;
      year -= 1;
    }
    return (day + (13 * (month + 1) / 5)
        + year + year / 4 - year / 100 + year / 400) % 7;
  }

  public static int getDayOfWeek(Date d) {
    return getDayOfWeek(d.day, d.month, d.year);
  }

  public static String asText(int day, int month, int year) {
    return "Date: " + getMonthName(month) + " " + day + ", " + year;
  }

//  public static String asText(Date d) {
//  public String asText(Date this) {
  public String asText() {
    return asText(this.day, this.month, this.year);
  }

  public static boolean isValid(int day, int month, int year) {
    return month >= 1 && month <= 12
        && day >= 1 && day <= daysInMonth(month, year);
  }

//  public static int getDay(Date date) {
//  public int getDay(@NotNull Date this) {
  public int getDay() {
    return this.day;
  }

  public static void setDay(Date date, int newDay) {
    if (!isValid(newDay, date.month, date.year)) {
      throw new IllegalArgumentException("Bad day");
    }
    date.day = newDay;
  }

  // assuming this class contains ZERO coded "constructors"
  // compiler generates one for us
  // accessibility matches the class
  // name is the name of the class
  // zero arguments
  // do no obvious initialization
  // satisfy the general requirement w.r.t. parent classes
  // constructors DO NOT declare a return type
  public Date(int day, int month, int year) {
    if (!isValid(day, month, year)) {
      throw new IllegalArgumentException("Bad values");
    }
//    int banana;
    // "this" is a reference to the object we are initializing..
    // using this is not really necessary *EXCEPT* for disambiguation
    this.day = day;
    this.month = month;
    this.year = year;
//    this.banana = 99;
  }
//  public Date() {
//  }
}
