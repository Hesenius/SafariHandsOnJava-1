package reading;

import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please tell me your name: ");
    String name = sc.nextLine();
//    System.out.println("Welcome " + name);
    System.out.printf("Welcome %20s\n", name);
  }
}
