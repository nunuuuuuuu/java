import java.sql.SQLOutput;

public class Member {

  String name;
  String id;
  String pw;
  int age;


//  회원의 모든 정보를 변경하는 기능을 가진 메소드
  public void setMemberInfo(String name1, String id1, String pw1, int age1) {
    name = name1;
    id = id1;
    pw = pw1;
    age = age1;

  }

// 회원의 모든 정보를 출력
  public void printAllData() {
    System.out.println("회원 이름 : " + name);
    System.out.println("아이디 : " + id);
    System.out.println("비밀번호 : " + pw);
    System.out.println("나이 : " + age);
  }


//  public void setName(String name) {
//    name = "kim";
//  }
//
//  public void setId(String id){
//    id = "kimm";
//  }
//  public void setPw(String pw) {
//    pw = "1111";
//  }
//
//  public void setAge(int age) {
//    age = 20;
//  }

}
