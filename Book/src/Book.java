public class Book {
    // 책 정보 변수 선언
    private String title;
    private String author;
    private String genre;
    private String releaseDate;
    private String instockDate;
    private int price;
    private String publisher;

    // 생성자, 입력한 책 정보를 저장 --- 생성자는 객체가 생성될 때 한 번 호출되며, 객체의 초기화 역할 수행을 한다
    public Book(String title, String author, String genre, String releaseDate, String instockDate, int price, String publisher) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.instockDate = instockDate;
        this.price = price;
        this.publisher = publisher;
    }

    // 책 정보 출력 메서드
    public void bookInfo() {
        System.out.println("제목: " + title);
        System.out.println("작가: " + author);
        System.out.println("장르: " + genre);
        System.out.println("출판일: " + releaseDate);
        System.out.println("입고일: " + instockDate);
        System.out.println("가격: " + price);
        System.out.println("출판사: " + publisher);
        System.out.println("------------------------");
    }

    // 책 제목 반환 메서드
    public String getTitle() {      // getter 메서드 : 책의 정보(=변수, 필드) private로 선언 되었기 때문에, 안전하게 접근하기 위해
        return title;
    }

    // 가격 수정 메서드
    public void setPrice(int price) {       // setter 메서드 : 외부에서 값을 직접 변경하는 대신, 메서드를 통해 값을 수정
        this.price = price;
    }

    // 가격 반환 메서드
    public int getPrice() {
        return price;
    }
}

// -- 캡슐화
// private : 외부에서 직접 접근할 수 없다. 외부에서 임의로 변경되는 것을 방지, 객체 내부 데이터 보호
// getter : 값을 읽기 위한 메서드, 외부에서 보통 변수 값을 확인할 때 사용
// setter : 값을 수정하기 위한 메서드, 외부에서 변수 값을 변경할 때 사용