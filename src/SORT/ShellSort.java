package SORT;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("排序前：" + Arrays.toString(arr));
        shellSort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));
}
    public static void shellSort(int[] arr) {
        int n = arr.length;
        //步长gap即 间隔多少个插入排序一次
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int tmp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > tmp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = tmp;//arr[i],arr[j]=arr[j],arr[i];
            }
        }
    }
    }

