import javax.xml.namespace.QName;

public class Student {

    private String name;
    private int age;
    private String address;
    private String school;
    private int math_score;

    public Student(String name, int age, String address, String school, int maht_score ){
        this.name = name;
        this.age = age;
        this.address = address;
        this.school = school;
        this.math_score = maht_score;
    }

    // 정보를 입력 받고 저장하고 그걸 다시 부를려면 get,set을 써야한다는데
    // 학생 정보는 받아야하니 get
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getaddress(){
        return address;
    }

    public String getSchool(){
        return school;
    }

    public int getMath_score(){
        return math_score;
    }

    // 수학 점수만 고쳐야하니깐
    public void setMath_score(){
        this.math_score = math_score;
    }


}
