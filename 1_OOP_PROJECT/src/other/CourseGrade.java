package other;

import Enums.Semester;

import java.util.Map;
import java.util.TreeMap;

public class CourseGrade implements Comparable<CourseGrade> {
    public String courseCode;
    public Map<Semester, Grade> courseGrade = new TreeMap<>(); 
    public CourseGrade(String courseCode) {
        this.courseCode = courseCode;
    }

    public void addGrade(Semester semester, Grade grade) {
        courseGrade.put(semester, grade);
    }

    public Map<Semester, Grade> getCourseGrades() {
        return courseGrade;
    }

    public int compareTo(CourseGrade other) {
        return this.courseGrade.keySet().iterator().next().compareTo(other.courseGrade.keySet().iterator().next());
    }
}
