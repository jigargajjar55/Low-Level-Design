package SOLID.OpenClosedPrinciple.Example;

import java.util.List;

//Derived Class - Open for Modification in child class
public class PhoneSubscriber extends Subscriber {


    @Override
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*baseRate/100;
    }


}