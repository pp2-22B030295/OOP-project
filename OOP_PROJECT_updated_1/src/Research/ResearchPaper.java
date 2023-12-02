package Research;

import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ResearchPaper {
    private String title;
    private String authors;
    private int page;
    String text;
    private LocalDateTime publishedDate = LocalDateTime.now();;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String date = publishedDate.format(formatter);
    List<String> citations;
    

    public ResearchPaper(String title, String authors, int page) {
        this.title = title;
        this.authors = authors;
        this.page = page;
    }
    
    
    public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthors() {
		return authors;
	}


	public void setAuthors(String authors) {
		this.authors = authors;
	}


	public int getPage() {
		return page;
	}


	public void setPage(int pages) {
		this.page = page;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public LocalDateTime getPublishedDate() {
		return publishedDate;
	}


	public void setPublishedDate(LocalDateTime publishedDate) {
		this.publishedDate = publishedDate;
	}

	public List<String> getCitation(Format format) {
        // Возвращает цитиров
        return citations;
    }


	public String toString() {
		return "Title: " + title + 
			   "\nAuthors: " + authors + 
			   "\n" + text +
			   "\nPage: " + page;
	}
    
    
}