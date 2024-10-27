import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Account> accountlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        accountlist.add(new Account("110-449-612674", 100000));
        accountlist.add(new Account("110-449-611672", 50500));
        accountlist.add(new Account("110-444-123784", 87400));

        while (true) {
            System.out.println("1. 예금 / 2. 출금 / 3. 잔고 확인 / 4. 종료");

            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("계좌번호를 입력하세요.");
            String accountNum = sc.nextLine();

            boolean found = false;

            for (Account account : accountlist) {
                if (account.getAccount().equals(accountNum)) {
                    found = true;

                    if (menu == 1) {
                        System.out.println("입금할 금액을 입력하시오.");
                        int money = sc.nextInt();
                        sc.nextLine();
                        account.addBalance(money);
                        System.out.println("입금 완료. 현재 잔액: " + account.getBalance());
                    } else if (menu == 2) {
                        System.out.println("출금할 금액을 입력하시오.");
                        int money = sc.nextInt();
                        sc.nextLine();
                        if (account.withDraw(money)) {
                            System.out.println("출금 완료. 현재 잔액: " + account.getBalance());
                        } else {
                            System.out.println("잔액이 부족합니다.");
                        }
                    } else if (menu == 3) {
                        System.out.println("현재 잔액: " + account.getBalance());
                    }
                    break;
                }
            }

            if (!found) {
                System.out.println("해당 계좌를 찾을 수 없습니다.");
            }
        }
        sc.close();
    }
}