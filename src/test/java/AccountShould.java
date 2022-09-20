import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)

public class AccountShould {

    @Mock TransactionRepository transactionRepository;
    @Mock StatementPrinter statementPrinter;

    private Account account;

    @BeforeEach
    void setup() {
        account = new Account(transactionRepository);
    }

    @Test
    void deposit_money() {
        account.deposit(100);
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
        transactionRepository.addDeposit(100);

        account.printStatement();

        verify(transactionRepository, atLeastOnce()).getAccountHistory();
        verify(transactionRepository, atLeastOnce()).printAccountHistory();
    }

}
