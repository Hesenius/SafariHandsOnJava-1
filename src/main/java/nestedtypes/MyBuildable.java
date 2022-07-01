package nestedtypes;

public class MyBuildable {
  private String name;
  private int count;

  // constructors are LIMITED!!!
  // call new XXXX you either get a BRAND NEW object of EXACTLY XXXX type
  // or and exception
  private MyBuildable(String name, int count) {
    this.name = name;
    this.count = count;
  }
  // factory can do everything a constructor does
  // but also can provide OLD objects (from a pool)
  // subtypes
  // AND the names can change instead of being restricted to valid overloads
  public static MyBuildable get(String name, int count) {
    return new MyBuildable(name, count);
  }

  public static MyBuildableBuilder builder() {
    return new MyBuildableBuilder();
  }
  // static nested class is merely granted (mutual) privileged access
  // it has no special relationship with any particular instance
  public static class MyBuildableBuilder {
    private String name;
    private int count;
    private MyBuildableBuilder() {}

    public MyBuildableBuilder name(String name) {
      this.name = name;
      return this;
    }
    public MyBuildableBuilder count(int count) {
      this.count = count;
      return this;
    }
    public MyBuildable build() {
      // VALIDATE PROPOSAL!!!
      return new MyBuildable(name, count);
      // or perhaps:
      // MyBuildable mb = new MyBuildable();
      // mb.name = name;
      // mb.count = count;
    }
  }


  public static void main(String[] args) {
    MyBuildable mb = MyBuildable.builder()
        .name("Fred")
        .count(10)
        .build();
  }
}
