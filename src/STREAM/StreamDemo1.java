package STREAM;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        //认识stream流
        List<String> list =new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三");

        //1.先用传统方式，找到姓张的人，名字为三个字，扔到新集合中
        ArrayList<String> newList = new ArrayList<>();
        for(String name : list){
            if(name.startsWith("张") && name.length()==3){
                newList.add(name);
            }
        }
        //使用stream流解决
        List<String> newList2 =list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).collect(Collectors.toList());
        System.out.println(newList2);
    }
}
