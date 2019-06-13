package com.test;



public enum Enumtest01  {
    MON, TUE, WED, THU, FRI, SAT, SUN;
    public static void main(String[] args) {
        for (Enumtest01 enumtest01:Enumtest01.values()){
            System.out.println(enumtest01);
        }
        System.out.println("----------------我是分隔线------------------");
        Enumtest01 tue = Enumtest01.MON;
        int i = WED.compareTo(TUE);
        System.out.println(i);
        switch (tue){
    case MON:
        System.out.println("今天是星期一");
        break;
    case FRI:
        System.out.println("今天是星期五");
        break;
    default:
        System.out.println(tue);
        break;
}
        System.out.println("----------------我是分隔线------------------");

        Class<Enumtest01> declaringClass = Enumtest01.TUE.getDeclaringClass();
        System.out.println(declaringClass.getName());
    }
}
