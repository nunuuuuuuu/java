public class Monitor {
  String modelName;
  int price;
  double inch;


  public Monitor() {

  }

  public Monitor(String a) {
  }

//  자료형이 같으면 중복 불가, 변수명은 상관x
//  public Monitor(int num) {
//
//  }


  public Monitor(int price) {
    this.modelName = null; // this = 이 클래스에서 정의된 modelName
    this.price = price;
    inch = 0.0;
  }

//  메서드 오버로딩
//  메서드의 매개변수의 갯수, 매개변수의 자료형이 다르면 메서드명 중복 선언 가능!
  public void aaa() {
    System.out.println(10); // ctrl + 좌클릭 확인
  }

  public void aaa(int a) {

  }

  public void aaa(String a) {

  }



}


