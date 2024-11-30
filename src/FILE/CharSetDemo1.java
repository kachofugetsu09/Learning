package FILE;

import java.util.Arrays;

public class CharSetDemo1 {
    public static void main(String[] args) throws  Exception {
        //目标：实现字符编码和解码
        String str = "我爱你中国abc666";
        //byte[] bytes=str.getBytes();
        byte[] bytes = str.getBytes("GBK");
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        //2.解码
        String name2=new String(bytes,"GBK");
        System.out.println(name2);
    }
}
