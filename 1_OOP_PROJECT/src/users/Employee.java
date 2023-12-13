package users;

import java.util.HashMap;
import java.util.Map;

import Enums.ResearchActionType;
import Research.CanDoResearch;
import Research.ResearchPaper;
import Research.Researcher;
import Research.ResearcherType;
import other.Message;

public abstract class Employee extends User implements CanDoResearch {
    double salary;
    Map<String, Message> receivedMessages;
    Researcher researcher = new Researcher();
    ResearcherType researcherType = ResearcherType.NON_RESEARCHER;
    
    public Employee() {}
    public Employee(String id, String fullName, double salary , String password) {
        super(id, fullName , password);
        this.salary = salary;
        this.receivedMessages = new HashMap<>();
    }

    void readMessages(String sender) {
        for (Map.Entry<String, Message> entry : receivedMessages.entrySet()) {
            if (entry.getKey().equals(sender)) {
                System.out.println(entry.getValue().getContent());
            }
        }
    }

    void receiveMessage(String employeeId, Message message) {
        receivedMessages.put(employeeId, message);
    }

    void sendMessage(Employee recipient, String message) {
        Message m = new Message(id, message);
        recipient.receiveMessage(id, m);
    }
    public void createResearchPaper(String title, String authors, int page, String text) {
    	if(researcherType == ResearcherType.RESEARCHER)	{
    		ResearchPaper newPaper = new ResearchPaper(title, authors, page);
	        newPaper.setText(text);
	        researcher.addResearchPaper(newPaper);    
    	}
    }
    public void conductResearch(ResearchPaper paper , ResearchActionType act) {
	    if(researcherType == ResearcherType.RESEARCHER)	{
    		switch (act) {
	        case ADD_PAPERS_TO_PROJECT:
	            researcher.addResearchPaperToProject(paper);
	            break;
	        case REMOVE_PAPER:
	            researcher.removeResearchPaper(paper);
	            break;
	
	        case ADD_PAPER:
	            researcher.addResearchPaper(paper);
	            break;
	        case SHOW_RESEARCH_PROJETS:
	        	researcher.printProjects(null);
	        default:
	            System.out.println("Invalid research action type");
	            break;
    		}
	    }
    }
    public void BecomeResearcher() {
		researcherType = ResearcherType.RESEARCHER;
	}
}
