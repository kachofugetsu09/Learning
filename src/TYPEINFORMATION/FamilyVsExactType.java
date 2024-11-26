package TYPEINFORMATION;
class Base{

}
class Derived extends Base{}

public class FamilyVsExactType {
    static void test(Object  x){
        System.out.println("Testing x of type "+x.getClass());
        System.out.println("x intsanceof Base "+(x instanceof Base));
        System.out.println("x instanceof Derived"+(x instanceof Derived));
        System.out.println("Base.isInstance(x)"+Base.class.isInstance(x));
        System.out.println("Derived.class.isInstance(x)"+Derived.class.isInstance(x));
        System.out.println(x.getClass()==Base.class);//子类false
        System.out.println(x.getClass()==Derived.class);
        System.out.println(x.getClass().equals(Base.class));//子类false
        System.out.println(x.getClass().equals(Derived.class));

    }
    public static void main(String[] args){
        test(new Base());
        test(new Derived());
    }

}
