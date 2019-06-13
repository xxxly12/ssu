package com.test;

public enum EnumTest {
    MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6){
        @Override
        public boolean isRset() {
            return true;
        }
    },sun(0){
        @Override
        public boolean isRset() {
            return true;
        }
    };
    private int value;
    EnumTest(int value) {
        this.value = value;

    }

    public int getValue() {
        return value;
    }


    public boolean isRset(){
        return false;
    }
    public static void main(String[] args) {
        System.out.println("EnumTest.FRI 的 value = " + EnumTest.FRI.getValue());
    }
}
