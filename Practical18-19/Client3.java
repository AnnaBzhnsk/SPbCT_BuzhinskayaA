package Zadanie2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client3 {
    public static void main(String[] args) {
        Socket socket = null;
        try {//получение строки клиентом
            socket = new Socket("localhost", 3575);
            BufferedReader dis = new BufferedReader(new
                    InputStreamReader(socket.getInputStream()));
            String msg = dis.readLine();
            System.out.println(msg);
        } catch (IOException e) {System.out.println("ошибка: " + e); }
    }
}
