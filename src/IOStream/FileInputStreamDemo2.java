package IOStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream(("C:\\Users\\wangy\\IdeaProjects\\learning\\src\\huashen02.txt"));
        byte[] bytes = is.readAllBytes();
        String rs=new String(bytes);
        System.out.println(rs);



    }
}
