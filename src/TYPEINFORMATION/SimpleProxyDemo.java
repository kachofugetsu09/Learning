package TYPEINFORMATION;
interface  Interface{
    void dosomething();
    void somethingelse(String str);
}
class RealObject implements Interface{

    @Override
    public void dosomething() {
        System.out.println("do Something");
    }

    @Override
    public void somethingelse(String str) {
        System.out.println("do"+str);

    }
}
class SimplePorxy implements Interface{
    private Interface proxied;
    public SimplePorxy(Interface proxied){
        this.proxied=proxied;
    }
    @Override
    public void dosomething() {
        System.out.println("do Something");
        proxied.dosomething();
    }

    @Override
    public void somethingelse(String str) {
        System.out.println("do"+str);
        proxied.somethingelse(str);

    }
}

public class SimpleProxyDemo {
    public static void consumer(Interface iface){
        iface.dosomething();
        iface.somethingelse("1");
    }
    public static void main(String[] args){
        consumer(new RealObject());
        consumer(new SimplePorxy(new RealObject()));
    }


}
