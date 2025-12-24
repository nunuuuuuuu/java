import javax.lang.model.element.NestingKind;
import java.util.IdentityHashMap;
import java.util.Scanner;

public class Test1_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println(" ");

    printTest1();
    printTest2(1);
    printTest3("hello");
    printTest4(10,20);
    printTest5(3,5,7);
    printTest6(3,2);
    printTest7("hello","hi");
    System.out.print("8번 문제 매개변수 : ");
    int a = sc.nextInt();
    printTest8(a);
    System.out.println(" ");
    System.out.println("9번 문제 매개변수 : ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    printTest9(num1, num2);
    System.out.println(" ");
  }

  public static void printTest1() {
    System.out.println("안녕하세요");
  }

  public static void printTest2(int a) {
    a = 1;
    System.out.println(a);
  }

  public static void printTest3(String hello) {
    System.out.println(hello);
  }

  public static void printTest4(int a, int b) {
    int sum = a+b;
    System.out.println(sum);
  }

  public static void printTest5(int a, int b, int c) {
    int result = a * b * c;
    System.out.println(result);
  }

  public static void printTest6(int a, int b) {
    int sum1 = a / b;
    System.out.println(sum1);
    int sum2 = a % b;
    System.out.println(sum2);
  }

  public static void printTest7(String hello, String hi) {
    System.out.println(hello);
    System.out.println(hi);
  }

  public static void printTest8(int num) {
    System.out.println(num);
  }

  public static void printTest9(int num1, int num2) {
    int num3 = num1 + num2;
    System.out.println(num3);
  }




}
