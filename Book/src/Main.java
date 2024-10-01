import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 책 정보를 저장할 리스트 생성
        List<Book> booklist = new ArrayList<>();

        // 메뉴
        while(true) {
            System.out.println("1.책 등록 / 2. 책 조회 / 3. 책 가격 수정 / 4. 프로그램 종료");

            // 번호 입력
            Scanner sc = new Scanner(System.in);
            int menu = sc.nextInt();        // 메뉴 번호를 입력

            sc.nextLine();

            if (menu == 4) {      // 4번을 입력하면 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (menu) {
                case 1:
                    // 책 정보 입력
                    System.out.println("책 제목:");
                    String title = sc.nextLine();

                    System.out.println("작가:");
                    String author = sc.nextLine();

                    System.out.println("장르:");
                    String genre = sc.nextLine();

                    System.out.println("출판일:");
                    String releaseDate = sc.nextLine();

                    System.out.println("입고일:");
                    String instockDate = sc.nextLine();

                    System.out.println("가격:");
                    int price = sc.nextInt();
                    sc.nextLine(); // 개행 문자 처리

                    System.out.println("출판사:");
                    String publisher = sc.nextLine();

                    // 새로운 책 객체를 리스트에 추가
                    Book newBook = new Book(title, author, genre, releaseDate, instockDate, price, publisher);      //
                    booklist.add(newBook);
                    System.out.println("책이 성공적으로 등록되었습니다.");
                    break;

                case 2:
                    // 책 정보 조회
                    if (booklist.isEmpty()) {       // 책이 비어있는지 확인하는 함수
                        System.out.println("등록된 책이 없습니다.");
                    } else {
                        for (Book book : booklist) {        // 리스트에 있느 모든 책에 대해 반복문을 통해
                            book.bookInfo();        // 각 책의 정보를 출력
                        }
                    }
                    break;

                case 3:
                    // 책 가격 수정
                    System.out.print("수정할 도서의 제목을 입력해주세요: ");
                    String editTitle = sc.nextLine();       // 수정할 도서 제목 입력

                    boolean found = false;      // 도서를 찾았는지 여부를 저장하는 변수

                    for (Book book : booklist) {        // 리스트에 있는 모든 책에 대해 반복문 실행
                        if (book.getTitle().equals(editTitle)) {        // 리스트에 있는 각 책의 제목과 입력한 책 제목이 같다면
                            System.out.println("새로운 가격을 입력해주세요: ");
                            int newPrice = sc.nextInt();
                            sc.nextLine();

                            book.setPrice(newPrice);  // 가격 수정
                            System.out.println("가격이 " + newPrice + "원으로 수정되었습니다.");
                            found = true;       // 책 찾았음을 기록
                            break;
                        }
                    }

                    if (!found) {       // found == False 즉, 책이 없을 경우 (= 찾지 못할 경우)
                        System.out.println("해당 도서를 찾을 수 없습니다.");
                    }
                    break;

                default:        // 메뉴에 없는 번호를 입력할 경우
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            }
        }
    }
}
