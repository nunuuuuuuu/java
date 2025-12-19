public class While1_5 {
  public static void main(String[] args) {
    int i = 1;
    int sum = 0; // 1~10까지 합을 저장할 변수

    while ( i < 6) {
      sum = sum + i;
      i++;
      System.out.println(sum);
    }

  }
}

// i = 1, sum = 0
// 1(sum) = 0(sum) + 1(i);
// sum = > 0 + 1 = 1;
