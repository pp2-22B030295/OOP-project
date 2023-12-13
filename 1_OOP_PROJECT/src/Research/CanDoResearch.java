package Research;

import Enums.ResearchActionType;

public interface CanDoResearch {
    void BecomeResearcher();
    void conductResearch(ResearchPaper paper , ResearchActionType act);

}
