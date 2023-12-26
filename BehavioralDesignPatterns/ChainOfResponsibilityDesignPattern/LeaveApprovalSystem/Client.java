package ChainOfResponsibilityDesignPattern.LeaveApprovalSystem;

import java.time.LocalDate;

import ChainOfResponsibilityDesignPattern.LeaveApprovalSystem.LeaveApplication.Type;

public class Client {

	public static void main(String[] args) {

		LeaveApplication application = LeaveApplication.getBuilder().withType(Type.Sick).from(LocalDate.now())
				.to(LocalDate.of(2023, 12, 28)).build();
		System.out.println(application);

		LeaveApprover approver = createApproverChain();

		approver.processLeaveApplication(application);

		System.out.println(application);

	}

	private static LeaveApprover createApproverChain() {
		LeaveApprover leaveApprover = new ProjectLead(new Manager(new Director(null)));

		return leaveApprover;
	}

}
