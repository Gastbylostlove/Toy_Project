public class Account {
    // 계좌번호, 잔액
    private String accountNumber;
    private int balance;

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccount() {
        return accountNumber;
    }


    public int getBalance() {
        return balance;
    }

    // 입금
    public void addBalance(int amount) {
        this.balance += amount;
    }

    // 출금
    public boolean withDraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}