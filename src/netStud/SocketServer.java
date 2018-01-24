package netStud;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServer {
    public static void main(String[] args) throws IOException {
        try (
                ServerSocket serverSocket = new ServerSocket(8189);

                Socket socket = serverSocket.accept();
                Scanner scanner = new Scanner(socket.getInputStream())) {
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println("Hello. Hello.");
            while (true) {
                while (scanner.hasNext()) {
                    String st1 = "You write ",
                            st=scanner.nextLine();
                    if (st.equals("exit")){
                        printWriter.close();
                        socket.close();
                        serverSocket.close();
                        System.exit(1);
                    }

                    System.out.println(st1+st);
                    printWriter.println(st1+st);
                }
            }


        }

    }
}
