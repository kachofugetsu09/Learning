package FILE;

import java.io.File;
import java.util.Arrays;

public class FileDemo2 {
    public static void main(String[] args) {
        File dir=new File("D:/resource");
        File[] files=dir.listFiles();
        for(File f:files){
            System.out.println(f.getName());
        }
        System.out.println(files);
        System.out.println(Arrays.toString(files));
    }
}
