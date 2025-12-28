import javax.lang.model.element.NestingKind;
import javax.swing.*;
import java.util.IdentityHashMap;
import java.util.Scanner;

public class Test1_1 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

    test1();
    test2(5);
    test3("text 입니다.");
    test4(5,10);
    test5(3,5,7);
    test6(7,3);
    test7("hi","hello");

    System.out.println("정수를 입력하세요 : ");
    int a = sc.nextInt();
    test8(a);
    System.out.println(" = = = = = ");

    System.out.println("입력받은 두 수를 매개변수로 -");
    int aa = sc.nextInt();
    int bb = sc.nextInt();
    test9(aa, bb);



//    Scanner sc = new Scanner(System.in);
//
//    System.out.println(" ");
//
//    printTest1();
//    printTest2(5);
//    printTest3("hello");
//    printTest4(10,20);
//    printTest5(3,5,7);
//    printTest6(3,2);
//    printTest7("hello","hi");
//    System.out.print("8번 문제 매개변수 : ");
//    int a = sc.nextInt();
//    printTest8(a);
//    System.out.println(" ");
//    System.out.println("9번 문제 매개변수 : ");
//    int num1 = sc.nextInt();
//    int num2 = sc.nextInt();
//    System.out.println(" ");
//    printTest9(num1, num2);
//    System.out.println(" ");
  }

  public static void test1() {
    System.out.println("안녕하세요");
  }

  public static void test2(int a) {
    System.out.println(a);
  }

  public static void test3(String text) {
    System.out.println(text);
  }

  public static void test4(int a, int b) {
    int sum = a + b;
    System.out.println(sum);
  }

  public static void test5(int a, int b, int c) {
    int result = a * b * c;
    System.out.println(result);
  }

  public static void test6(int a, int b) {
    int result = a / b;
    System.out.println(result);
    int result1 = a % b;
    System.out.println(result1);
  }

  public static void test7(String a, String b) {
    System.out.println(a);
    System.out.println(b);
  }

  public static void test8(int num) {
    System.out.println(num);
  }

  public static void test9(int num1, int num2) {
    int result = num1 + num2;
    System.out.println(result);
  }

//  public static void printTest1() {
//    System.out.println("안녕하세요");
//  }
//
//  public static void printTest2(int a) {
//    System.out.println(a);
//  }
//
//  public static void printTest3(String hello) {
//    System.out.println(hello);
//  }
//
//  public static void printTest4(int a, int b) {
//    int sum = a+b;
//    System.out.println(sum);
//  }
//
//  public static void printTest5(int a, int b, int c) {
//    int result = a * b * c;
//    System.out.println(result);
//  }
//
//  public static void printTest6(int a, int b) {
//    int sum1 = a / b;
//    System.out.println(sum1);
//    int sum2 = a % b;
//    System.out.println(sum2);
//  }
//
//  public static void printTest7(String hello, String hi) {
//    System.out.println(hello);
//    System.out.println(hi);
//  }
//
//  public static void printTest8(int num) {
//    System.out.println(num);
//  }
//
//  public static void printTest9(int num1, int num2) {
//    int sum = num1 + num2;
//    System.out.println(num1 + " + " + num2 + " = " + sum);





}
