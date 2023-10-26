package SOLID.OpenClosedPrinciple.Example;

import java.util.List;

//Derived Class - Open for Modification in child class
public class ISPSubscriber extends Subscriber {
    

    private long freeUsage;
    

    public double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - freeUsage;

        if(chargeableData <= 0){
            return 0;
        }

        return chargeableData*baseRate/100;
    }

    

    /**
     * @return the freeUsage
     */
    public long getFreeUsage() {
        return freeUsage;
    }

    /**
     * @param freeUsage the freeUsage to set
     */
    public void setFreeUsage(long freeUsage) {
        this.freeUsage = freeUsage;
    }

    
}