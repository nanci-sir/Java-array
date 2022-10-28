package array.create;
import java.util.Random;
import java.util.Scanner;
import java.util.ServiceConfigurationError;
public class traverseDemo5 {
    public static void main(String[] args) {
        //随机排名
        //1.动态初始化一个数组
        int[] codes = new int[5];
        //2定义循环，循环五次
        Scanner sc = new Scanner(System.in);//扫描器
        for (int i = 0; i < codes.length; i++) {
            //录入工号
            System.out.println("请输入第"+(i+1)+"个员工的工号：");
            int code = sc.nextInt();
            //存在数组
            codes[i] = code;
        }
        //3.遍历数组元素位置，随机索引
        Random r = new Random();
        for (int i = 0; i < codes.length; i++) {
            //随机一个索引位置：codes[index]
            int index = r.nextInt(codes.length);
            //定义一个临时变量
            int temp = codes[index];
            codes[index] = codes[i];
            codes[i] = temp;
        }
        //4.遍历数组元素输出
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i]+"\t");
        }
    }
}
