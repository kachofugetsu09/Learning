package SORT;

public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right, int[] tmp) {
        if (left < right) {
            // 找到中间点
            int mid = (left + right) / 2;
            // 递归排序左半部分
            mergeSort(arr, left, mid, tmp);
            // 递归排序右半部分
            mergeSort(arr, mid + 1, right, tmp);
            // 合并两个有序子数组
            merge(arr, left, mid, right, tmp);
        }
    }

    // 合并两个有序子数组
    public static void merge(int[] arr, int left, int mid, int right, int[] tmp) {
        int i = left;      // 左半部分的起始索引
        int j = mid + 1;   // 右半部分的起始索引
        int t = 0;         // 临时数组的索引

        // 合并两个子数组
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
        }

        // 如果左半部分还有剩余元素
        while (i <= mid) {
            tmp[t++] = arr[i++];
        }

        // 如果右半部分还有剩余元素
        while (j <= right) {
            tmp[t++] = arr[j++];
        }

        // 将合并后的结果复制回原数组
        System.arraycopy(tmp, 0, arr, left, t);
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int[] tmp = new int[arr.length]; // 初始化临时数组
        mergeSort(arr, 0, arr.length - 1, tmp);

        // 输出排序后的数组
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
