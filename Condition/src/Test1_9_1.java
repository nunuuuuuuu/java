import java.util.Scanner;

public class Test1_9_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;

    System.out.print("첫번째 수 : ");
    a = sc.nextInt();
    System.out.print("두번째 수 : ");
    b = sc.nextInt();


    int max = a > b ? a : b; // 두 수 중 큰 수를 저장
    int min = a > b ? b : a; // 두 수 중 작은 수를 저장


//    int result

    System.out.println(max + ">" + min);

  }
}
