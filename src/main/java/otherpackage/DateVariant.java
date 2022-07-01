package otherpackage;

import usingclasses.Date;

public class DateVariant extends Date {
  public DateVariant(int day, int month, int year) {
    super(day, month, year);
  }

  public void lookAtDate(DateVariant this, Date other) {
//    System.out.println(this.day);
    // protected element of parent type, in different
    // package is NOT accessible unless the reference
    // is of our subclass's type
//    System.out.println(other.day);
  }
}
