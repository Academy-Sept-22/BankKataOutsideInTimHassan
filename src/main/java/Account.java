

public class Account implements AccountService {

	private TransactionRepository transactionRepository;

	public Account(TransactionRepository transactionRepository) {
		this.transactionRepository = transactionRepository;
	}

	@Override
	public void deposit(int amount) {

		TransactionRepository transactionRepository = new TransactionRepository();
		transactionRepository.addDeposit(amount);

	}

	@Override
	public void withdraw(int amount) {

	}

	@Override
	public void printStatement() {

	}
}
