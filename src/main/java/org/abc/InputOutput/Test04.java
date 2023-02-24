package org.abc.InputOutput;

import java.io.*;

public class Test04 {
    public static void main(String[] args) {
        byte[] arr=null;
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("a.txt"));
             ByteArrayOutputStream out = new ByteArrayOutputStream();) {
            byte[] buf = new byte[1024];
            int len=0;
            while((len=in.read(buf)) !=-1) { //a.txt를 필터를 적용하면서 모두 읽음.
                out.write(buf, 0, len);//1.바이트 데이터 2.시작점 3.출력할 바이트의 길이, buf에 출력함
            }
            arr=out.toByteArray(); //arr에 저장
            String s=new String(arr);
            System.out.println(s);
        }catch (Exception e) {
            e.printStackTrace();
        }

        try(BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("a2.txt"))) {
            bo.write(arr);//필터 적용된 아웃풋 스트림으로 a2.txt에 arr을 출력함
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
