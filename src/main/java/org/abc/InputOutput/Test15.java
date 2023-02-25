package org.abc.InputOutput;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test15 {
    public static void main(String[] args) {
        UserBean user=new UserBean("purum", "오정임", "010-123-4567", "서울");//UserBean 객체 필드 초기화

        try(ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("user.txt"))) {//user.txt 데이터 출력하게
            out.writeObject(user); //스트림에 출력 Object 타입으로
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
