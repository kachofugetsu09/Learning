package StringLearning;

import java.util.Arrays;

public class Splitting {
    public static void main(String[] args){
        System.out.println(Arrays.toString(knights.split(" ")));
        System.out.println(Arrays.toString(knights.split("\\W+")));
        System.out.println(Arrays.toString(knights.split("n\\W+")));//结果是一个数组，将 n 和后面的非单词字符作为分隔符。因此，任何以 n 结尾并跟随非单词字符的部分都会被分割。
    }
    public static String knights="to be or not to be, this is a question .";

}
