package networkstuff;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ReadSomething {
  public static void main(String[] args) throws Throwable {

//    Reader baseReader = new FileReader("data.txt");

    ServerSocket serverSocket = new ServerSocket(9999);
    // wait for a call!
    Socket s = serverSocket.accept();
    Reader baseReader = new InputStreamReader(s.getInputStream());
    PrintWriter output =
        new PrintWriter(new OutputStreamWriter(s.getOutputStream()));

    BufferedReader br = new BufferedReader(baseReader);
    String line = br.readLine();
    System.out.println("I read: " + line);

    output.println("Really, you think: " + line +
        "\nI think I might agree with you...");

    output.flush();
    s.close(); // this should be done in a try-with-resources :)
  }
}
