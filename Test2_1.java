import java.util.Scanner;

public class Test2_1 {
  public static void main(String[] args) {

    int a = printTest1(5, 9);
    System.out.println(a);

    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
//    printTest3(num1,num2);
    int result0 = printTest2(num1, num2);
    System.out.println(result0);
//    System.out.println(printTest2(num1, num2));

    System.out.println(printTest3(3,8));

    String result1 = printTest4("집에", "가고싶다");
    System.out.println(result1);

    String result = printTest5(80);
    System.out.println(result);




  }

  public static int printTest1(int num1, int num2) {
    return num1 + num2;
  }

  public static int printTest2(int a, int b) {
    return a * b;
  }

  public static int printTest3(int a, int b) {
    return Math.max(a,b);
//  return a > b ? a : b;
  }

  public static String printTest4(String a, String b) { //a = "abc", b = "ed" > "abced"
    return a + b;
  }

  public static String printTest5(int a) {

    if (a >= 90){
      return "A";
    }
    else if (a>=70){
      return "B";
    }
    else {
      return "C";
    }

//    return a >=90 ? "A" : a >=70 ? "B" : "C";
    }

//    6. 매개변수로 정수를 입력받아, 입력받은 정수를
//    문자열로 리턴하는메소드를 선언하고 사용해보세요.
  public static String printTest6(int num) {
//    문자열 -> 정수  Integer.parseInt("6"); -> 6 (매개변수 문자열 -> 정수)
//                ㄴclass   ㄴmethod
    int a = Integer.parseInt("6");

//    정수 -> 문자열  String.valueof(6); -> "6"(매개변수 정수 -> 문자열)
    String b = String.valueOf(6);

//    자바는 문자열과 정수를 변환할 수 있다.

    return num + "";
  }

//  7. 실수를 매개변수로 받아, 그 수의 제곱 값을 리턴하는 메소드를 만들고 사용해보세요.
  public static void printTest7(Double num) {

  }

  public static void printTest8() {

  }

  public static int printTest9(int num) {
    int sum = 0;
    for (int i = 1; i < num + 1; i++){
      if (i % 2 != 0){
        sum = sum + i;
      }
    }
    return sum;

  }

  public static boolean printTest10(String str){
//    "java".length(); //4

//    String aa = "java";
//    aa.length(); //4

//    1.
//    if (str.length() % 2 == 0) {
//      return true;
//    }
//    else {
//      return false;
//    }

//    2.
//    return str.length() % 2 == 0 ? true : false;

//    3.
    return str.length() % 2 == 0;



  }


}












