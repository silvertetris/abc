package org.abc.basicAPI;

public class Test04 {
    public static void main(String[] args) {
        String s="    Amy    ";
        int len1 =s.length();

        String s2=s.trim();//trim=remove space
        int len2=s2.length();

        System.out.println(len1);
        System.out.println(len2);
        s="";
        System.out.println(s.length());
        System.out.println(s.isEmpty());
    }
}
