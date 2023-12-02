package other;

import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class News implements Comparable<News> {
    public String theme;
    private String text;
    private Date date;

    public News(String theme, String text, Date date) {
        this.theme = theme;
        this.text = text;
        this.date = new Date(date.getTime()); // Ensure a copy of the provided date is used
    }

    public String getTheme() {
        return theme;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return new Date(date.getTime()); // Ensure a copy of the internal date is returned
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return Objects.equals(theme, news.theme) && Objects.equals(date, news.date);
    }

    public int hashCode() {
        return Objects.hash(theme, date);
    }

    public int compareTo(News other) {
        int dateComparison = this.date.compareTo(other.date);
        if (dateComparison != 0) {
            return dateComparison;
        }
        return this.theme.compareTo(other.theme);
    }

    // Custom comparator for sorting by date then by theme
    public static Comparator<News> getComparator() {
        return Comparator.comparing(News::getDate).thenComparing(News::getTheme);
    }
}
