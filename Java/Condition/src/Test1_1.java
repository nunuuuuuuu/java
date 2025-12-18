public class Test1_1 {
  public static void main(String[] args){

    int num1 = 20;
    int num2 = 35;


  if (num1 + num2 > 50){
    System.out.println("두 수의 합이 50보다 큽니다.");
  }

  else if(num1 + num2 < 50){
    System.out.println("두 수의 합이 50이하 입니다.");
  }

    System.out.println(num1 + num2 > 50 ? "크다" : "작다");

  //삼항연산자 : if else문을 대체해서 사용!
  // 조건 ? 참일 때 실행 코드 : 거짓일 때 실행 코드;
    int num = 10 > 3 ? 5 : 10;

  }
}
