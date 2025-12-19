import java.util.Scanner;

//10. 세 정수를 선언하고 scanner로 값을 입력받는다. 그리고 세 수를 큰 순서대로 출력하여
//보라.(난이도 높음) -출력예시- 첫번째 수 : 10
//두번째 수 : 30
//세 번째 수 : 20
//30 > 20 > 10


public class Test1_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c;

    System.out.println("첫번째 수 : ");
    a = sc.nextInt();
    System.out.println("두번째 수 : ");
    b = sc.nextInt();
    System.out.println("세번째 수 : ");
    c = sc.nextInt();

    int max, mid, min;

//  a가 가장 큰 경우
if (a > b && a > c) {
  max = a;
  mid = b > c ? b : c;
  min = b > c ? c : b;


//    if (b > c) {
//      mid = b;
//      min = c;
//    }
//    else {
//      mid = c;
//      min = b;
//    }




}
//  b가 가장 큰 경우
else if (b > a && b > c) {
  max = b;
  mid = a > c  ? a : c;
  min = a > c ? c : a;

    }
//  c가 가장 큰 경우
else {
  max = c;
  mid = a > b ? a : b;
  min = a > b ? b : a;

}

    System.out.println(max + ">" + mid + ">" + min);


//    if(a > b && a > c && b > c);  1번째 답



  }
}
