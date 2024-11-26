package SORT;

public class RadixSort {

    public static void radixSort(int[] arr) {
        // 创建一个二维数组作为桶，每个桶可以存储 arr.length 个数字
        int[][] bucket = new int[10][arr.length];
        // 记录每个桶中实际存储了多少个数字
        int[] bucketElementCounts = new int[10];

        // 找到数组中的最大数，以确定最大位数
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        // 得到最大数的位数
        int maxCount = Integer.toString(max).length();

        // 从个位开始，对每一位进行排序
        for (int i = 0; i < maxCount; i++) {
            // 遍历数组中的每个元素，将其放入对应的桶中
            for (int k = 0; k < arr.length; k++) {
                // 计算当前位的值 (个位、十位、百位...)
                int digit = (arr[k] / (int) Math.pow(10, i)) % 10;
                // 放入对应的桶中
                bucket[digit][bucketElementCounts[digit]] = arr[k];
                bucketElementCounts[digit]++;
            }

            // 按照桶的顺序，将数字取出放回原数组
            int index = 0;
            for (int k = 0; k < bucketElementCounts.length; k++) {
                // 只处理非空的桶
                if (bucketElementCounts[k] != 0) {
                    for (int x = 0; x < bucketElementCounts[k]; x++) {
                        arr[index] = bucket[k][x];
                        index++;
                    }
                }
                // 清空桶中的元素计数
                bucketElementCounts[k] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(arr);

        // 输出排序后的数组
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
