package COLLECTION;
import java.util.*;

public class MapOperation {
    public static void main(String[] args) {
        Map<String, Integer> intmap = new HashMap<>();
        intmap.put("First", 1);
        intmap.put("Second", 2);

        // 打印整个 Map
        System.out.println("Map 内容: " + intmap);

        // 通过键获取值
        int a = intmap.get("First");
        System.out.println("Key 'First' 对应的值: " + a);

        // 检查 Map 是否包含特定的键或值
        System.out.println("Map 是否包含键 'Second': " + intmap.containsKey("Second"));
        System.out.println("Map 是否包含值 1: " + intmap.containsValue(1));

        // 使用 entrySet() 遍历 Map
        System.out.println("\n使用 Map.Entry 遍历 Map:");
        for (Map.Entry<String, Integer> entry : intmap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // 修改一个 entry 的值
        System.out.println("\n修改 'Second' 的值为 20:");
        for (Map.Entry<String, Integer> entry : intmap.entrySet()) {
            if (entry.getKey().equals("Second")) {
                entry.setValue(20);
            }
        }

        // 再次打印 Map 内容以验证修改
        System.out.println("修改后的 Map 内容: " + intmap);
    }
}
