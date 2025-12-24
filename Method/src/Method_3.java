public class Method_3 {
  public static void main(String[] args) {
    System.out.println("시작");
    printAge(10);
    printAge(20);
    printAge(30);

    int age = 40;
    printAge(age);

    int num = 50;
    printAge(num);

    System.out.println("종료");
  }

//  나이를 출력하는 메서드 정의               // 직관적으로 해석하고 생각하기
//   정수라고 정의하는 말로 해석  ㄱ            // int age = 30;
  public static void printAge(int age) {    // int age = age;
    System.out.println("나이는 " + age);     // int age = num;
  }

}
