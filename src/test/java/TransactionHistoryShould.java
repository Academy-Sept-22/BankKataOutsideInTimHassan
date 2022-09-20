import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionHistoryShould {

    @Test
    void print_account_history_returns_transaction_history() {
        ArrayList <Integer> accountHistory = new ArrayList<>();
        TransactionRepository transactionRepository = new TransactionRepository(accountHistory);
        transactionRepository.addDeposit(100);
        transactionRepository.getAccountHistory();

        assertEquals(100, transactionRepository.getAccountHistory().get(0));
    }

}
