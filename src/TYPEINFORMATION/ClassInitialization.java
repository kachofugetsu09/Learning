package TYPEINFORMATION;
import java.util.*;
class Initable{
    static final int staticFinal = 47;
    static final int staticFinal2 =ClassInitialization.rand.nextInt(1000);
    static{
        System.out.println("INitializing Initable");
    }
}
class Initable2{
    static int staticNonFinal=147;
    static {
        System.out.println("INitializing Initable2");
    }
}
class Initable3{
    static int staticNonFinal=47;
    static {
        System.out.println("INitializing Initable3");
    }
}

public class ClassInitialization {
    public static Random rand=new Random(47);
    public static void main(String[] args) throws Exception{
        Class initable= Initable.class;
        System.out.println("After creating Initable ref");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNonFinal);//强制产生了对类的初始化因为不是final static 编译期常量
        Class initable3=Class.forName("TYPEINFORMATION.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }
}
