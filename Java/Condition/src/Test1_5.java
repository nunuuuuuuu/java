import java.util.Scanner;

public class Test1_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //char 문자, string 문자열
    String grade = "";
//    ㄴ 초기값 지우고 "C"; 기입 후, else {} 부분 삭제하면 중복요인 제거됨.


    System.out.println("정수 입력 : ");
    int num = sc.nextInt();

    if (num > 90 && num < 100){
      grade = "A";
//      System.out.println("학점은 A입니다. ");
    }

      else if (num > 80){
        grade = "B";
//      System.out.println("학점은 B입니다. ");
//    else if (num > && num <= 90) {
//      System.out.println("학점은 B입니다. ");
    }

    else {
      grade = "C";
//      System.out.println("학점은 C입니다. ");
    }

    System.out.println("학점은 " + grade + "C입니다.");


  }
}
