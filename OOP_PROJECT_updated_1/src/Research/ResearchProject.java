package Research;

import java.text.Format;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ResearchProject {
    String topic;
    String authors;
    String doi;
    String journal;
    String pages;
    Date publicationDate;
    List<ResearchPaper> researchPapers;
    List<String> citations;
    

    private Set<ResearchPaper> publishedPapers = new HashSet<>();
    private Set<Researcher> projectMembers = new HashSet<>();

    public ResearchProject(String topic) {
        this.topic = topic;
    }
    
    
    public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}


	public Set<ResearchPaper> getPublishedPapers() {
		return publishedPapers;
	}
	public void setPublishedPapers(Set<ResearchPaper> publishedPapers) {
		this.publishedPapers = publishedPapers;
	}


	public Set<Researcher> getProjectMembers() {
		return projectMembers;
	}
	public void setProjectMembers(Set<Researcher> projectMembers) {
		this.projectMembers = projectMembers;
	}


	public void addPublishedPaper(ResearchPaper paper) {
        publishedPapers.add(paper);
    }

    public void addProjectMember(Researcher researcher) {
        projectMembers.add(researcher);
    }
    
    List<String> getCitation(Format f) {
		return citations;
	}
    
}


