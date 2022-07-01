package usingclasses;

public class SomeOtherDateThing implements DateLike {
  @Override
  public int getDay() {
    return 1;
  }

  @Override
  public int getMonth() {
    return 1;
  }

  @Override
  public int getYear() {
    return 1970;
  }
}
