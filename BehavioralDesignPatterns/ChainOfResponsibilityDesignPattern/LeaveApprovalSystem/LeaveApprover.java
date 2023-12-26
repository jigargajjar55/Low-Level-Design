package ChainOfResponsibilityDesignPattern.LeaveApprovalSystem;

//Abstract handler
public abstract class LeaveApprover {

    LeaveApprover nextApprover;
    String role;

    public LeaveApprover(String role, LeaveApprover nextApprover) {
        this.role = role;
        this.nextApprover = nextApprover;
    }

    public String getApproverRole() {

        return role;
    }

    public void processLeaveApplication(LeaveApplication leaveApplication) {

        if (this.nextApprover != null) {
            this.nextApprover.processLeaveApplication(leaveApplication);
        } else {
            System.out.println("Invalid request!!");
        }

    }

}