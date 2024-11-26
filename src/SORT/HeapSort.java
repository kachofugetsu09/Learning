package SORT;

public class HeapSort {

    // 下沉调整函数，用于维护堆的性质
    public void downAdjust(int[] arr, int index, int n) {
        int largest = index;  // 初始化最大值索引为当前节点
        int leftChild = 2 * index + 1;  // 左子节点索引
        int rightChild = 2 * index + 2; // 右子节点索引

        // 如果左子节点存在且大于当前最大值，更新最大值索引
        if (leftChild < n && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }

        // 如果右子节点存在且大于当前最大值，更新最大值索引
        if (rightChild < n && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }

        // 如果最大值索引不是当前节点，交换并递归调整
        if (largest != index) {
            int tmp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = tmp;
            // 递归调整受影响的子树
            downAdjust(arr, largest, n);
        }
    }

    // 初始化堆，将数组调整为大顶堆
    public void initHeap(int[] arr, int n) {
        // 从最后一个非叶子节点开始，向上调整堆
        for (int i = (n - 2) / 2; i >= 0; i--) {
            downAdjust(arr, i, n);
        }
    }

    // 堆排序函数
    public void sortFunction(int[] arr) {
        int n = arr.length;

        // 构建初始大顶堆
        initHeap(arr, n);

        // 逐步将堆顶元素（最大值）与末尾元素交换，并调整堆
        for (int i = n - 1; i > 0; i--) {
            // 交换堆顶元素和当前末尾元素
            int tmp = arr[i];
            arr[i] = arr[0];
            arr[0] = tmp;

            // 调整堆，使其继续保持大顶堆性质
            downAdjust(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        // 测试数组
        int[] arr = {4, 10, 3, 5, 1};

        // 创建HeapSort对象
        HeapSort heapSort = new HeapSort();

        // 执行堆排序
        heapSort.sortFunction(arr);

        // 输出排序后的数组
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
