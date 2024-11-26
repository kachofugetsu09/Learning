package TYPEINFORMATION;

class C implements A{
    @Override
    public void f() {System.out.println("f");

    }
    public void g() {System.out.println("g");

    }
    void u() {System.out.println("u");
    }
    protected void v() {System.out.println("v");

    }
    private void w() {System.out.println("w");

    }

}
public class HiddenC{
    public static A makeA(){return new C();}
}
