package IOStream;

import java.io.*;

public class InputStreamReaderDemo1 {
    public static void main(String[] args) {
        try(InputStream is=new FileInputStream(("src//huashen01"));
            InputStreamReader isr=new InputStreamReader(is,"GBK");
            BufferedReader br= new BufferedReader(isr);

        ){
//            char[] chs=new char[1024];
//            int len;
//            while((len= ft.read(chs))!=-1){
//                String s=new String(chs,0,len);
//                System.out.println(s);
//            }
            String Line;
            while ((Line = (br.readLine())) != null) {
                System.out.print(Line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
