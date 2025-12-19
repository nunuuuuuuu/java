import java.util.Scanner;

public class Test2_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num; // 키보드로 입력받은 데이터를 저장할 변수
    int clapCnt = 0; // 박수의 갯수

    System.out.print("1~99 사이의 정수를 입력하세요. >>");
    num = sc.nextInt();

    int tens = num / 10;
    int ones = num % 10;

//    if ( tens == 3 || tens == 6 || tens == 9 ) {

//    r예외사항으로 0은 아니다 라고 입력해둠 //  ++clapCnt;
      if ( tens % 3 == 0 && tens != 0 ) {
      clapCnt++;
      }

     if ( ones % 3 == 0 && tens != 0 ) {
      }


    //3. 박수의 갯수에 따라 박수를 친다
    switch (clapCnt) {
      case 1 :
        System.out.println("박수짝");
        break;
      case 2 :
        System.out.println("박수짝짝");
    }


//    37 입력했을 때, 37/10 > 정수 3(십의 자리), 37&10 > 나머지 값 7(일의 자리)


//    0. 박수의 갯수를 저장할 변수를 0으로 초기화
//    1. 1~99 사이 키보드로 정수 하나를 입력 받음
//    2. 박수짝, 박수짝짝인지 확인
//    2-1. 일의 자리 숫자와 십의 자리 숫자를 분리
//    2-2. 십의 자리 숫자가 3,6,9인지 확인 - > 박수 갯수를 1증가
//    2-3. 일의 자리 숫자가 3,6,9인지 확인 - > 박수 갯수를 1증가
//    3. 박수의 갯수에 따라 박수를 친다


  }
}
