package STREAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        //stream流终结方法
        List<Teacher> teachers =new ArrayList<>();
        teachers.add(new Teacher("张三",23,5000));
        teachers.add(new Teacher("李四",24,6000));
        teachers.add(new Teacher("王五",25,7000));
        teachers.add(new Teacher("赵六",26,8000));

        teachers.stream().filter(t->t.getSalary()>6000).forEach(System.out::println);
        System.out.println("===========================================");
        long count = teachers.stream().filter(t -> t.getSalary() > 6000).count();
        System.out.println(count);
        System.out.println("===========================================");
        Optional<Teacher> max = teachers.stream().max((t1, t2) -> Double.compare(t1.getSalary(), t2.getSalary()));
        Teacher maxTeacher=max.get();
        System.out.println(maxTeacher);
        System.out.println("===========================================");
        List<String> list =new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三");

        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        List<String> list1=s1.collect(Collectors.toList());
        System.out.println(list1);

        Stream<String> s2 = list.stream().filter(s -> s.startsWith("张"));
        Set<String> set=s2.collect(Collectors.toSet());
        System.out.println(set);


        Stream<String> s3 = list.stream().filter(s -> s.startsWith("张"));
        Object[] array=s3.toArray();
        System.out.println(array);
        System.out.println("===========================================");
        Stream<Teacher> s4 = teachers.stream().sorted((t1, t2) -> Double.compare(t1.getSalary(), t2.getSalary()));
        Map<String,Double> map=s4.collect(Collectors.toMap(Teacher::getName,Teacher::getSalary));
        System.out.println(map);


    }
}
