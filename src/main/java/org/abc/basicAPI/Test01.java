package org.abc.basicAPI;

public class Test01 {
    public static void main(String[] args) {
        Object obj1=new Object();
        Object obj2=new Object();
        Object obj3=new Object();
        Class c=obj1.getClass();

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
        System.out.println(c.getName());
    }
}
