import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class PrintStatementFeature {

	@Mock Console console;

	@Test
	public void print_statement() {
		Account account = new Account();
		account.withdraw(500);
		account.deposit(2000);
		account.deposit(1000);
		account.printStatement();

		verify(console).printLine("Date || Amount || Balance");
		verify(console).printLine("14/01/2012 || -500 || 2500");
		verify(console).printLine("13/01/2012 || 2000 || 3000");
		verify(console).printLine("10/01/2012 || 1000 || 1000");

	}
}