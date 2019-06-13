package P.com.test;

public class Demo {
    int div(int a,int b)throws FuShuException{
        if (b<0){
            throw new  FuShuException(b,"出现了除数是负数的情况");
        }
        return a/b;
    }

    public static void main(String[] args) throws FuShuException {
//        Demo demo = new Demo();
//        demo.div(2,-1);
        int i = new Demo().hashCode();
        System.out.println(i);
       int j= new Demo().hashCode();
        System.out.println(j);
        String a="abc";
        boolean abc = a.equals("abc");
        System.out.println(abc);
    }
}
