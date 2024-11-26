package StringLearning;

public class IntegerMatch {
    public static void main(String[] args){
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));//-?：匹配零个或一个负号。这个部分是可选的，所以它可以匹配没有负号的数字。
        System.out.println("+911".matches("-?\\d+"));
        System.out.println("-911".matches("(-|\\+)?\\d+"));
    }
}
