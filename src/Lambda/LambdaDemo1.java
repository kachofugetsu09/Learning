package Lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Animal a=new Animal() {
            @Override
            public void cry() {
                System.out.println("miao");
            }
        };a.cry();

        System.out.println("******");
        //Swim s1=new Swim() {
        //            @Override
        //            public void Swimming() {
        //                System.out.println("youyong");
        //            }
        //        };

        Swim s1=()-> {
            System.out.println("youyong");
            };

        s1.Swimming();



    }
}
abstract  class Animal{
    public abstract  void cry();
}
@FunctionalInterface
interface  Swim{
    void Swimming();

}