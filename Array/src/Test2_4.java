public class Test2_4 {
  public static void main(String[] args) {

// 실행을 할 때마다 랜덤한 수를 줌
// Math.random() -> 0.0에서 0.9999까지의 랜덤한 실수를 반환
//    double d = Math.random();
//    System.out.println(d);


// 위 Math.random()을 이용하여 1~10까지의 랜덤한 정수를 생성
// 0.0 < = x < 1.0 실수
//    Math.random() * 10 + 1
//    0.0 ~ 9.999 -> 1.0 ~ 10.999


//    int result = (int)(Math.random() * 10 + 1);
//    System.out.println(result);


    int m = (int)(Math.random() * 50) + 50;
    System.out.println(m);

//    int re = (int)(Math.random() * 50 );
//    System.out.println(re);







//    뒤에 소괄호 -> 앞에 형변환 int(정수) -> int result (선언 및 초기화)


  }
}
