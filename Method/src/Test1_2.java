import java.sql.SQLOutput;
import java.util.Scanner;

public class Test1_2 {
  public static void main(String[] args) {
    printTest10(10);
    printTest11(5, 7);
    printTest12(10);
    printTest13(10, 1);
    printTest14(1,9);
    printTest15("kim",3);

    Scanner sc = new Scanner(System.in);

  }

  public static void printTest10(int a) {//5
// public static void printTest10_1(int a)
//    system.out.println(a % 2 == 0 ? "짝수입니다" : "홀수입니다" ); //삼항 연산
    System.out.println(a);
    if (a % 2 == 0) {
      System.out.println("짝수입니다.");
    }
    else {
      System.out.println("홀수입니다.");
    }
  }

  public static void printTest11(int num1, int num2) {//5,10

    if (num1 % 2 == 0 && num2 % 2 == 0) {
      System.out.println("두 수는 짝수입니다");
    }
    else if(num1 % 2 == 0 || num2 % 2 == 0) {
      System.out.println("한 수만 짝수입니다");
    }
    else {
      System.out.println("두 수는 홀수입니다");
    }
  }

//  else if(num1 % 2 != 0 && num2 & 2 !=0) {
//    System.out.println(둘 다 홀수);
//  }


// 12. 한 정수를 매개변수로 받아, 0부터 입력받은 숫자까지 출력하는 메소드를 선언 및 호출해보세요.
  public static void printTest12(int num) {
      for (int i = 0; i < num+1 ; i++){
        System.out.println(i);
    }
  }
//  13. 두 정수를 매개변수로 받아, 두 정수 사이의 숫자를 출력하는 메소드를 선언 및 호출해보세요.
  public static void printTest13(int num1,int num2) { // num1 = 1, num2 = 9 임의 숫자 가정.
    // num1과 num2 중, 큰 수와 작은 수를 구분
    // int max = Math.max(num1, num2); 노란색 줄에 마우스 올려보면 나오는 추천 가이드
    // int min = Math.min(num1, num2);
    int max = num1 > num2 ? num1 : num2;
    int min = num1 > num2 ? num2 : num1;
    // min = 1. max = 10 => 2 ~ 9
    for (int i = min + 1; i < max ; i++){
      System.out.println(i);
    }
  }
//  14. 두 정수를 매개변수로 받아, 두 정수 사이의 5의 배수의 개수를 출력하는 메소드를 선언하고
//  호출해보세요.
  public static void printTest14(int a, int b) {
    int max = Math.max(a, b);
    int min = Math.min(a, b);

    // min = 3, max = 7 => 4,5,6 or 3,4,5,6,7

    int cnt = 0;
    for (int i = min + 1; i < max ; i++ ) {  //int i = 0 대신 min+1 -> 4,5,6 기준이기 때문
      if (i % 5 == 0) {
        cnt++;
      }
      System.out.println(cnt);
    }

  }

  public static void printTest15(String str, int num) {
    // str = "kim";, num = 3; => kimkimkim
    for (int i = 0; i < num; i++) {
      System.out.print(str);
    }
  }

  }


