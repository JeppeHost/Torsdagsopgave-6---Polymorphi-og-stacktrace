import java.util.ArrayList;
public class Student extends Person {

    public ArrayList<String> passedCourses;
    public ArrayList<String> currentCourses;

    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = new ArrayList<String>();
    }

    @Override
    public boolean addCourse(String course) {
        if (passedCourses.contains(course)) {
            return false;
        } else {
            currentCourses.add(course);
            return true;
        }
    }
}
