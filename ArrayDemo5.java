package array.create;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //掌握动态吃实话元素默认规则
        //整型默认0
        int[] arr = new int[10];
        System.out.println(arr[0]);//0
        System.out.println(arr[9]);//0

        //字符数组默认0
        char[] chars = new char[100];
       System.out.println((int)chars[0]);//0
       System.out.println((int)chars[99]);//0
       //浮点默认0
        double[] scores = new double[90];
        System.out.println(0);//0.0
        System.out.println(99);//0.0
        //布尔类型数组
        boolean[] booleans = new boolean[100];
        System.out.println(booleans[0]);//false
        System.out.println(booleans[99]);//false
        //引用类型数组
        String[] names = new String[100];
        System.out.println(names[0]);//null
        System.out.println(names[99]);//null
    }
}
