package COLLECTION;

import java.util.HashMap;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        System.out.println(map);

        //1.提取所有的key到一个set中
        Set<String> keys=map.keySet();
        //2.根据key获取value
        for(String key:keys){
            Integer value=map.get(key);
            System.out.println(key+"="+value);
        }
        //2.键值对遍历，把键值对看作一个整体
        Set<Map.Entry<String,Integer>> entries= map.entrySet();
        for(Map.Entry<String,Integer> entry:entries){
            String key=entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
