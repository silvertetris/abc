package org.abc.basicAPI;

import java.util.Calendar;
import java.util.Date;

public class Test17 {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);

        Calendar c=Calendar.getInstance();

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH)+1);//range of month is 0~11, should plus one
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));

        c.clear();//clear original data
        c.set(2020,3,19);
        int year=c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println("날짜 정보 : " +year + "/" +month + "/" + day);
    }
}
