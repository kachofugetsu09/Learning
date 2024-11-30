package IOStream;

import java.io.FileReader;
import java.io.*;

public class FileReaderDemo1
{
    public static void main(String[] args) {
        try (Reader fr = new FileReader("C:\\Users\\wangy\\IdeaProjects\\learning\\src\\huashen02.txt")) {
            char[] chs=new char[1024];
            int len;
            while((len=fr.read(chs))!=-1){
                System.out.print(new String(chs,0,len));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
