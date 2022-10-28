# Java-array

### 什么是数组【理解】

​	数组就是存储数据长度固定的容器，存储多个数据的数据类型要一致。 

### 1.数组定义格式【记忆】

#### 1.1第一种

​	数据类型[] 数组名

​	示例：

```java
int[] arr;        
double[] arr;      
char[] arr;
```

```
package array.create;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //学会静态化定义数组
       // double[] score = new double[]{12.3,13.4,15.6};
        double[] score = {12.3,13.4,15.6};

        //int[] age = new int[]{12,23,34};
        int[] age = {12,23,34};

       // String[] names  = new String[]{"小名","小红","小黄"};
        String[] names  = {"小名","小红","小黄"};

        System.out.println(score);
    }
}
```



#### 1.2第二种

​	数据类型 数组名[]

​	示例：

```java
int arr[];
double arr[];
char arr[];
```

```
package array.create;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //理解数组的注意事项
        int[] age = {12,23,45};
        int age1[] = {23,45,77};

        //什么数组放什么类型
        //String[] names = {"张三","李四","王五","12"};
        
        //数组定义长度固定
        int[] age2 = {12,23,23};
        System.out.println(age2[3]);//只能到二
    }
}

```



### 2.数组动态初始化

#### 2.1什么是动态初始化

​	数组动态初始化就是只给定数组的长度，由系统给出默认初始化值。

#### 2.2动态初始化格式

```java
数据类型[] 数组名 = new 数据类型[数组长度];
```

```java
int[] arr = new int[3];
```

#### 2.3动态初始化格式详解

- 等号左边：

  -  int:数组的数据类型

  -  []:代表这是一个数组

  -  arr:代表数组的名称

- 等号右边：

  -   new:为数组开辟内存空间
- int:数组的数据类型
  -   []:代表这是一个数组
- 5:代表数组的长度

数组是属于什么类型，数组变量名中存储的是什么？ 引用数据类型，存储的数组在内存中的地址信息

```
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
```

#### 2.4动态初始化的写法

1. 动态初始化的写法是什么样的？ 数据类型[] 数组名 = new 数据类型[长度]; int[] ages = new int[4]; 

2. **两种数组定义时的特点和场景有什么区别**

   ⚫**当前已经知道存入的元素值，用静态初始化。** 

   ⚫**当前还不清楚要存入哪些数据，用动态初始化**

   ```
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
   
   ```

   两种初始化的的使用场景总结、注意事项说明： 

   ⚫ 动态初始化：只指定数组长度，后期赋值，适合开始知道数据的数量，但是不确定具体元素值的业务场景。

    ⚫ 静态初始化：开始就存入元素值，适合一开始就能确定元素值的业务场景

    动态初始化数组后元素的默认值是什么样的？

   ⚫ byte、short、int 、char、long类型数组元素的默认值都是0 

   ⚫ float、double类型数组元素的默认值都是0.0 

   ⚫ boolean类型数组元素的默认值是false、String类型数组元素的默认值是null

### 3.数组元素访问【应用】

#### 3.1什么是索引

​	每一个存储到数组的元素，都会自动的拥有一个编号，从0开始。

​	这个自动编号称为数组索引(index)，可以通过数组的索引访问到数组中的元素。 	

#### 3.2访问数组元素格式

```java
数组名[索引];
```

```java
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

```

1.如何访问数组的元素？ 数组名称[索引]

2. 如何访问数组的长度？ 数组名称.length  数组名称[索引] 

3. 数组的最大索引怎么获取？ 数组名. length – 1 // 前提：元素个数大于0

- 

### 4.数组遍历

- 数组遍历：就是将数组中的每个元素分别获取出来，就是遍历。遍历也是数组操作中的基石。

  如何遍历数组？

   int[] ages = {20, 30, 40, 50}; 

  for (int i = 0; i < ages.length; i++)
   { System.out.println(ages[i])；}

  ```java
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
  ```

#### 4.1数组遍历求和

某部门5名员工的销售额分别是：16、26、36、6、100，请计算出他们部门的总销售额

```
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
```

如何实现批量数据的求和?

⚫ 使用数组存储批量数据

 ⚫ 遍历数组中的每个数据，然后定义变量把他们累加起来。

#### 4.2数组最值

- 最大值获取：从数组的所有元素中找出最大值。

  ```java
  package array.create;
  
  public class traverseDemo3 {
      public static void main(String[] args) {
          //求最大值
          int[] faceScores = {15, 9000, 10000, 20000, 9500, -5};
          int max = faceScores[0];
          for (int i = 0; i < faceScores.length; i++) {
                  if(faceScores[i] > max) {
                      max = faceScores[i];
                  }
          }System.out.println(max);
  
          }
      }
  
  ```


 数组元素求最大值如何实现的？

 ① 数据拿到程序中去，用数组装起来。

 ② 定义一个变量用于记录最大值，这个变量建议默认存储第一个元素值作为参照。 

③ 遍历数组的元素，如果该元素大于变量存储的元素，则替换变量存储的值为该元素。

 ④ 循环结束后输出最大值变量即可。 目录 Contents ➢ 数组的定义 ➢ 数组的遍历 ➢ 数组的案例 ◆ 数组元素求

