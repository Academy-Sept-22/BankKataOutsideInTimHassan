import java.util.ArrayList;

public class StatementPrinter implements Console{
	public String print(ArrayList<Integer> accountHistory) {
		return accountHistory.toString();
	}

	@Override
	public void printLine(String text) {

	}
}
