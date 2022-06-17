package exceptions;

import java.sql.SQLException;

public class Examples {

  public static int sumOf(int a, int b) throws SQLException {
    if (a < 0) {
      if (a == -1) throw new NullPointerException("npe");
      // throw requires an object that is a subtype of java.lang.Throwable
      throw new IllegalArgumentException("IAE: I only add positive values!");
//      throw new SQLException("SQLE: I only add positive values!");
    }
    return a + b;
  }

  // generalizing exception info is unhelpful! How will the
  // calling programmer guess what to do to recover
  public static void main(String[] args) /*throws SQLException*/ {
    // some "problems" should be fixed, environment issues
    // such a file not found
    // we SHOULD write code to attempt to fix
    //
    // some problems are bugs!!! We should NOT try to fix them
    // should restart!!!

//    try {
//      System.out.println(sumOf(-1, 2));
//      System.out.println("still going");
//    } catch (SQLException sqle) {
//      System.out.println("oops, db busted: " + sqle.getMessage());
//    } catch (IllegalArgumentException iae) {
//      System.out.println("oops, illegal arg: " + iae.getMessage());
//    } finally {
//      System.out.println("executing finally");
//    }
//
//    System.out.println("finishing the method");

    try {
      System.out.println(sumOf(-2, 2));
      System.out.println("still going");
//    } catch (Exception sqle) { // might catch stuff not intended
//      System.out.println("oops: " + sqle.getMessage());
    } catch (IllegalArgumentException | SQLException ex) {
      System.out.println("oops: " + ex.getMessage());
//      throw ex;
    } finally {
      System.out.println("executing finally");
    }

    System.out.println("finishing the method");

  }
}
