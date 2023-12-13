package Research;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
 
public class Researcher{
    private Set<ResearchPaper> researchPapers = new HashSet<>();
    private Set<ResearchProject> researchProjects = new HashSet<>();
    private int hIndex;

    public Researcher() {}
    
    
    public void addResearchPaper(ResearchPaper paper) {
        researchPapers.add(paper);
    }

    public void addResearchProject(ResearchProject project) {
        researchProjects.add(project);
    }

    public void printPapers(Comparator<ResearchPaper> comparator , String projectName) {
    	for (ResearchPaper paper : researchPapers) {
            System.out.println(paper);
        }
    }
    public void printProjects(Comparator<ResearchPaper> comparator) {
    	for (ResearchProject project : researchProjects) {
            System.out.println(project.topic + " : " + project.authors);
        }
    }
    public void addResearchPaperToProject(ResearchPaper paper) {
        
        researchProjects.iterator().next().addPublishedPaper(paper);
    }

    public void removeResearchPaper(ResearchPaper paper) {
        researchPapers.remove(paper);
    }

    public void calculateHIndex() {
       
    }







}
