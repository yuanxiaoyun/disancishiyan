package disancishiyan;
public class Course {
    String number;
    String Coursename;
    String Place;
    String time;

    Course(String number, String Coursename, String Place, String time) {
        setnumber(number);
        setCoursename(Coursename);
        setPlace(Place);
        settime(time);
    }

    public void setnumber(String number) {
        this.number = number;
    }

    public void setCoursename(String Coursename) {
        this.Coursename = Coursename;
    }

    public void setPlace(String Place) {
        this.Place = Place;
    }

    public void settime(String time) {
        this.time = time;
    }

    public String toString() {
        return "{" + "课程编号:" + number + "课程名称:" + Coursename + "上课地点:" + Place + "上课时间：" + time + "}";
    }
}