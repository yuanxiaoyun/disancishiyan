package disancishiyan;
import java.util.Scanner;
public class Test {
    public static void main(String[] arg) {
        Course y = new Course("1", "大学英语视听说", "图304", "7:50");
        Course x = new Course("2", "高等数学", "教202", "13:30");
        Course w = new Course("3", "Web前端设计", "综0901", "9:40");
        Teacher a = new Teacher(1, "liston", "男", y);
        Teacher b = new Teacher(2, "崔丽敏", "女", x);
        Teacher m = new Teacher(3, "马亮", "男", w);
        Student c = new Student(1, "马董", "男", "无");
        System.out.println(y + "\n" + a + "\n");
        System.out.println(x + "\n" + b + "\n");
        System.out.println(w + "\n" + m + "\n");

        System.out.println("选课请输入1,");
        Scanner i = new Scanner(System.in);
        String n = i.nextLine();
        switch (n) {
            case "1":
                System.out.println("请输入课程编号");
                Scanner d = new Scanner(System.in);
                int e = d.nextInt();
                switch (e) {
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
                break;
            default:
                System.out.println("操作错误");
                System.exit(-1);
        }
        System.out.println("退课请输入1,其余输入0");
        Scanner l = new Scanner(System.in);
        int f = l.nextInt();
        switch (f) {
            case 1:
                c.setCourse("未选课");
                System.out.println(b);
                break;
            case 0:
                System.out.println("选课成功" + "\n" + c);
                break;
            default:
                System.out.println("输入错误");
                System.exit(1);
        }
        }
    }


