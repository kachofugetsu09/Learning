package IOStream;

import java.io.*;

public class FileWriterDemo1 {
    public static void main(String[] args) {
        try (Writer fw = new FileWriter("C:\\Users\\wangy\\IdeaProjects\\learning\\src\\huashen02.txt",true)) {
            fw.write("a");
            fw.write(98);
            fw.write('花');
            fw.write("\r\n");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

