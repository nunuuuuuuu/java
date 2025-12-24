import java.util.Scanner;

public class Test1_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[5];


    //5번 반복하면서 배열에 키보드로 입력한 값을 저장
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }


    for (int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }

  }
}
