package IOStream;

import java.io.BufferedReader;
import java.io.*;

public class BufferedReaderDemo1 {
    public static void main(String[] args) {
        try(Reader ft=new BufferedReader(new FileReader("src//huashen"))){
//            char[] chs=new char[1024];
//            int len;
//            while((len= ft.read(chs))!=-1){
//                String s=new String(chs,0,len);
//                System.out.println(s);
//            }
            String Line;
            while((Line= ((BufferedReader) ft).readLine())!=null){
                System.out.println(Line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
