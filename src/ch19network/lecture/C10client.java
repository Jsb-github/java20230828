package ch19network.lecture;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class C10client {
    public static void main(String[] args) {

            try {
                Socket socket = new Socket("172.30.1.81", 7000);
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter ow = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(ow);

                Scanner scanner = new Scanner(System.in);
                try(scanner; bw;os;ow;socket;) {
                    while (true){
                        System.out.println("입력?");
                        String chat = scanner.nextLine();
                        bw.write(chat);
                        bw.newLine();
                        bw.flush();

                        if(chat.equals("bye")){
                            break;
                        }
                    }

                }


        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
