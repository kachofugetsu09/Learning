package IOStream;

import java.io.FileWriter;
import java.io.*;

public class BufferedWriterDemo1 {
    public static void main(String[] args) {
        try (Writer fw = new FileWriter("C:\\Users\\wangy\\IdeaProjects\\learning\\src\\huashen02.txt",true);
             BufferedWriter bw=new BufferedWriter(fw);



        )
        {
            bw.write("a");
            bw.write(98);
            bw.write('花');
            bw.write("\r\n");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

