public class While1_7_1 {
  public static void main(String[] args) {
//1 ~ 100까지의 숫자 중 5의 배수인 수를 모두 출력하고,
// 5의 배수인 수의 개수도 출력해 보세요.

  int cnt = 0;
  int i = 1;

  while (i < 101) {
    if (i % 5 == 0) {
      System.out.print(i + " ");
      cnt++;
    }
      i++;
  }
    System.out.println();
    System.out.println(cnt);

  }
}
