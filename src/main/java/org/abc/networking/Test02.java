package org.abc.networking;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test02 {
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(8080)) {
            System.out.println("서버가 시작되었습니다.");

            while(true) {
                try(Socket client = server.accept();
                    OutputStream out=client.getOutputStream();
                    InputStream in = client.getInputStream();) {
                    out.write("HTTP/1.0 200 OK\n".getBytes());
                    out.write("Content-Type: text/html\n\n".getBytes());
                    out.write("<h1>Have a nice day!!</n1>".getBytes());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
