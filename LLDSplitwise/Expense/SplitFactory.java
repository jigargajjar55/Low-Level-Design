package LLDSplitwise.Expense;

import LLDSplitwise.Expense.Split.EqualExpenseSplit;
import LLDSplitwise.Expense.Split.ExpenseSplit;
import LLDSplitwise.Expense.Split.PercentageExpenseSplit;
import LLDSplitwise.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {

        switch (splitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }
}
