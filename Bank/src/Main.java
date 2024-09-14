
import java.util.Scanner;

public class Main {


    // 왜 입력을 메인 메서드 밖에서 선언지?
    // 입력
    static Scanner sc = new Scanner(System.in);

    // 계좌번호와 잔고는 소중하니깐
    private String accountNum;
    private static int balance;     //왜 얘한테만 static이 붙여질까? 1. 재사용하기 위해서, 2. 동적인 값이기에

    public void Account(String accountNum, int balance){
        this.accountNum = accountNum;
        this.balance = 0;
    }

    public static void main(String[] args)
    {
        System.out.println("계좌를 입력하세요");
        String account = sc.nextLine();


        // 메서드 호출
        while(true) {

            System.out.println("예금, 출금, 잔고, 종료");

            // 입력을 받는다.
            // nextLine : 엔터를 치기 전까지의 문장 전체 입력
            String oper = sc.nextLine();

            switch (oper){
                case"예금":
                    Account.deposit(balance);

                case"출금":
                    Account.withdraw(balance);

                case"잔고":
                    Account.showBalacne(balance);

                case"종료":
                    break;

            }
        }
    }
}