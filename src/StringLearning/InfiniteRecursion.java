package StringLearning;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
    public String toString(){
        return " InfiniteRecursion address: "+this +"\n";//看到+号自动转化成String 重复调用自己了,可以修改为super.toString
    }
    public static void main(String[] args){
        List<InfiniteRecursion> v=new ArrayList<InfiniteRecursion>();
        for(int i=0;i<10;i++){
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);

    }
}
