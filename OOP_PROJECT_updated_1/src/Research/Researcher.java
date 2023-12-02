package Research;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
 
public class Researcher implements CanDoResearch{
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

    public void printPapers(Comparator<ResearchPaper> comparator) {
    	for (ResearchPaper paper : researchPapers) {
            System.out.println(paper);
        }
    }

    public void calculateHIndex() {
       
    }



	public void conductResearch() {
		// TODO Auto-generated method stu
		
	}

	public void BecomeResearcher() {}


}
