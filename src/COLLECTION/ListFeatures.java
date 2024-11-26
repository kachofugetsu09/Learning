package COLLECTION;
import java.util.*;

public class ListFeatures {


    public static void main(String[] args) {
        // 创建一个初始容量为10的整数列表
        List<Integer> intList = new ArrayList<>(10);

        // 添加元素到列表
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        // 打印初始列表
        System.out.println("初始列表: " + intList);

        // 获取列表的大小
        System.out.println("列表大小: " + intList.size());
        List<Integer>sub =intList.subList(1,3);//不包含3
        System.out.println(sub);

        // 访问特定索引的元素
        System.out.println("索引2的元素: " + intList.get(2));

        // 修改特定索引的元素
        intList.set(2, 99);
        System.out.println("修改索引2后的列表: " + intList);

        // 检查列表中是否包含某个元素
        System.out.println("列表是否包含4: " +
                intList.contains(4));

        // 移除某个元素
        intList.remove(Integer.valueOf(4));
        System.out.println("移除4后的列表: " + intList);

        // 移除特定索引的元素
        intList.remove(0);
        System.out.println("移除索引0后的列表: " + intList);

        // 清空列表
        intList.clear();
        System.out.println("清空后的列表: " + intList);

        // 检查列表是否为空
        System.out.println("列表是否为空: " + intList.isEmpty());

    }
}