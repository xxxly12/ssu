package P.com.test;

import java.util.HashSet;
import java.util.Set;

public class SetTest2 {
    public static void main(String[] args)
    {
        //创建集合
        Set es = new HashSet();

        Employee e1 = new Employee("1000","tao");
        Employee e2 = new Employee("1000","tao");
//        Employee e2 = new Employee("1001","tao1");
        Employee e3 = new Employee("1002","tao2");
        Employee e4 = new Employee("1003","tao3");
        Employee e5 = new Employee("1004","tao4");
        Employee e6 = new Employee("1005","tao5");
//        System.out.println(e1.equals(e2));
//        System.out.println(e2);
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        es.add(e1);
        es.add(e2);
        es.add(e3);
        es.add(e4);
        es.add(e5);
        es.add(e6);

        System.out.println(es.size());
        System.out.println(e1.equals(e2));
    }
}
