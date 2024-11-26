package COLLECTION;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraversalDemo6 {
    public static void main(String[] args) {
        //目标：掌握三种遍历的区别
        ArrayList<String> list=new ArrayList<>();
        list.add("java");
        list.add("特级枸杞");
        list.add("黑枸杞");
        list.add("枸杞子");
        //1.需求1删除所有枸杞
        //for(int i=0;i<list.size();i++){
        //            String name=list.get(i);
        //            if(name.contains("枸杞")){
        //                list.remove(name);
        //            }
        //
        //        }
        //        System.out.println(list);
        //方案1：迭代器遍历
        //问题可以被解决，用迭代器自己的删除方式来删除
        Iterator<String> it = list.iterator();
        while(it.hasNext()){//ConcurrentModificationException
            String name=it.next();
            if(name.contains("枸杞")){
                //list.remove(name);
                it.remove();
            }
        }
        System.out.println(list);
        //方案2：增强for遍历
        //问题：无法删除元素
        //for(String name:list){
        //    if(name.contains("枸杞")){
        //        list.remove(name);
        //    }
        //}
        //方案3：普通for遍历
        //问题：无法删除元素
        //for(int i=0;i<list.size();i++){
        //    String name=list.get(i);
        //    if(name.contains("枸杞")){
        //       list.remove(name);
        }
        }

