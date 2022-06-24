package usingclasses;

public class UseDate {
  public static void main(String[] args) {
    System.out.println("day of week of Jan 1 2000: "
        + Date.getDayOfWeek(1, 1, 2000));

    System.out.println("New millenium began: " + Date.asText(1, 1, 2001));

    int birthDay = 12;
    int birthMonth = 8;
    int birthYear = 1993;
    System.out.println("birthday: "
        + Date.asText(birthDay, birthMonth, birthYear));

    // new does two things:
    // -- allocates and zeroes the memory for this specfied type of object
    // -- finds and invokes/calls a "constructor" -- really, it's an initializer
    Date anotherBirthDay = new Date(3, 3, 1986);
//    Date anotherBirthDay2 = new Date();
//    anotherBirthDay.day = 3;
//    anotherBirthDay.month = 3;
//    anotherBirthDay.year = 1987;

//    System.out.println(anotherBirthDay.day);
//    System.out.println(Date.getDay(anotherBirthDay));
    System.out.println(anotherBirthDay.getDay());

//    System.out.println("another birthday is " + Date.asText(anotherBirthDay));
    System.out.println("another birthday is " + anotherBirthDay.asText());

    Date bad = new Date(28, 2, 2021); // BAD :(
//    bad.day = -1;
    Date.setDay(bad, -1);
//    System.out.println("The date is " + Date.asText(bad));
    System.out.println("The date is " + bad.asText());

  }
}
