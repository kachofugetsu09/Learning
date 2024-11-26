package FILE;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args)throws Exception {
        // 创建一个File对象
        File f1=new File("C:\\Users\\wangy\\Pictures\\979ec90f1a20fa26cceb5aff8032b03a.png");
        System.out.println(f1.length());
        System.out.println(f1.exists());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.getName());
        System.out.println(f1.getAbsolutePath());
        //使用相对路径定位文件对象，只要带有盘符都称之为绝对路径
        //相对路径不带盘符，默认到idea工程下的根目录下找
        File f2=new File("src\\huashen");
        System.out.println(f2.exists());
        System.out.println(f2.length());
        File f3=new File("src\\Limboo.txt");
        System.out.println(f3.exists());
        System.out.println(f3.createNewFile());

        File f4 = new File("src/H");
        System.out.println(f4.mkdirs());

        File f6=new File("src\\Limboo.txt");
        System.out.println(f6.delete());//只能删除空文件夹和空文件，不可以删除非空
        //获取某个文件下的所有文件名称
        File f5=new File("src");
        String[] name= f5.list();
        for(String s:name){
            System.out.println(s);
        }
        File[] files=f5.listFiles();
        for(File f:files){
            System.out.println(f.getAbsolutePath());
        }
    }
}
