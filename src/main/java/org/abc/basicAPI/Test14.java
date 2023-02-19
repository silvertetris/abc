package org.abc.basicAPI;

import java.util.StringTokenizer;

public class Test14 {
    public static void main(String[] args) {
        String msg="Although the world is full of suffering, it is full also of the overcoming of it.";

        StringTokenizer st1=new StringTokenizer(msg);//공백 기준으로 구분
        System.out.println("단어 수 : " +st1.countTokens());

        System.out.println("========================");
        String s="id=guest&name=Amy&pwd=1004";
        StringTokenizer st2=new StringTokenizer(s, "&");//delimiter=구분 문자
        while (st2.hasMoreTokens()) {
            System.out.println("남아있는 토큰 수 : " + st2.countTokens());
            System.out.println(st2.nextToken());
        }

        System.out.println("=======================");
        StringTokenizer st3=new StringTokenizer(s, "=&");//=문자 또는 &문자로 구분
        while(st3.hasMoreTokens()) {
            System.out.println(st3.nextToken());
        }
    }
}
