package LLDATM.ATMStates;

import LLDATM.ATM;
import LLDATM.Card;
import LLDATM.AmountWithdrawal.CashWithdrawProcessor;
import LLDATM.AmountWithdrawal.FiveHundredWithdrawProcessor;
import LLDATM.AmountWithdrawal.OneHundredWithdrawProcessor;
import LLDATM.AmountWithdrawal.TwoThousandWithdrawProcessor;

public class CashWithdrawalState extends ATMState {

    @Override
    public void cashWithdrawal(ATM atmObject, Card card, int withdrawalAmountRequest) {
      
        
        if (atmObject.getAtmBalance() < withdrawalAmountRequest) {
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atmObject);
        } else if (card.getBankBalance() < withdrawalAmountRequest) {
            System.out.println("Insufficient fund in the your Bank Account");
            exit(atmObject);
        } else {

            card.deductBankBalance(withdrawalAmountRequest);
            atmObject.deductATMBalance(withdrawalAmountRequest);

            //using chain of responsibility for this logic, how many 2k Rs notes, how many 500 Rs notes etc, has to be withdrawal
            CashWithdrawProcessor withdrawProcessor =
                    new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));

            withdrawProcessor.withdraw(atmObject, withdrawalAmountRequest);
            exit(atmObject);
        }
    }

    @Override
    public void exit(ATM atm) {
        atm.setCurrentATMState(new ExitState(atm));
    }
    
}
