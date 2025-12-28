// 코드 연습을 위한 클래스 (설계도 아님.)
// 클래스를 만든 후 사용을 위해서는 반드시 객체 생성을 해야한다!

public class PhoneTest {
  public static void main(String[] args) {
//    기본자료형
    int num;  // 변수

//    배열
    int[] arr;  // 변수, 배열, 참조변수 (변수(비추천))


//    Phone 클래스에 대한 객체 선언
    Phone p1;  // 변수, 참조변수, 객체, 인스턴스 (변수(비추천))
//    객체 - 인스턴스 (동일)



//    객체 생성
    p1 = new Phone();   // 클래스명과 동일한 이름, 뒤에는 ();



//    객체 선언 및 생성 문법
//    클래스명 객체명 = new 클래스명();
//    new : 새로운 인스턴스를 생성하세요
    Phone p2 = new Phone();


//    객체에 포함된 멤버변수에 접근하는 문법
//    -> 객체명.멤버변수명;

//    p1 인스턴스의 가격정보를 출력
    System.out.println(p1.price);
//    p1.price = 500;

//    p1 인스턴스의 모델명을 "S20"으로 변경
    System.out.println(p1.modelName); // 결과값 null -> 선언 후 초기화x, String = 기본값 null.
    p1.modelName = "s20";
    System.out.println(p1.modelName);
//    p2.modelName = "iphone 14 pro";
    System.out.println(p2.modelName);


//    객체에 포함된 메서드 호출 문법
//    -> 객체명.메서드호출;
    p1.sendSms("안녕하세요");


  }
}
