package org.abc.InputOutput;

import java.io.File;
import java.io.RandomAccessFile;

public class Test07 {
    public static void main(String[] args) {
        File f = new File("a.txt");
        try(RandomAccessFile raf=new RandomAccessFile(f, "rw")) { //1. 접근 대상 2. 접근 모드
            raf.seek(1); // 파일 포인터 1바이트 이동
            byte b=raf.readByte();
            System.out.println((char) b);

            byte[] arr=new byte[4];
            raf.read(arr); //raf 로 부터 읽은 걸 arr에 저장
            System.out.println(new String(arr));

            raf.seek(2); //포인터의 위치를 가장 처음부터 2바이트 이동.
            raf.write("good".getBytes());//그 위치에 저 문자를 바이트로 변형에서 출력
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
