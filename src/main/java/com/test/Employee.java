package P.com.test;

public class Employee {
    String num;//员工编号
    String name;

    Employee(String num,String name){
        this.num = num;
        this.name = name;
    }
    //重写equals方法,如果员工编号相同并且名字相同，则是同一个对象
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o instanceof Employee){
            Employee e = (Employee) o;
            if (e.num.equals(this.num) && e.name.equals(this.name))
            {
                return true;
            }
        }
        return false;
    }
    //重写Hashcode方法
    public int hashCode(){
        //以员工编号分组，可散列均匀分布
        return num.hashCode();
    }

}
