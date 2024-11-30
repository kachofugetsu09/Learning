package IOStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataStreamDemo1 {
    public static void main(String[] args) {
        try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("src//huashen01",true))){
            dos.writeByte(1);
            dos.writeDouble(3.14);
            dos.writeUTF("花神");

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
