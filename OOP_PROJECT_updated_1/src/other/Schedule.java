package other;

import java.util.HashSet;
import java.util.Set;

public class Schedule {
	public Set<Lesson> lessons = new HashSet<Lesson>();
	
	public Schedule() {}
	
	public void seeSchedule() {
        System.out.println("Lesson Schedule");
        System.out.println("---------------------");
        System.out.printf("%-20s %-15s %-15s %-10s %-10s %-10s\n", "Lesson Name", "Lesson Type", "Language", "Start Time", "End Time", "Week Day");
        System.out.println("---------------------");

        // Display information for each lesson
        for (Lesson lesson : lessons) {
            System.out.printf("%-20s %-15s %-15s %-10s %-10s %-10s\n",
                    lesson.lessonName,
                    lesson.lessonType,
                    lesson.language,
                    lesson.startTime,
                    lesson.endTime,
                    lesson.weekDay);
        }
        System.out.println("---------------------");
    }
}
