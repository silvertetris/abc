package org.abc.CollectionApi;

import java.util.ArrayList;
import java.util.Iterator;

public class Test02 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("서울");
        list.add("북경");
        list.add("상해");
        list.add("서울");
        list.add("도쿄");
        list.add("뉴욕");

        for(String s: list) {
            System.out.println(s);
        }
        System.out.println("==================");

        Iterator<String> iter = list.iterator();//StringToken 처럼 커서로 각 리스트의 인덱스를 확인함
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
