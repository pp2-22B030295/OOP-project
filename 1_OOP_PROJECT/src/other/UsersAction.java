package other;

import java.util.Date;

public class UsersAction {
    private String userId;
    private String action;
    private Date actionDate;

    public UsersAction(String userId, String action, Date actionDate) {
        this.userId = userId;
        this.action = action;
        this.actionDate = actionDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }
    
    @Override
    public String toString() {
        return "UsersAction{" +
                "userId='" + userId + '\'' +
                ", action='" + action + '\'' +
                ", actionDate=" + actionDate +
                '}';
    }
}
