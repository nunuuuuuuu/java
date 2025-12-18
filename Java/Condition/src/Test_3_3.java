import java.util.Scanner;

public class Test_3_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 키보드 입력을 위해 선언

    // 키보드로 입력받은 두 정수를 저장할 변수
    int a,b;

    // 키보드로 입력받은 연산자를 저장할 변수
    String c;

    // 키보드로 두 정수 및 연산자를 입력
    System.out.print("첫 번째 수 : ");
    a = sc.nextInt();

    System.out.print("두 번째 수 : ");
    b = sc.nextInt();

    System.out.print("연산자 : ");
    c = sc.next();

    // 연산자에 따라 조건 구분

//    연산자가 +라면
    if(c.equals("+")) {
      System.out.println(a + "+" + b +" = " +( a + b ));
    }
    // 연산자가 *라면
    else if(c.equals("-")) {
      System.out.println(a + "-" + b +" = " +(a - b));
    }

    else if(c.equals("*")) {
      System.out.println(a + "*" + b +" = " +(a * b));
    }

    else if(c.equals("/")) {
      System.out.println(a + "/" + b +" = " +(a / (double)b));
    }

    else {
      System.out.println("연산자를 잘못 입력하였습니다.");
    }



  }
}
