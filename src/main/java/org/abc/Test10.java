package org.abc;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test10 {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newCachedThreadPool();//스레드 풀 생성
        Future<Date> future = threadPool.submit(new Callable<Date>() {//submit 통해서 callable 객체값 반환

            @Override
            public Date call() throws Exception {
                Thread.sleep(1000);
                return new Date();
            }
        });
        threadPool.shutdown();


        Date date = null;
        try {
            date = future.get();//반환된 값을 가져옴
            System.out.println(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
