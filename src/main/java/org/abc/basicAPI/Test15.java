package org.abc.basicAPI;

import java.util.Random;

public class Test15 {
    public static void main(String[] args) {
        Random r2=new Random();
        for(int i =0; i<5; i++) {
            System.out.println(r2.nextInt(1, 10));
        }
    }
}
