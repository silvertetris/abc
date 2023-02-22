package org.abc.CollectionApi;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Test04 {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(20);

        vector.addElement("서울");
        vector.addElement("도쿄");
        vector.addElement("뉴욕");

        Enumeration<String> en=vector.elements(); // Iterator <->Enumeration ArrayList<->Vector

        while (en.hasMoreElements()) {
            String city = en.nextElement();
            System.out.println(city);
        }

        System.out.println("===================");

        Enumeration<String> en2=vector.elements();
        Iterator<String> iter=en2.asIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
