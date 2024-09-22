import java.util.Scanner;

// 학생 객체 <- 근데 한 명만 있는게 아니잖아 여러명이 가능해야하잖아
// 그러면 다른 클래스가 있어야하나..?
// 학생을 다루는 manager?????
// manager에서 수정하고 조회하고 학생 정보를 입력해야지
// 학생 객체는 그냥 정보를 받는 생성자 정도인가? -> 정보를 받고 저장하고 내보내주는 역할


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    Scanner sc = new Scanner(System.in);

     Manager manager = new Manager();

    while(true) {
        System.out.println("1.학생 정보 입력");
        System.out.println("2.학생 정보 조회");
        System.out.println("3.수학 성적 수정");
        System.out.println("4.종료");

        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.print("이름: ");
                String name = sc.nextLine();
                System.out.print("나이: ");
                int age = sc.nextInt();
                System.out.print("주소: ");
                String address = sc.nextLine();
                System.out.print("학교: ");
                String school = sc.nextLine();
                System.out.print("수학 점수: ");
                int mathScore = sc.nextInt();
            case 2:
                manager.view();
                break;
            case 3:
                System.out.print("수정할 학생 이름: ");
                String studentName = sc.nextLine();
                System.out.print("새로운 수학 점수: ");
                int newScore = sc.nextInt();
                manager.update(studentName, newScore);
                break
            case 4:
                System.out.println("종료");
                break;
        }
    }
}