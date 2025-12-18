public class switch_3 {
  public static void main(String[] args) {
//  90 <= score <= 100 ===> 'A출력'
//  80 <= score <= 89 ===> 'B출력'
//  70 <= score <= 79 ===> 'C출력'
//        score < 70 ===> 'D출력'
//    switch case break로 코드 작성


    int score = 87;
    String grade = "";


    switch(score / 10) {
//      case 10 :
      case 9, 10 :
        grade = "A";
        break;
      case 8 :
        grade = "B";
        break;
      case 7 :
        grade = "C";
      default :
        grade = "D";

    }
    System.out.println(grade);

  }
}
