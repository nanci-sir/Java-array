package array.create;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //学会动态化数组
        //数据类型[] 数组名 = new 数据类型[数组长度];
        double[] scores = new double[3];//{0.0,0.0,0.0// }
        //赋值                              0   1    2
        scores[0] = 99.9;
        scores[1] = 99.9;
        scores[2] = 99.9;
        System.out.println(scores[0]);//99.9
        System.out.println(scores[1]);//99.9
        System.out.println(scores[2]);//99.9

        String[] names = new String[90];
        names[0] = "张三";
        names[5] = "鲁肃";
        names[3] = "多环";
        System.out.println(names[0]);//张三
        System.out.println(names[5]);//鲁肃
        System.out.println(names[3]);//多环
        System.out.println(names[2]);//null

    }
}