package org.abc.InputOutput;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class Test08 {
    public static void main(String[] args) {
        try(Reader reader = new FileReader("user.properties")) {//Reader 객체 생성
            Properties user = new Properties(); //Properties 객체 생성
            user.load(reader); //key=value 목록 불러옴

            System.out.println(user.getProperty("id"));
            System.out.println(user.getProperty("name"));
            System.out.println(user.getProperty("password"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
