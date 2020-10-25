package disancishiyan;

 public class Teacher extends People {
     Course y;

     Teacher(int id, String name, String sex, Course y) {
         super(id, name, sex);
         this.y = y;
     }
     public String toString() {

         return "{" + "教师编号:"+ getId() + "姓名:" + getName() + "性别:" + getSex() + "课程名称：" + y.Coursename + "}";
     }
 }
