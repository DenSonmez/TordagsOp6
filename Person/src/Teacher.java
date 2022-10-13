import java.util.ArrayList;

public class Teacher extends Person{

    private ArrayList<String> canTeach  = new ArrayList<>();

    private ArrayList<String>currentCourses = new ArrayList<>();


    public Teacher(String name, ArrayList<String> canTeach ) {
        super(name);
        this.canTeach = canTeach;

    }
    @Override
    public boolean addCourse(String course) {
        for (String s : canTeach) {
            if (course.equalsIgnoreCase(s)) {
                currentCourses.add(course);
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "canTeach=" + canTeach +
                ", currentCourses=" + currentCourses +
                '}';
    }
}
