package IOStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //OutputStream os=new FileOutputStream("C:\\Users\\wangy\\IdeaProjects\\learning\\src\\huashen03.txt");
        //覆盖管道
        OutputStream os=new FileOutputStream("C:\\Users\\wangy\\IdeaProjects\\learning\\src\\huashen03.txt",true);
        //附加管道
        os.write(97);
        os.write('b');
        os.write("\r\n".getBytes());

        byte[] bytes="我爱你中国666".getBytes();
        os.write(bytes);

        os.write(bytes,0,3);
        os.close();


    }
}
