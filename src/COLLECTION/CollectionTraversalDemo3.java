package COLLECTION;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversalDemo3 {
    public static void main(String[] args) {
        //目标：掌握collection的遍历方法之一，迭代器遍历
        Collection<String>names = new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("赵六");
        System.out.println(names);

        //1.得到这个集合的迭代器对象
        //迭代器站在集合的第一个内容的位置也就是index0
        Iterator<String> it = names.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        //2.使用一个while循环来遍历
        while(it.hasNext()){//看的是目前这个位置有没有数据
            System.out.println(it.next());
        }
    }
}
