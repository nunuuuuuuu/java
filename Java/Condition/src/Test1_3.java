import java.util.Scanner;

public class Test1_3 {
  public static void main(String[] args) {
 int a, b;

    Scanner sc = new Scanner(System.in);
    System.out.println("두 정수의 값을 입력하세요.");
    System.out.print("첫번째 수 : ");
    a = sc.nextInt();
    System.out.print("두번째 수 : ");
    b = sc.nextInt();

    if (a > b){
      System.out.println("a");
    }
    else if(b > a ){
      System.out.println("b");
    }
    else {
      System.out.println("같다");
    }
    System.out.println( a > b ? "a" : b > a ? "b" : "같다" );

  }
}
