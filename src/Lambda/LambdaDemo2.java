package Lambda;

import java.util.Arrays;

public class LambdaDemo2 {
    public static void main(String[] args) {
        //类名：：静态方法
        //对象名::实例方法
        //特定类型的方法使用
        //需求：有一个字符串数组里面有一些人的英文名字按照名字的首字母排序。
        String[] names = {
                "Tom", "Jerry", "Tony", "Tom", "Jerry", "Tom"};
        //Arrays.sort(names);//默认按照首字母编号排
        //        //需求：要求忽略首字母的大小进行升序排序
        //        Arrays.sort(names, new Comparator<String>() {
        //            @Override
        //            public int compare(String o1, String o2) {
        //                return o1.compareToIgnoreCase(o2);
        //            }
        //        })
        //        System.out.println(Arrays.toString(names));
        //    }
        //Arrays.sort(names,(o1,o2)->o1.compareToIgnoreCase(o2));
        Arrays.sort(names,String::compareToIgnoreCase);
        //特定方法引用 类型名称：：方法名
        //要求后面是入参o2，前面是引参 o1
        System.out.println(Arrays.toString(names));




    }



}
