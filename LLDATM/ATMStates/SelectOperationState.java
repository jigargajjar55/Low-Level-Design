package LLDATM.ATMStates;

import LLDATM.ATM;
import LLDATM.Card;
import LLDATM.TransactionType;

public class SelectOperationState extends ATMState {

    public SelectOperationState(){
        showOperations();
    }

    @Override
    public void selectOperation(ATM atmObject, Card card, TransactionType txnType){

        switch (txnType) {

            case CASH_WITHDRAWAL:
                atmObject.setCurrentATMState(new CashWithdrawalState());
                break;
            case BALANCE_CHECK:
                atmObject.setCurrentATMState(new CheckBalanceState());
                break;
            default: {
                System.out.println("Invalid Option");
                exit(atmObject);
            }

        }
    }
    


    @Override
    public void exit(ATM atm) {
        atm.setCurrentATMState(new ExitState(atm));
    }

    private void showOperations(){
        System.out.println("Please select the Operation");
        TransactionType.showAllTransactionTypes();
    }
    
}
