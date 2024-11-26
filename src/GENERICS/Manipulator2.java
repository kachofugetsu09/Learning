package GENERICS;
class HasF{
    public void f(){System.out.println("Has.f();");}
}

public class Manipulator2<T extends HasF> {
    private T obj;
    public Manipulator2(T x){obj =x;}
    public void manipulate(){obj.f();}
}
