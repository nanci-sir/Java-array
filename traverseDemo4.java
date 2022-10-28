package array.create;
import java.util.Random;
import java.util.Scanner;
public class traverseDemo4 {
    public static void main(String[] args) {
        //猜数字 开发一个幸运小游戏，游戏规则如下： 游戏后台随机生成1-20之间的5个数（无所谓是否重复），然后让大家来猜数字
        //1.定义动态数组
        int[] data = new int[5];
        //2.动态生成数字
        Random r = new Random();
        for (int i = 0; i <data.length ; i++) {
          data[i] = r.nextInt(20)+1;
        }
        //3.使用死循环猜数字
        Scanner sc = new Scanner(System.in);//扫描器
        OUT:
        while(true){
            System.out.println("请输入一到二十整数：");
           int gussData = sc.nextInt();
           //4.遍历看是否相等
            for (int i = 0; i < data.length; i++) {
            if    (data[i] == gussData){
                System.out.println("您猜中了！索引是："+i);
                break OUT;//结束整个死循环
            }
            }
            System.out.println("没猜中，重新猜！");
        }
        //5.输出全部元素
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]+"\t");

        }
    }
}
