package ch19network.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class C09server {
    public static void main(String[] args) {
        //172.30.1.81
        //7000
        System.out.println("채팅 프로그램 시작");
        try (ServerSocket serverSocket = new ServerSocket(7000);){
        while (true){
            try {
                Socket socket = serverSocket.accept();
                Thread t = new Thread(() -> {
                    try {
                        InputStream is = socket.getInputStream();
                        Reader reader = new InputStreamReader(is);
                        BufferedReader br = new BufferedReader(reader);

                        try (br; reader; is; socket;) {
                            String line = "";
                            SocketAddress address = socket.getRemoteSocketAddress();

                            System.out.println(address + "님이 참여합니다.");

                            while ((line = br.readLine()) != null) {
                                System.out.println(address + ":" + line);

                                if (line.equals("bye")) {
                                    System.out.println(address + "님이 나갔습니다.");
                                    break;
                                }
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                t.start();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