猜数字

需求 开发一个幸运小游戏，游戏规则如下： 游戏后台随机生成1-20之间的5个数（无所谓是否重复），然后让大家来猜数字： ➢ 未猜中提示：“未命中”，并继续猜测 ➢ 猜中提示：“运气不错，猜中了”，并输出该数据第一次出现的位置，且输出全部5个数据， 最 终结束本游戏。

```
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
```

猜数字游戏的实现步骤？

 动态初始化数组，存入5个随机的1-20之间的数据 ② 定义一个死循环，不断的猜数据，遍历数组，判断数据是否在数组中，如果在，进行 对应提示并结束死循环；如果没有猜中，提示继续。

#### 4.3随机排名

某公司开发部5名开发人员，要进行项目进展汇报演讲，现在采取随机排名后进行汇报。 请先依次录入5名员工的工号，然后展示出一组随机的排名顺序。

```
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
```

 如何实现随机排名的？ ① 定义一个动态初始化的数组用于录入数据。 ② 遍历数组中的每个元素，每次随机一个索引值，让当前元素与该索引位置处的元素进行交换。 ③ 遍历输出数组中的内容即可。

冒泡排序

```
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
```

冒泡排序的实现步骤。 

⚫ 定义一个外部循环控制总共需要冒几轮（数组的长度-1）

 ⚫ 定义一个内部循环，控制每轮依次往后比较几个位置（数组长度-i-1）。

 ⚫ 如果当前位置的元素值>后一个位置的元素值，两者交换。 



### 5.内存分配

#### 5.1内存概述

​	内存是计算机中的重要原件，临时存储区域，作用是运行程序。

​	我们编写的程序是存放在硬盘中的，在硬盘中的程序是不会运行的。

​	必须放进内存中才能运行，运行完毕后会清空内存。 

​	Java虚拟机要运行程序，必须要对内存进行空间的分配和管理。 

#### 5.2java中的内存分配

- 目前我们只需要记住两个内存，分别是：栈内存和堆内存

| 区域名称   |                            作用                            |
| ---------- | :--------------------------------------------------------: |
| 寄存器     |                给CPU使用，和我们开发无关。                 |
| 本地方法栈 |     JVM在使用操作系统功能的时候使用，和我们开发无关。      |
| 方法区     |                 存储可以运行的class文件。                  |
| 堆内存     |      存储对象或者数组，new来创建的，都存储在堆内存。       |
| 方法栈     | 方法运行时使用的内存，比如main方法运行，进入方法栈中执行。 |

#### 5.3什么是静态初始化

​	在创建数组时，直接将元素确定	

#### 5.4静态初始化格式

- 完整版格式

  ```java
  数据类型[] 数组名 = new 数据类型[]{元素1,元素2,...};
  ```

- 简化版格式

  ```java
  数据类型[] 数组名 = {元素1,元素2,...};
  ```

```java
package array.create;

public class memoyDemo1 {
    public static void main(String[] args) {

                int a = 10;
        System.out.println(a);
        int[] arr = new int[]{11, 22, 33};
                arr[0] = 44;
                arr[1] = 55;
                arr[2] = 66;
                System.out.println(arr[0]);
                System.out.println(arr[1]);
                System.out.println(arr[2]);
            }
        }
    
```

两个数组变量指向同一个数组对象

![image-20221028163349860](C:\Users\lenovo\AppData\Roaming\Typora\typora-user-images\image-20221028163349860.png)

```
package array.create;

public class memoyDemo2 {
    public static void main(String[] args) {

                int[] arr1 = {11, 22, 33};
                int[] arr2 = arr1;
                System.out.println(arr1);
                System.out.println(arr2);
                arr2[1] = 99;
                System.out.println(arr1[1]);
                System.out.println(arr2[1]);
            }
        }
```

#### 5.2数组操作索引越界异常

- 出现原因

  ```java
  public class ArrayDemo {
      public static void main(String[] args) {
          int[] arr = new int[3];
          System.out.println(arr[3]);
      }
  }
  ```

  **数组长度为3，索引范围是0~2，但是我们却访问了一个3的索引。**

  程序运行后，将会抛出ArrayIndexOutOfBoundsException 数组越界异常。在开发中，数组的越界异常是不能出现的，一旦出现了，就必须要修改我们编写的代码。 

- 解决方案

  将错误的索引修改为正确的索引范围即可！

#### 5.6空指针异常

- 出现原因

  ```java
  public class ArrayDemo {
      public static void main(String[] args) {
          int[] arr = new int[3];
  
          //把null赋值给数组
          arr = null;
          System.out.println(arr[0]);
      }
  }
  ```

  arr = null 这行代码，意味着变量arr将不会再保存数组的内存地址，也就不允许再操作数组了，因此运行的时候会抛出 NullPointerException 空指针异常。在开发中，数组的越界异常是不能出现的，一旦出现了，就必须要修改我们编写的代码。

- 解决方案

  给数组一个真正的堆内存空间引用即可！

  如果访问的元素位置超过最大索引，执行时会出现ArrayIndexOutOfBoundsException(数组索引越界异常) 如果数组变量中没有存储数组的地址，而是null, 在访问数组信息时会出现NullPointerException(空指针异常)

  
