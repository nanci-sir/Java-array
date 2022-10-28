package array.create;

public class traverseDemo1 {
    public static void main(String[] args) {
        //学会数组遍历
        int[] arr = {12,34,5,67,87,44};
        //原始遍历方式
        System.out.println(arr[0]);//12
        System.out.println(arr[1]);//34
        System.out.println(arr[2]);//5
        System.out.println(arr[3]);//67
        System.out.println(arr[4]);//87
        System.out.println(arr[5]);//44
        //for (int i = 0; i <5 ; i++) {
        //System.out.println(arr[i]);
          //终极形式
            for (int i = 0; i <arr.length ; i++) {
                System.out.print(arr[i]+"\t");//12 34 5 67 87 44

        }
        }
    }

