package GENERICS;
abstract class GenericWithCreate<T>{
    final T element;
    GenericWithCreate(){element=creat();}
    abstract T creat();

}
class X{}
class Creator extends GenericWithCreate<X>{
    X creat(){return new X();}
    void f(){
        System.out.println(element.getClass().getSimpleName());

    }
}
public class CreatorGeneric {
    public static void main(String[] args){
        Creator c=new Creator();
        c.f();
    }
}
