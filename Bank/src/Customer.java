import java.util.ArrayList;
import java.util.List;

// 이름, 전화번호, 주민등록번호, 계좌(여러개)
public class Customer {
    private String name;
    private String phone;
    private String registration;
    private List<Account> accounts;     // 배열로 선언


    public Customer(String Name, String Phone, String Registration){
        this.name = Name;
        this.phone = Phone;
        this.registration = Registration;
        this.accounts = new ArrayList<>();      // 계좌 초기화
    }

    // 개인정보 변경 -> 핸드폰 번호
    public void changePhone(String phone){
        this.phone = phone;
    }

    // 계좌 만들기
    public void createAccount(String accountNumber, int initialBalance){

        Account newAccount = new Account(accountNumber, initialBalance);        // 새로운 계좌 생성
        accounts.add(newAccount);       // 새로운 계좌 추가
    }

    // 계좌 해지
    public void delAccount(String accountNumber){
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)){
                accounts.remove(account);
            }
        }
    }

    // 계좌 목록
    public List<Account> getAccounts(){
        return accounts;
    }

    public Account findAccount(String searchAccount) {
        for (Customer customer : customerList) {
            for (Account account : customer.getAccounts()) {
                if (account.getAccountNumber().equals(searchAccount)) {
                    return account;
                }
            }
        }
        return null;
    }
}
