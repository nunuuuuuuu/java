import java.util.Scanner;

public class Test1_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1, num2;
    int max; // 두 수 중 큰 수를 저장
    int min; // 두 수 중 작은 수를 저장

    System.out.println("값을 입력하세요. : ");

    System.out.print("첫번째 수 : ");
    num1 = sc.nextInt();
    System.out.print("두번째 수 : ");
    num2 = sc.nextInt();

    if (num1 > num2) {
      max = num1;
      min = num2;

      //      System.out.println(num1 + " > " + num2 );       1번째 답
    }
  else {
      max = num2;
      min = num1;

    //      System.out.println(num2 + " > " +  num1 );        1번째 답
    }

    System.out.println(max + ">" + min);

  }
}
