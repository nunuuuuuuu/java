import java.util.Scanner;

public class Test2_2_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("x와 y의 값을 입력하세요. :");

    int xPos = sc.nextInt();
    int yPos = sc.nextInt();

    if (xPos >= 50 && yPos >= 50 && xPos <= 100 && yPos <= 100) {
      System.out.println("사각형 안에 점이 있습니다.");
    }
    else {
      System.out.println("사각형 안에 없습니다.");
    }
//    if (xPos >= 50 && xPos <= 100 && yPos >= 50 && yPos <= 100){
//  }

  }
}

