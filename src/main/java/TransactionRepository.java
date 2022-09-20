import java.util.ArrayList;

public class TransactionRepository {
    private ArrayList<Integer> accountHistory = new ArrayList<>();
    public String getAccountHistory() {
        return accountHistory.toString();
    }


    public void addDeposit(int depositAmount) {
        accountHistory.add(depositAmount);
    }

    public void addWithdraw(int withdrawAmount) {
        accountHistory.add(withdrawAmount * -1);
    }
}
