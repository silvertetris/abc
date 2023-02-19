package org.abc.basicAPI;

public class Test11 {
    public static void main(String[] args) {
        boolean bool = true;//기본형 선언
        byte b=12;
        char c='A';
        double d=3.14;
        float f=10.5f;
        int i=123;
        long l=123456789;
        short s=256;

        Boolean obj1=Boolean.valueOf(bool);//boxing 기본형->참조형
        Byte obj2=Byte.valueOf(b);
        Character obj3=Character.valueOf(c);
        Double obj4=Double.valueOf(d);
        Float obj5=Float.valueOf(f);
        Integer obj6=Integer.valueOf(i);
        Long obj7=Long.valueOf(l);
        Short obj8=Short.valueOf(s);

        boolean bool2=obj1.booleanValue();//unboxing 참조형->기본형
        byte b2=obj2.byteValue();
        char c2= obj3.charValue();
        double d2=obj4.doubleValue();
        float f2=obj5.floatValue();
        int i2=obj6.intValue();
        long l2=obj7.longValue();
        short s2=obj8.shortValue();
    }
}
