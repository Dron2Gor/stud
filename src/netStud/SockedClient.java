package netStud;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SockedClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("localhost", 8189));
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println("Client");
            printWriter.println("Client2");
            printWriter.println("Client3");
            printWriter.println("exit");

                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {

                while (reader.ready())
                    System.out.println(reader.readLine());


            }

//        reader.close();
//        printWriter.close();
//        socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
