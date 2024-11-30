package IOStream;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) {
        //源文件
        //C:\Users\wangy\Pictures\Akashic.png
        //目标文件
        //C:\\Users\\wangy\\IdeaProjects\\learning\\src\\Akashic.png

        try {
            String srcpath="C:\\Users\\wangy\\Pictures\\Akashic.png";
            String destpath="C:\\Users\\wangy\\IdeaProjects\\learning\\src\\Akashic.png";
            copy(srcpath, destpath);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void copy(String srcpath,String destpath)throws Exception{
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis=new FileInputStream(srcpath);
            fos=new FileOutputStream(destpath);
            byte[] buffer=new byte[1024];
            int len;
            while((len=fis.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }

            System.out.println("复制完成");
        } finally {
            fis.close();
            fos.close();

        }

    }

}
