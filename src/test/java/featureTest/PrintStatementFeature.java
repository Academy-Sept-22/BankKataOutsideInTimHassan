package featureTest;

import org.junit.jupiter.api.Test;

public class PrintStatementFeature {

	@Test
	public void
	print_statement() {

		verify(console.printStatement())
	}
}


//Date       || Amount || Balance
//		14/01/2012 || -500   || 2500
//		13/01/2012 || 2000   || 3000
//		10/01/2012 || 1000   || 1000