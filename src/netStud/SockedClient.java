package netStud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SockedClient {
    public static void main(String[] args) {
        try{
            Socket socket=new Socket();
            socket.connect(new InetSocketAddress("localhost",13),2000);
            BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (reader.ready())
                System.out.println(reader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
