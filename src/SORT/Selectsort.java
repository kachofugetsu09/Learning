package SORT;

public class Selectsort {
    public static void main(String[] args) {
        // 创建测试数组
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("原始数组:");
        printArray(arr);

        // 调用选择排序方法
        selectSort(arr);

        System.out.println("排序后数组:");
        printArray(arr);
    }

    // 打印数组的辅助方法
    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void selectSort(int[] arr){
        if (arr == null || arr.length <= 1) {
            return;
        }
         for(int i=0;i<arr.length;i++){
             int min=i;
             for(int j=i+1;j< arr.length;j++){
                 if(arr[j]<arr[min]){
                     min=j;
                 }
             }
             int tmp=arr[i];
             arr[i]=arr[min];
             arr[min]=tmp;


         }

    }
}
