package SORT;

import java.util.Arrays;

public class QuickSort {
    //选择一个基准值（Pivot）：从数组中选择一个元素作为“基准值”。
    // 通常可以选择第一个元素、最后一个元素或者中间的元素。
    // 分区（Partitioning）：将数组分成两个部分：比基准值小的放在左边，比基准值大的放在右边。
    // 这样做的目的是把基准值放到它最终应该在的位置上（即排序后的位置）。
    // 递归排序子数组：对左边的子数组和右边的子数组分别进行快速排序。
    // 递归地重复上述步骤，直到子数组的长度为0或1（此时数组已经有序）。
    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int l = left;
        int r = right;
        // 选择最左边的元素作为基准值
        int pivot = arr[left];

        while (l < r) {
            while (l < r && arr[r] >= pivot) r--;
            while (l < r && arr[l] <= pivot) l++;
            if (l < r) {
                // 交换左右指针指向的元素
                int tmp = arr[r];
                arr[r] = arr[l];
                arr[l] = tmp;
            }
        }
        // 将基准值放到正确的位置
        arr[left] = arr[l];
        arr[l] = pivot;

        // 递归排序左右子数组
        quickSort(arr, left, l - 1);
        quickSort(arr, l + 1, right);
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
