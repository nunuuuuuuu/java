import java.util.Scanner;

public class Test2_1_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c;

    System.out.println("첫 번째 수 : ");
    a = sc.nextInt();
    System.out.println("두 번째 수 : ");
    b = sc.nextInt();
    System.out.println("세 번째 수 : ");
    c = sc.nextInt();

    if (a + b > c) {
      System.out.println(" 가능 ");
    }
    else {
      System.out.println(" 불가능 ");
    }


    // if (a + b > c && b + c > a && a + c > b) {
    //  }

  }
}
