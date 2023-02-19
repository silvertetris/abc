package org.abc.basicAPI;

import java.util.Arrays;

public class Test19 {
    public static void main(String[] args) {
        String title="**** 2018 Olympic ****";
        title=title.replaceAll("\\*", "="); //Pattern api in regex
        System.out.println(title);
        title=title.replaceAll("\\w+", "Winter");// /w : 모든 문자
        System.out.println(title);
        title=title.replaceAll("Winter", "Olympic");
        System.out.println(title);

        String str="1, 2, 3, 4, 5, 6, 7, 8";
        String[] result=str.split(",\\s*"); // /s : 모든 공백
        System.out.println(Arrays.toString(result));

        String temp= "-20";
        temp=temp.replaceFirst("\\W", "+");
        System.out.println(temp);
    }
}
