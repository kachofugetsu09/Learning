package Exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            System.out.println(div(10,0));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("程序出现异常");
        }
        System.out.println("end");

    }
    //求两个数的除的结果并返回这个结果
    public static int div(int a,int b) throws Exception {
        if(b==0){
            throw new Exception("除数不能为0");
        }
        int result=a/b;
        return result;
    }
}
