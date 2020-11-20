public class SavingsAccount extends BankAccount{
    private double rate = 0.025;
    private int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double initialBalance) {
        //calls constructor for superclass
        super(name, initialBalance);
        //initialize accountNumber to be the current value + savings value
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public void postInterest() {
        double interest = super.getBalance() * (rate/12);
        super.deposit(interest);
    }

    @Override
    public String getAccountNumber(){
        return accountNumber;
    }

    public SavingsAccount(SavingsAccount account, double balance){
        super(account, balance);
        savingsNumber = account.savingsNumber + 1;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;

    }



}
