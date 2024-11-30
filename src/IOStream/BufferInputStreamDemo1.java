package IOStream;

import java.io.*;

public class BufferInputStreamDemo1 {
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

        try(FileInputStream fis=new FileInputStream(srcpath);
            InputStream bis=new BufferedInputStream(fis);
            FileOutputStream fos=new FileOutputStream(destpath);
            OutputStream bos=new BufferedOutputStream(fos);)
                //这里的括号中的资源一般要继承 Closeable接口，并且实现close方法，否则会报错
        {

            byte[] buffer=new byte[1024];
            int len;
            while((len=bis.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }

            System.out.println("复制完成");
        }

    }

}
