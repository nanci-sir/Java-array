package array.create;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //学会访问数组元素
       // 取值
        int[] ages = new int[]{12,23,34};
        int a = ages[0];
        System.out.println(a);//12
        System.out.println(ages[1]);//23
        System.out.println(ages[2]);//34
       // 赋值
        ages[2] = 100;
        System.out.println(ages[2]);//100
        //访问数组长度
        System.out.println(ages.length);//3
        //数组的最大索引(元素个数大于0)

        System.out.println(ages.length-1);//2


    }
}
