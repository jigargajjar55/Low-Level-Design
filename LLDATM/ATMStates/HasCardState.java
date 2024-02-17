package LLDATM.ATMStates;

import LLDATM.ATM;
import LLDATM.Card;

public class HasCardState extends ATMState {

    public HasCardState(){
        System.out.println("enter your card pin number");
    }

    @Override
    public void authenticatePin(ATM atm, Card card, int pin) {

        boolean isCorrectPinEntered = card.isCorrectPINEntered(pin);

        if(isCorrectPinEntered){
            atm.setCurrentATMState(new SelectOperationState());
        }else{
            System.out.println("Invalid Pin Number!");
            exit(atm);
        }
        
    }

    @Override
    public void exit(ATM atm) {
        atm.setCurrentATMState(new ExitState(atm));
    }

    
    
}
