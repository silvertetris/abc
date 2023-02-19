package org.abc.basicAPI;

public class Test05 {
    public static void main(String[] args) {
        String address[] = {"경기도 남양주 별내동", "서울시 영등포구 당산동",
                "충남 천안시 서북구", "서울시 양천구 목동",
                "서울시 송파구 석촌동", "전북 부안공 부안읍"};

        System.out.println("1");

        for (String s : address) {
            if (s.contains("서울시")) {
                System.out.println(s);
            }
        }
        System.out.println("2");
        for (String s : address) {
            if (s.lastIndexOf("별내동") != -1) {
                System.out.println(s);
            }
        }
        System.out.println("3");
        for(int i=0; i<address.length; i++) {
            if(address[i].startsWith("서울시")){
                System.out.println(address[i]);
            }
        }
        System.out.println("4");
        for(int i=0; i<address.length; i++) {
            if(address[i].endsWith("별내동")) {
                System.out.println(address[i]);
            }
        }
    }
}
