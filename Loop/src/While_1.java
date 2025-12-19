public class While_1 {
  public static void main(String[] args) {
      int num = 0;
//    int num = 1;
//  ㄴ 필수 1
//  ㄴ 0부터 넣는 습관을 들이기

//    System.out.println("시작");

//    num이 10보다 작은 동안 반복
    while(num < 5) {
//      ㄴ 필수 2
//      ㄴ 해석 순서 - 조건부 우선 확인 (= 처음과 끝이 같음)
//      ㄴ <= (작거나 같다), >=(크거나 같다) 연산자는 잘 사용하지 않음
      System.out.println(1);
      System.out.println(2);
      num++;     // ++num; | num += 1; | num = num + 1;
//      ㄴ 필수 3 (반복이 멈출 수(파기할 수) 있는 조건 기입)


//      r 1번째 해석- r 2번째 해석 r 4번째 해석
    for( int i = 0; i < 5; i++ ) {
      System.out.println(1);  // << 3번째 해석
      System.out.println(2);  // <<
    }
//      필수 1, 2, 3 다 복붙 - i = 기존 num 에서 변경
    }



//    num = 1;
//    1
//    2
//    num = 2;
//    위의 조건부로 올라가서 다시 확인 후 반복 -





//    System.out.println("종료");

  }
}
