import java.util.Scanner;

//Scanner를 이용하여 정수를 3개 입력받고 이 세 개의 수로 삼각형을 만들 수 있는지를 판별하라.
//삼각형이 가능하려면 두 변의 길이 합이 다른 한 변의 길이 합보다 반드시 커야 한다.

public class Test2_1 {
  public static void main(String[] args) {
    int num1, num2, num3;

    Scanner sc = new Scanner(System.in);

    System.out.println("첫번째 수 : ");
     num1 = sc.nextInt();
    System.out.println("두번째 수 : ");
     num2 = sc.nextInt();
    System.out.println("세번째 수 : ");
     num3 = sc.nextInt();

     if (num1 + num2 > num3) {
       System.out.println("삼각형 가능");
//       or
//   if (num1 + num2 > num3 && num2 + num3 > num1 && num1 + num3 > num2) {
//     }
     }
     else {
       System.out.println("불가능");
     }




  }
}
