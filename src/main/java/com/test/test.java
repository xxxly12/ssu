package com.test;

import java.util.EnumMap;
import java.util.EnumSet;

public class test {
    public static void main(String[] args) {
        EnumSet<EnumTest> enumTests = EnumSet.allOf(EnumTest.class);
//        for (EnumTest enumTest : enumTests) {
//            System.out.println(enumTest.getValue());
//        }

        EnumMap enumMap = new EnumMap(EnumTest.class);
        enumMap.put(EnumTest.MON,"星期一");
        enumMap.put(EnumTest.TUE, "星期二");
        enumMap.put(EnumTest.THU,"星期四");
        enumMap.put(EnumTest.FRI,"星期五");
        enumMap.put(EnumTest.SAT,"星期六");
        Object o1 = enumMap.get(EnumTest.SAT);
        System.out.println(o1);
        for (Object o : enumMap.keySet()) {
            System.out.println(o+"   "+enumMap.get(o));
        }

    }
}
