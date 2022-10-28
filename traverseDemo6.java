package array.create;

public class traverseDemo6 {
    public static void main(String[] args) {
        //冒泡排序
        //1.定义数组排序
        int[] arr = {5,2,3,1};
        //2.定义循环次数
        for (int i = 0; i < arr.length - 1; i++) {
         //3.控制循环次数占位
            for (int j = 0; j <arr.length -i-1; j++) {
                //判断大小
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                }
                }
            }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        }
    }
