import java.util.Scanner;

public class Account {

    static Scanner sc = new Scanner(System.in);



    public static void deposit(int balance){
        // 입금   balance + money
        System.out.println("입금시킬 금액을 입력하시오.");
        int money = sc.nextInt();
        balance += money;
        System.out.println(balance);

    }

    public static void withdraw(int balance){
            // 출금 balcne - money
        System.out.println("출금시킬 금액을 입력하시오");
        int money = sc.nextInt();
        balance -= money;
        System.out.print(balance);
    }

    public static void showBalacne(int balance) {
        // 잔고 확인
        System.out.println(balance);
    }
}
