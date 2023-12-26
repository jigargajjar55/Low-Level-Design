package ChainOfResponsibilityDesignPattern.LeaveApprovalSystem;

import ChainOfResponsibilityDesignPattern.LeaveApprovalSystem.LeaveApplication.Type;

//A concrete handler
public class Director extends LeaveApprover {

	public Director(LeaveApprover nextApprover) {
		super("Director", nextApprover);
	}
	
	@Override
	public void processLeaveApplication(LeaveApplication application) {
		if(application.getType() == Type.PTO) {
			application.approve(getApproverRole());
			
		}else{
			super.processLeaveApplication(application);
		}
	
	}
	
}
