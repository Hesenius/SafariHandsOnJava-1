package usingclasses;

public class Holiday extends Date {
  private String name;

  public Holiday(int day, int month, int year, String name) {
//    this.name = name; // NOPE must not do anything "before"
    // this() or super() Because "parent" aspects of my
    // instance are considered as "foundations" for my object
    super(day, month, year); // super() or this()
    // implicitly, right after return from super()
    // perform instance initialization
    System.out.println("in Holiday(...) returned from super()");
    this.name = name;
//    this.day = day; // NOPE day is private, we can't see it here.
  }

  // initialization requires a single expression
  // loops are "recursion", conditions are ? :
  // checked exceptions CANNOT be handled
  private int count = getNinetyNine();

  public static int getNinetyNine() {
    System.out.println("getting 99");
    return 99;
  }

  private int moreData; // definitely ZERO after "new"

  { // initializer "one"
    System.out.println("instance initializer one");
    System.out.println("moreData is " + /*this.*/moreData);
    moreData = 100; // can be complex logic with exception blocks etc.
    System.out.println("moreData is now " + moreData);
  }

  private int yetMore = getNinetyNine();

  { // initializer two :)
    System.out.println("instance initializer two!");
  }

  public Holiday() {
    super();
    this.name = "Unknown";
  }

  @Override
  public int getFirstMonth() {
    return this.month;
  }

  public String getName() {
    return name;
  }
}

class Initialization {
  public static void showADate(DateLike d) {
    System.out.println("It's " + d.getDay());
    // what if it's a holiday?
    // Is this "intrinsic behavior" of the types? If so,
    // we should use polymorphism (i.e. have an overridden
    // method to provide the special variant behavior).
    // BUT!!!! If this is HOW WE USE THE THING...
    // then this kind of test is more reasonable
//    if (d instanceof Holiday) { // don't forget the test!!!
//      Holiday h = (Holiday)d; // crashes if not actually instanceof!!
//      System.out.println("the holiday is called " + h.getName());
//    }
    // 17? 18? have a preview of this type of thing
    // in switch behaviors
    if (!(d instanceof Holiday h)) {
      // h is NOT in scope here
      System.out.println("not a holiday..."/* + h*/);
    } else {
      System.out.println("the holiday is called " + h.getName());
    }
  }

  public static void main(String[] args) {
//    System.out.println(new Holiday(1, 1, 2000, "New Year's Day").toString());
//    System.out.println(new Holiday(1, 1, 2000, "New Year's Day") + "");
    System.out.println(new Holiday(1, 1, 2000, "New Year's Day"));

    Date simpleDate = new Date();
//    Date d = new Holiday(1, 5, 2022, "May Day");
    Holiday d = new Holiday(1, 5, 2022, "May Day");
    showADate(d);
    System.out.println("------------");
    showADate(simpleDate);
    System.out.println("------------");
    DateLike dl = new Holiday();
  }
}