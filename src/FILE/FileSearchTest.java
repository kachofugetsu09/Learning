package FILE;

import java.io.File;

public class FileSearchTest {
    public static void main(String[] args) {
        try {
            File dir = new File("E:");
            searchFile(dir, "QQ.exe");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 搜索文件
     * @param dir 搜索的目录
     * @param filename 要搜索的文件名
     */
    public static void searchFile(File dir,String filename)throws Exception{
        if(dir==null||!dir.exists()||dir.isFile()){
            return;
        }
        //获取该目录下的所有子目录和文件
        File[] files=dir.listFiles();
        if(files!=null&&files.length>0){
            for(File f:files){
                if(f.getName().equals(filename)){
                    System.out.println("sucsessful"+f.getAbsoluteFile());
                    Runtime r=Runtime.getRuntime();
                    r.exec(f.getAbsolutePath());
                }
                else{
                    searchFile(f,filename);
                }
            }
        }

    }
}
