public class Operator1 {
  public static void main(String[] args) {
//    산술 연산자(+, -, *, /, %)
//  '%' : mod 연산자, 나눗셈의 나머지를 구하는 연산자(나머지 값)
    int result1 = 10 % 4;
    System.out.println(result1);

    //비교 연산자
    // >, <, >=(크거나 같다), <=(작거나 같다), ==(같다, 동일), !=(다르다)
    System.out.println(10 > 3);
    System.out.println(3 == 3);
    System.out.println(3 == 0.3*10);

    boolean result2 = 10 > 3 ;

//    논리부정 연산자
//    '!' - > ex) !true = > false, !false = > true

//    논리연산자
//    &&(엔퍼센트),||(버티컬바, 세로선(쉬프트 \)), &, |
//    그리고(and 연산) :: &&
//    또는(or 연산) : ||
    System.out.println(3 > 1 && 2 > 1);

    int num1 = 5;
    int num2 = 7;
    boolean result3 = num1 > 3 || num2 != 7;

    boolean result4 = num1 * 2 > 10 && !(num2 % 2 == 1);


  }
}
