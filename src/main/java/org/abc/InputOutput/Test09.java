package org.abc.InputOutput;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Properties;

public class Test09 {
    public static void main(String[] args) {
        try(Writer writer=new FileWriter("car.properties")) {
            Properties car=new Properties();
            car.setProperty("model", "X5");
            car.setProperty("engine", "2000");
            car.setProperty("fuel", "3.3");

            car.store(writer, "car information");//car에 저장한 key=value 값을 writer에 저장, 2번째 인자는 주석문
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
