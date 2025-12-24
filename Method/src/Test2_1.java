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

  public static  String printTest5(int a) {

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
}












