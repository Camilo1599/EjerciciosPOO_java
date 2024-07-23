import java.util.ArrayList;

public class Course {
    private Integer code;
    private String courseName;
    private final ArrayList<Student> studentlist;

    public Course(Integer code, String courseName){
       studentlist = new ArrayList<>();
    }

    public Integer getCode(){
        return code;
    }
    public void setCode(Integer code){
        this.code = code;
    }

    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(Student student){
        studentlist.add(student);
    }
    public void removeStudent(Student student){
        studentlist.remove(student);
    }

}
