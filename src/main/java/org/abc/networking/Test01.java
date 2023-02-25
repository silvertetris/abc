package org.abc.networking;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Test01 {
    public static void main(String[] args) {
        try (Socket socket = new Socket("www.credu.co.kr", 80); //Socket은 tcp 통신을 위한 객체
             OutputStream out = socket.getOutputStream();
             InputStream in = socket.getInputStream();) {//데이터 주고 받기 위해 스트림 생성
            out.write("GET / HTTP/1.0\n\n".getBytes());//서버에 데이터 전송(write)

            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int length = 0;
            while ((length = in.read(buf)) != -1) {//서버로부터 데이터 읽음
                bytes.write(buf, 0, length);//byte 배열에 출력
            }
            System.out.println(new String(bytes.toByteArray()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
