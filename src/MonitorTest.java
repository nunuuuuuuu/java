public class MonitorTest {
  public static void main(String[] args) {

    Monitor m1 = new Monitor(1000);
    System.out.println(m1.price);

    Monitor m2 = new Monitor();
//    처음 오류 : 생성자가 하나 있어서 자동적으로 만들어지지않음
//    생성자를 출력하기 위해서는 매개변수도 동일해야 함
//    생성자는 여러 개 만들 수 있음
    Monitor m3 = new Monitor("java");


  }
}
