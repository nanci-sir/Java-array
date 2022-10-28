package array.create;

public class traverseDemo2 {
    public static void main(String[] args) {
        //数组遍历-求和
        //某部门5名员工的销售额分别是：16、26、36、6、100，请计算出他们部门的总销售额
        int[] money = {16, 26, 36, 6, 100};
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum += money[i];

        }
        System.out.println(sum);//184
    }
}
