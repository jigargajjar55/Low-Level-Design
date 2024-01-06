package StateDesignPattern.OrderExample;

import StateDesignPattern.OrderExample.State.Cancelled;
import StateDesignPattern.OrderExample.State.Delivered;
import StateDesignPattern.OrderExample.State.InTransit;
import StateDesignPattern.OrderExample.State.New;
import StateDesignPattern.OrderExample.State.OrderState;
import StateDesignPattern.OrderExample.State.Paid;

//Context class
public class Order {
	//current state of order
	private OrderState currentState;
	
	public Order() {
		currentState = new New();
	}
	
	public double cancel() {
		double charges = currentState.handleCancellation();
		currentState = new Cancelled();
		return charges;
	}
   
	public void paymentSuccessful() {
		currentState = new Paid();
	}
	
	public void dispatched() {
		currentState = new InTransit();
	}
	
	public void delivered() {
		currentState = new Delivered();
	}
}
