package LLDParkingLot.Models.Gate;

import LLDParkingLot.Models.Operator;

public class Gate {
    int entryGateId;
    boolean gateStatus;
    Operator operator;
    public Gate(int entryGateId, boolean gateStatus, Operator operator) {
        this.entryGateId = entryGateId;
        this.gateStatus = gateStatus;
        this.operator = operator;
    }
}
