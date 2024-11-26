package StringLearning;

public class Hex {
    public static String format(byte[] data){
        StringBuilder result= new StringBuilder();
        int n=0;
        for(byte b: data){
            if(n%16==0){
                result.append(String.format("%05x: ",n));//这里的 %05x 是一个格式化占位符，表示将一个整数格式化为至少 5 位的十六进制数，不足 5 位时用零填充。
            }
            result.append(String.format("%02x: ",b));
            n++;
            if(n%16==0)result.append("\n");
        }
        result.append("\n");
        return result.toString();
    }
    public static void main(String[] args) {
        // Example byte array for demonstration
        byte[] data = {0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07,
                0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F,
                0x10, 0x11, 0x12, 0x13};
        String formattedData = format(data);
        System.out.println(formattedData);
    }

}
