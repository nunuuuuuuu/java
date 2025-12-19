import java.util.Scanner;

public class Test1_2 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("정수 입력 : ");
    int data = sc.nextInt();

    if(data % 2 == 0){
      System.out.println("짝수입니다.");
    }

    else{
      System.out.println("홀수입니다.");
    }

    System.out.println(data % 2 == 0 ? "짝수" : "홀수" );


  }
}
