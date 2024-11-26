package SORT;
import java.util.Arrays;
//交换相邻元素，使其递增，将最大元素放到最后
public class BubbleSort {
    public static void main(String[] args){
        testBubbleSort();

    }
    public static void testBubbleSort() {
        // 测试用例1：正常数组
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr1);
        assert Arrays.equals(arr1, new int[]{11, 12, 22, 25, 34, 64, 90}) : "测试用例1失败";

        // 测试用例2：已排序数组
        int[] arr2 = {1, 2, 3, 4, 5};
        bubbleSort(arr2);
        assert Arrays.equals(arr2, new int[]{1, 2, 3, 4, 5}) : "测试用例2失败";

        // 测试用例3：逆序数组
        int[] arr3 = {5, 4, 3, 2, 1};
        bubbleSort(arr3);
        assert Arrays.equals(arr3, new int[]{1, 2, 3, 4, 5}) : "测试用例3失败";

        // 测试用例4：包含重复元素的数组
        int[] arr4 = {3, 3, 2, 1, 5, 2, 4};
        bubbleSort(arr4);
        assert Arrays.equals(arr4, new int[]{1, 2, 2, 3, 3, 4, 5}) : "测试用例4失败";

        // 测试用例5：空数组
        int[] arr5 = {};
        bubbleSort(arr5);
        assert Arrays.equals(arr5, new int[]{}) : "测试用例5失败";

        System.out.println("所有测试用例通过！");
    }
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            boolean swapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    swapped=true;
                }

            }
            if(!swapped){
                break;
            }
        }
    }
}




