package userecords;

import java.time.LocalDate;

//public class Person {
//  String name;
//  LocalDate dob;
//  int wealth;
//  // constructors
//  // getters
//  // toString
//  // equals/hashcode
//}

// Unmodifiable (i.e. cannot reassign the fields)
// but might be able to mutate the referee objects

// records are intended as data carriers (unmodifiable)
// cannot extends, nor subclass
// in fact instanceof java.lang.Record
public record Person(String name, LocalDate dob, int wealth) {
  // validate fields
  // pre-constructor :)
  public Person {
    if (name == null) throw new IllegalStateException("must have a name");
//    this.dob = null; // cannot assign to fields
    // fields are final :) assignment is in the canonical constructor
  }

  // can override built in behavior

  @Override
  public String toString() {
    return "Person " + name;
  }
}

class UsePerson {
  public static void main(String[] args) {
    Person p = new Person("Fred", LocalDate.of(1996, 8, 3), 1000);
    Person p2 = new Person("Jim", LocalDate.of(1996, 8, 3), 1000);
    Person p3 = new Person("Fred", LocalDate.of(1996, 8, 3), 1000);

    System.out.println(p);
    System.out.println(p.equals(p2));
    System.out.println(p.equals(p3));

//    new Person(null, LocalDate.of(1996, 8, 3), 1000);
  }
}
