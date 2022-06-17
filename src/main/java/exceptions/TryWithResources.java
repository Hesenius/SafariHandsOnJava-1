package exceptions;

import java.io.*;

public class TryWithResources {
  public static void main(String[] args) {
    // "resources" here must be "AutoCloseable" (an interface)
    // these are reliably closed by the try-with-resource code
//    FileReader fr = new FileReader("data.txt");
//    try (fr; // java 9+ AND fr must be "final or effectively final"

    try (FileReader fr = new FileReader("data.txt");
         BufferedReader br = new BufferedReader(fr);
         PrintWriter out = new PrintWriter(new FileWriter("output.txt"));) {
      String line;
      while ((line = br.readLine()) != null) {
        out.println(line);
      }
    } catch (IOException ioe) {
      System.out.println("something broke: " + ioe.getMessage());
    }
  }
}
