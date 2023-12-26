package ChainOfResponsibilityDesignPattern.LeaveApprovalSystem;

import ChainOfResponsibilityDesignPattern.LeaveApprovalSystem.LeaveApplication.Type;

//A concrete handler
public class ProjectLead extends LeaveApprover {

    public ProjectLead(LeaveApprover nextApprover) {
        super("Project Lead", nextApprover);
    }

    @Override
    public void processLeaveApplication(LeaveApplication application) {
        if (application.getType() == Type.Sick && application.getNoOfDays() <= 2) {

            application.approve(getApproverRole());

        } else {
            super.processLeaveApplication(application);
        }

    }
}
