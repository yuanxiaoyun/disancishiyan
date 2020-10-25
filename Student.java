package disancishiyan;
public class Student extends People {
    private String Course;
    public Student(int id, String name, String sex, String Course) {
        super(id, name, sex);
        this.Course = Course;
    }

 public void setCourse(String Course){
    this.Course = Course;
 }
 public String toString(){
        return"{"+ "学号:" + getId() + "姓名:" + getName() + "性别:" + getSex() + "所选课程：" + Course + "}";
 }
}



