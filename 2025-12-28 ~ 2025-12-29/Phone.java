//  휴대폰 객체 생성을 위한 설계도
//  클래스의 구성 요소
//  1. 변수(멤버변수, 필드) - class의 멤버이기 때문에 멤버변수
//    지금까지 선언한 변수(메서드 안에서 선언한 변수)는
//      지역변수(local variable)라 부른다
//    지역변수는 반드시 초기화가 필요!
//    멤버변수는 자동으로 초기화 진행
//  2. 메서드의 정의 (메서드 호출 불가)
//  3. 생성자
//  설계도는 실행 x // main 메서드가 없음

//  class 안에 변수 사용 가능 // 무조건 메서드 안에만 존재x
public class Phone {

  int price; // 가격
  String modelName; // 모델명
  String brand; // 브랜드

//  문자 보내는 기능
//  접근제한자 리턴타입 메서드명() // static 빼고 작성
  public void sendSms(String msg) {
//    int age;
//    System.out.println(age); // 오류
    System.out.println(price);
    System.out.println("문자를 보냅니다 : " + msg);

  }


//  전화 기능
  public void call(String sender) {
    System.out.println(sender + "님으로부터 전화가 왔습니다.");
  }

}
