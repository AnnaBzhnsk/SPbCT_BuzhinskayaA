package Zadanie2;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер клиента (1, 2 или 3): ");
        int num1 = in.nextInt();
        Socket s = null;
        if(num1 == 1){
            try {//посылка строки клиенту
                ServerSocket server = new ServerSocket(8080);
                s = server.accept();
                PrintStream ps = new PrintStream(s.getOutputStream());
                ps.println("Сообщение для клиента 1");
                ps.flush();
                s.close();
                // разрыв соединения
                System.out.println("Сообщение доставлено");
            }catch (IOException e){System.out.println("ошибка: " + e); }
        }
        else if (num1==2){
            try {
                ServerSocket server = new ServerSocket(3476);
                s = server.accept();
                PrintStream ps = new PrintStream(s.getOutputStream());
                ps.println("Сообщение для клиента 2");
                ps.flush();
                s.close();
                System.out.println("Сообщение доставлено");
            }catch (IOException e){System.out.println("ошибка: " + e); }
        }
        else if(num1==3){
            try {//посылка строки клиенту
                ServerSocket server = new ServerSocket(3575);
                s = server.accept();
                PrintStream ps = new PrintStream(s.getOutputStream());
                ps.println("Сообщение для клиента 3");
                ps.flush();
                s.close();
                System.out.println("Сообщение доставлено");
            }catch (IOException e){System.out.println("ошибка: " + e); }
        }

    }
}
