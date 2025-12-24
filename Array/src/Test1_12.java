import java.util.Arrays;
import java.util.Scanner;

public class Test1_12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
// 0 : 국어, 1 : 영어 , 2 : 수학 , 3 : 총점
    int[] scores = new int[4];
    String[] subjects = {"국어", "영어", "수학"};
    double avg; //평균
// 과목이 변동되면, scores , subjects 두 가지만 변경하면 됌


//    과목 수만큼 반복시키는 코드        // - 1 : 마지막 총점은 빼고 하겠다는 의미
    for (int i = 0; i < scores.length - 1 ; i++){
      //    한과목 점수를 입력받은 코드
      while (true) {
        System.out.print(subjects[i] + " 점수(0~100) : ");
        scores[i] = sc.nextInt();

        if (scores[i] >= 0 && scores[i] <= 100){
          break;
        }
      }
    }

// 총점 및 평균 계산
      for (int i = 0; i < scores.length - 1; i++) {
        scores[scores.length -1] = scores[scores.length -1] + scores[i];
//        상수는 거의 안 들어감, 변수 위주로 기입
    }
      avg = scores[scores.length -1] / (double)(scores.length - 1);

//      성적 정보 출력
      for (int i = 0; i < scores.length - 1 ; i++) {
        System.out.println(subjects[i] + " 점수 - " + scores[i]);
      }
    System.out.println("총점 - " + scores[scores.length - 1]);
    System.out.println("평균 - " + avg);

//    System.out.println(Arrays.toString(scores));
//    출력 나왔는지 확인 후 지움 -> 총점 및 평균 계산하기
  }
}
