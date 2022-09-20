import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

public class AccountShould {

    @ExtendWith(MockitoExtension.class)
    @Mock TransactionRepository transactionRepository;

    @Test
    void deposit_money() {
        Account account = new Account(transactionRepository);
        account.deposit(100);
        transactionRepository.addDeposit(100);

        verify(transactionRepository).addDeposit(100);

    }

    @Test
    void withdraw_money() {

    }

    @Test
    void print_account_statement() {

    }

}
