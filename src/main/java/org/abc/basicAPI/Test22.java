package org.abc.basicAPI;

import java.text.DecimalFormat;

public class Test22 {

    public static void main(String[] args) {
        double n=1234.23;

        DecimalFormat df1=new DecimalFormat("0");
        System.out.println(df1.format(n));

    }
}
