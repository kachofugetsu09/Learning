package Exception;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        System.out.println("satrt");
try{
            saveAge(300);
    }
catch (Exception e){
    e.printStackTrace();
    System.out.println("年龄非法");
}
}
    //需求：我们公司的系统只要收到了小于1岁或者大于200岁，就是一个非法异常
    public static void saveAge(int age) {
        if(age<1||age>200){
            throw new AgeIlleagalRunTimeException("feifa");

        }else{
            System.out.println("hefa");
        }
    }
}
