package IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream(new File("C:\\Users\\wangy\\IdeaProjects\\learning\\src\\huashen02.txt"));
        //定义一个变量记住每次读取多个内容的字节
        // int b=0;
        //while ((b=is.read())!=-1){
        //System.out.print((char)b);
        //}
        //每次读取一个字节性能差，读取汉字输出会出现乱码
        byte[] buffer=new byte[3];
        //定义一个变量记录每次读取了多少个字节,相比读取单个字节性能更强，减少了硬盘的访问次数
        int len;
        while((len=is.read(buffer))!=-1){
            String str=new String(buffer,0,len);
            System.out.print(str);

    }
        
    }
}
