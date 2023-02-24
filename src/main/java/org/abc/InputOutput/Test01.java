package org.abc.InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test01 {
    public static void main(String[] args) {
        try(FileInputStream fi = new FileInputStream("a.txt");//파일 입력
            FileOutputStream fo = new FileOutputStream("b.txt");) { //파일 출력
            int c=0;
            while ((c = fi.read()) != -1) {
                fo.write(c);//2진법 형태로 저장되기 때문에 문자를 저장 가능.
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
