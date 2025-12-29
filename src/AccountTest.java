public class AccountTest {
  public static void main(String[] args) {


//    계좌 개설(계좌 객체 생성)
//    클래스 객체 = new 생성자호출(클래스)();
//    객체 생성할 때, 1번만 사용 가능(그 이후는 오류)
//    생성자를 호출해서 새로운 객체를 만드세요
    Account a1 = new Account();

    a1.initAcc();



//    a1.printAccInfo(); // 객체 초기화x 기본값 출력됨.

//    생성된 객체를 초기화
//    초기화 작업은 반드시 객체 생성 직후 실행되어야 함
//    a1.initAcc(); (생성자 작성 후 지움)

//    정보 출력
    a1.printAccInfo();


  }
}
