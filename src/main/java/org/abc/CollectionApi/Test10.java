package org.abc.CollectionApi;

import java.util.*;

public class Test10 {
    public static void main(String[] args) {
        lotto_generator(5);
    }

    public static void lotto_generator(int n) {
        Random number= new Random();
        HashSet<Integer> lotto; //초기화
        for(int i=0; i<n; i++) {
            lotto= new HashSet<>();

            for(int j=0; lotto.size()<=5; j++) {
                int k=number.nextInt(46);
                if(k==0) {
                    continue;
                }
                lotto.add(k);
            }

            List<Integer> L = new ArrayList<>(lotto);
            Collections.sort(L);
            System.out.println(L);
        }
    }
}
