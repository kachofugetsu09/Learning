package STREAM;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.*;

public class StreamDemo2 {
    public static void main(String[] args)
    {
//获取集合的stream流，调用集合提供的stream（）方法
        Collection<String> list=new ArrayList<>();
        Stream<String> s1=list.stream();

        Map<String,Integer> map=new HashMap<>();
        Stream<String> s2=map.keySet().stream();
        Stream<Integer> s3=map.values().stream();
        Stream<Map.Entry<String,Integer>>s4=map.entrySet().stream();
        //获取数组的流
        String[] names={"张三","李四","王五"};
        Stream<String> s5=Stream.of(names);
        System.out.println(s5.count());//直接打印数量
        Stream<String> s6=Stream.of("张无忌","赵敏","周芷若");

    }
}
