package other;
import java.util.HashSet;
import java.util.List;

import Enums.Language;
import Enums.LessonType;
import users.Student;
import users.Teacher;
public class Lesson {
    String lessonName;
    LessonType lessonType;
    Language language;
    Teacher teacher;
    HashSet<Student> students;
}
