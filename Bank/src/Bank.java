import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Bank {
    List<Customer> customerList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void start(){
        while (true){
            System.out.println("1.계좌 생성 / 2. 입금 / 3. 출금 / 4. 계좌 조회 / 5. 종료");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("성함을 입력하시오.");
                    String name = sc.nextLine();
                    System.out.print("핸드폰 번호를 입력하시오 (단, '-' 포함) : ");
                    String phone = sc.nextLine();
                    System.out.print("주민등록번호를 입력하시오 (단, '-' 포함) : ");
                    String registration = sc.nextLine();

                    // 계좌를 생성하기 위한 가입
                    Customer newCustomer = new Customer(name, phone, registration);
                    customerList.add(newCustomer);

                    System.out.print("계좌 번호를 입력하시오. : ");
                    String accountNumber = sc.nextLine();

                    System.out.print("초기 입금액을 입력해주세요. : ");
                    int initalBalance = sc.nextInt();
                    sc.nextLine();

                    // 계좌 생성
                    newCustomer.createAccount(accountNumber, initalBalance);
                    System.out.println("계좌가 생성되었습니다.");
                    break;

                case 2:
                    System.out.println("입금할 계좌 번호를 입력해주시오: ");
                    String depositAccount = sc.nextLine();
                    System.out.print("입금할 금액을 입력하시오: ");
                    int depositAmount = sc.nextInt();
                    sc.nextLine();


                    Account depositAcc = findAccount(depositAccount);
                    if (depositAcc != null) {
                        depositAcc.addBalance(depositAmount);
                        System.out.println("입금이 완료되었습니다.");
                    } else {
                        System.out.println("계좌를 찾을 수 없습니다.");
                    }
                    break;

                // 출금
                case 3:
                    System.out.print("출금할 계좌 번호를 입력하시오. :");
                    String withdrawAccount = sc.nextLine();
                    System.out.print("출금할 금액을 입력하시오. :");
                    int withdrawAmount = sc.nextInt();
                    sc.nextLine();

                    Account withdrawAcc = findAccount(withdrawAccount);
                    if (withdrawAcc != null && withdrawAcc.withDraw(withdrawAmount)){
                        System.out.println("출금이 완료되었습니다.");
                    }
                    else{
                        System.out.println("잔액이 부족하거나 계좌를 찾을 수 없습니다.");
                    }
                    break;

                case 4:
                    System.out.print("조회할 계좌 번호를 입력하시오. :");
                    String searchAccount = sc.nextLine();
                    Account account = findAccount(searchAccount);
                    if (account != null) {
                        System.out.println("계좌 번호: " + account.getAccountNumber() + "잔액 :" + account.getBalance());
                    } else {
                        System.out.println("계좌를 찾을 수 없습니다.");
                    }
                    break;

                case 5:
                    System.out.println("시스템을 종료하겠습니다.");

                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            }
        }

    }
    // ??? 이게 뭐지??????? customer에서 메서드를 만들면 안되는건가??
    private Account findAccount(String searchAccount) {
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
