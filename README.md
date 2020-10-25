# 实验三 学生选课模拟系统
# 实验目的  
学会定义类中的属性以及方法  
掌握面向对象的类的设计方法（属性、方法）  
掌握类的继承方法、通过构造方法实例化对象  
学会使用super()，用于子类实例化  
掌握使用Object根类的tostring()方法，应用在相关对象的信息输出中  
# 实验要求  
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）  
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息；模拟学生退课操作，再打印课程信息。
# 实验过程
1.先分析父类与子类  
2.创建三个老师，三个课程，一个学生对象并赋值  
3.打印课程信息  
4.选课输入  
5.利用switch()控制选课的信息  
6.提示是否退课  
7.打印最终的选课信息  
# 实验流程图
![流程图.png](https://i.loli.net/2020/10/25/BRX8h2s7fl1C9pE.png)
# 核心代码
 # System.out.println("选课请输入1,");
         Scanner i = new Scanner(System.in);//创建一个新的基于输入的对象
         String n = i.nextLine();//将输入的数字赋值给n
        switch (n) {
            case "1":
                System.out.println("请输入课程编号");
                Scanner d = new Scanner(System.in);
                int e = d.nextInt();
                switch (e) {//选课
                    case 1:
                        c.setCourse(y.Coursename);
                        break;
                    case 2:
                        c.setCourse(x.Coursename);
                        break;
                    case 3:
                        c.setCourse(w.Coursename);
                        break;
                    default:
                        System.out.println("输入错误");
                        System.exit(1);
                }
                 System.out.println("退课请输入1,其余输入0");
        Scanner l = new Scanner(System.in);
        int f = l.nextInt();//调用l对象，将返回值赋值给变量f
        switch (f) {
            case 1:
                c.setCourse("未选课");
                System.out.println(b);
                break;
            case 0:
                System.out.println("选课成功" + "\n" + c);//选课成功，打印选课信息
                break;
            default:
                System.out.println("输入错误");
                System.exit(1);
        }
 # 运行截图 
![运行图.png](https://i.loli.net/2020/10/25/1CqVzSRQMa2jfek.png)
 # 实验感想
 在做完这次实验后，我更加清楚的了解了类，类的对象等概念，同时我也理解了父类与子类的继承，而且对于父类和子类的函数继承也有了一定的认识，子类是无法继承父类的构造函数的，我也对super()有了一点理解，super()是调用父类中的某一条语句，对于tostring（），我知道了他是一种返回一个“以文本方式表示”此对象的字符串
 ，同时该实验还用到了switch结构，因为有了以前的编程语言基础，所以能简单的写出选择结构控制选课，这次实验，我知道了 Scanner的用法，但是不熟悉，只是通过询问同学与查询资料理解了他的用法，但是并没有真正的体会他的更多用法，希望老师下次能讲解一下。这次实验在一开始网上查询后，老师让自己试着写时的一片空白，到慢慢的写了流程图后，才有了思路。同时老师也告诉我写代码时尽量吧代码写规范，我也牢记了这一点，但是代码整体排版还是不够好，下次慢慢的改进。
