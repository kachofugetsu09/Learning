package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo1 {
    public static void main(String[] args) {
        try(PrintStream ps=new PrintStream(new FileOutputStream(("src//huashen01"),true));){
            ps.println("hello world");
            ps.print("a");
            ps.print("\r\n");
            ps.print("花神花神");
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
