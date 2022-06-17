package conditions;

public class OldSwitch {
  public static void main(String[] args) {
    int val = (int) (Math.random() * 4);
//    int goto; //goto is a keyword (unused) cannot be an identifier
    // for int types, String, Enum types...
    switch (val) {
      case 0: // values here must all be distinct constants
        System.out.println("it's zero");
        break; // don't forget the break!!!
      case 1:
        // missing break permits "alternation"
      case 2:
        System.out.println("it's one or two");
        break;
      default: // default does not have to be last
        System.out.println("I guess it's three");
        break;
//      case -1: // probably wish that your default had break too!!!
    }
  }
}
