package ChainOfResponsibilityDesignPattern.LeaveApprovalSystem;

import ChainOfResponsibilityDesignPattern.LeaveApprovalSystem.LeaveApplication.Type;

//A concrete handler

public class Manager extends LeaveApprover {

	public Manager(LeaveApprover nextApprover) {
		super("Manager", nextApprover);
	}

	@Override
	public void processLeaveApplication(LeaveApplication application) {
		if (application.getType() == Type.Sick) {

			application.approve(getApproverRole());
			
		} else if (application.getType() == Type.PTO && application.getNoOfDays() <= 5) {

			application.approve(getApproverRole());

		} else {
			super.processLeaveApplication(application);
		}

	}

}