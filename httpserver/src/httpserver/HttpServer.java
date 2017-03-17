package httpserver;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class HttpServer {
  public static void main(String[] args) throws IOException {
    int port = 9000;

    ServerSocket server = new ServerSocket(port);
    while (true) {
      Socket socket = server.accept();
      Thread stuffer = new StuffThread(socket);
      stuffer.start();
    }

  }

}


