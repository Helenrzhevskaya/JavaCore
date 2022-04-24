package lesson6.socketexamples;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClineApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (Socket socket = new Socket("localhost", 1234)) {
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            while (true) {
                System.out.println("введите сообщение");
                String request = scanner.nextLine();
                dataOutputStream.writeUTF(request);

                if("end".equals(request)) break;

                System.out.println("получили ответ от сервера " + dataInputStream.readUTF());

            }

        } catch (UnknownHostException e) { //на случай,если хост не нашелся
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
