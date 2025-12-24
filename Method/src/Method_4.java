import javax.naming.Name;
import java.security.Key;

public class Method_4 {
  public static void main(String[] args) {
    printSum(10, 20);
    printInfo("kim", 30);
    printSum(10,20);
  }


//  매개변수로 전달된 이름과 나이를 출력하는 메서드
  public static void printInfo(String name, int age) {
//    int age = 30;  // int age = age;
    System.out.println(name);
    System.out.println(age);
  }


//  매개변수로 들어온 두 정수의 합을 출력하는 메서드
  public static void printSum(int a, int b) {
//    int a = 10;
//    int b = 20;
    int sum = a + b;
    System.out.println(sum);
  }

}
