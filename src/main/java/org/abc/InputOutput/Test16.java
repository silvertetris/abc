package org.abc.InputOutput;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test16 {
    public static void main(String[] args) {
        try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("user.txt"))) {
            UserBean user=(UserBean) in.readObject(); //Object 타입으로 읽은걸 UserBean타입으로 캐스팅해서 user에 저장
            System.out.println(user); //UserBean타입으로 캐스팅된 것. String 으로 출력됨
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
