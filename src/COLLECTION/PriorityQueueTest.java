package COLLECTION;

import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueTest {
    public static void main(String[] args) {
        // 优先队列，使用自定义比较器进行绝对值排序和反序
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int absCompare = Integer.compare(Math.abs(o1), Math.abs(o2));
                if (absCompare != 0) {
                    return absCompare; // 按绝对值排序
                } else {
                    return Integer.compare(o2, o1);
                }
            }
        });
        // 添加一些元素
        int[] numbers = {10, -5, 3, -7, 2, -10, 5, -3, 7};
        for (int number : numbers) {
            queue.add(number);
        }
        // 打印排序后的元素
        System.out.println("按绝对值排序并在绝对值相同的情况下反序：");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}
