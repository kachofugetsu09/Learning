package Exception;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        //目标：认识异常体系
        show();

    }
    public static void show(){
        System.out.println("start");
        //运行时异常，看是不是继承自runtimeexcepttion
        int[] arr = {1,2,3};

        System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
        System.out.println(10/0);// ArithmeticException
        String s=null;
        System.out.println(s); //NullPointerException
        System.out.println(s.length());// NullPointerException

    }

}
