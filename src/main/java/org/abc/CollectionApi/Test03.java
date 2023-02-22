package org.abc.CollectionApi;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Test03 {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(20);

        vector.addElement("서울");
        vector.addElement("도쿄");
        vector.addElement("뉴욕");

        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.elementAt(i) + "\t");
        }

        System.out.println("\n");

        System.out.println("1 : " + vector.firstElement());
        System.out.println("2 : " + vector.lastElement());

        vector.insertElementAt("파리", 2); print(3, vector);//삽입 오른쪽으로 밀림
        vector.setElementAt("런던", 1); print(4, vector);//set

        System.out.println("3 : " +vector.capacity());
        System.out.println("4 : "+vector.size());
        vector.trimToSize();//크기만큼 용량을 자름
        System.out.println("5 : "+vector.capacity());

        vector.removeElement("뉴욕"); print(6, vector);
        vector.removeElementAt(1); print(7, vector);
        vector.removeAllElements(); print(8, vector);

        List<String> list= Arrays.asList("서울", "도쿄", "뉴욕");
        vector.addAll(list); print(9, vector);
        vector.setSize(6); print(10, vector);
    }

    public static void print(int n, List<String> vector) {
        System.out.println(n + " : " + vector);
    }
}
