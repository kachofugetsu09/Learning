package STREAM;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        //目标：掌握stream提供的常用中间方法，对流上的数值进行处理。
        List<String> list =new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三");
        //过滤方法
        list.stream().filter(s->s.startsWith("张")&&s.length()==3).forEach(System.out::println);
        //排序方法
        List<Double> scores=new ArrayList<>();
        scores.add(98.5);
        scores.add(100.0);
        scores.add(85.5);
        scores.add(67.5);
        scores.add(67.5);
        scores.stream().sorted().forEach(System.out::println);//默认升序
        System.out.println("===========================================");
        scores.stream().sorted((s1,s2)->Double.compare(s2,s1)).limit(2).forEach(System.out::println);
        System.out.println("===========================================");
        scores.stream().sorted((s1,s2)->Double.compare(s2,s1)).skip(2).forEach(System.out::println);
        System.out.println("===========================================");
        scores.stream().sorted((s1,s2)->Double.compare(s2,s1)).distinct().forEach(System.out::println);
        System.out.println("===========================================");
        //加工方法：把流上原来的数据拿出来又放回到流上去。
        scores.stream().map(s->s+10).forEach(System.out::println);
        System.out.println("===========================================");
        //合并流
        Stream<String> stream1=Stream.of("a","b","c");
        Stream<Integer> stream2=Stream.of(111,222,333);
        Stream<Object> concat = Stream.concat(stream1, stream2);

    }
}
