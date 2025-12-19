import java.util.Scanner;

public class Test1_10_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a, b, c;

    System.out.print("첫번째 수 : ");
    a = sc.nextInt();
    System.out.print("두번째 수 : ");
    b = sc.nextInt();
    System.out.print("세번째 수 : ");
    c = sc.nextInt();

    int max, mid, min;


    if (a > b && a > c) {
      max = a;
      mid = b > c ? b : c;
      min = b > c ? c : b;
    }

    else if(b > a && b > c) {
      max = b;
      mid = a > c ? a : c;
      min = a > c ? c : a;
    }

    else {
      max = c;
      mid = a > b ? a : b;
      min = a > b ? b : a;
    }
    System.out.println(max + ">" + mid + ">" + min);


  }
}
