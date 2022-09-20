import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)

public class AccountShould {

    @Mock
    static TransactionRepository transactionRepository;

    private static Account account;

    @BeforeAll
    static void setup() {
        account = new Account(transactionRepository);

    }

    @Test
    void deposit_money() {
        account.deposit(100);
        transactionRepository.addDeposit(100);

        verify(transactionRepository).addDeposit(100);

    }

    @Test
    void withdraw_money() {
        account.withdraw(50);
        transactionRepository.addWithdraw(50);
        verify(transactionRepository).addWithdraw(50);
    }

    @Test
    void print_account_statement() {
        account.deposit(100);
        account.withdraw(50);
        account.printStatement();

        verify(transactionRepository).getAccountHistory();
    }

}
