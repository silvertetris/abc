package org.abc.CollectionApi;

import java.util.Map;
import java.util.TreeMap;

public class Test09 {
    public static void main(String[] args) {
        TreeMap<String, String> users=new TreeMap<>();

        users.put("20080319", "김푸름");
        users.put("20070620", "김하늘");
        users.put("20050817", "오정임");
        users.put("20120728", "김유빈");
        users.put("20120924", "김용빈");

        System.out.println(users);

        Map.Entry<String, String> entry=null;

        entry=users.firstEntry();
        print("입사일자가 가장 빠른 사람 ", entry);
        entry=users.lastEntry();
        print("입사일자가 가장 늦은 사람", entry);

        entry=users.lowerEntry("20121231"); //인자로 받은 키값의 바로 이전의 키값
        print("2012년도에 가장 늦게 입사한 사람", entry);
        entry=users.higherEntry("20120101");//인자로 받은 키값의 바로 다음의 키값
        print("2012년도에 가장 빠르게 입사한 사람", entry);

        while (!users.isEmpty()) {
            entry=users.pollFirstEntry();
            print("퇴직한 사람", entry);
            System.out.println("남아있는 직원 수 : "+users.size());
        }
    }
    public static void print(String s, Map.Entry<String, String> entry) {
        System.out.println(s+" : "+entry.getKey()+" / "+entry.getValue());
    }
}
