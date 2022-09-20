import java.util.ArrayList;

public class TransactionRepository {

    private ArrayList<Integer> accountHistory;

    public TransactionRepository(ArrayList<Integer> accountHistory) {
        this.accountHistory = accountHistory;

    }

    public ArrayList<Integer> getAccountHistory() {
        printAccountHistory();
        return this.accountHistory;
    }

    public void printAccountHistory() {
        StatementPrinter statementPrinter = new StatementPrinter();
        String printed = statementPrinter.print(accountHistory);
        System.out.println(printed);
    }


    public void addDeposit(int depositAmount) {
        accountHistory.add(depositAmount);
    }

    public void addWithdraw(int withdrawAmount) {
        accountHistory.add(withdrawAmount * -1);
    }
}
