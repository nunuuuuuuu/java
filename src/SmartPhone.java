// 7. 휴대폰의 각각의 데이터를 변경하는 메소드를 만들어보세요.

public class SmartPhone {
  String brand;
  String modelName;
  String color;
  int price;
  String phoneNumber; //"010-1111-2222"

//  제조사 데이터를 변경하는 메서드 생성
//  메서드의 매개변수는 메서드 기능 구현 시
//  필요한 데이터가 있다면 매개변수로 전달 받으세요
  public void setBrand(String data) {
    brand = data;
  }

//  모델명을 변경하는 메서드
  public void setModelName(String name) {
    modelName = name;
  }


//  색상을 변경하는 메서드
  public void setColor(String col) {
    color =  col;
  }

//  가격을 변경하는 메서드
  public void setPrice(int p) {
    price = p;
  }

//  휴대폰 번호를 변경하는 메서드
  public void setPhoneNumber(String number) {
    phoneNumber = number;
  }

//  휴대폰의 모든 데이터를 출력하는 메서드
   public void printAllData() {
     System.out.println("제조사 : " + brand);
     System.out.println("모델명 : " + modelName);
     System.out.println("색상 : " + color);
     System.out.println("가격 : " + price);
     System.out.println("휴대폰 번호 : " + phoneNumber);
   }


  public static class PhoneTest {
    public static void main(String[] args) {
  //    기본자료형
      int num;  // 변수

  //    배열
      int[] arr;  // 변수, 배열, 참조변수 (변수(비추천))


  //    Phone 클래스에 대한 객체 선언
      Phone p1;  // 변수, 참조변수, 객체, 인스턴스 (변수(비추천))
  //    객체 - 인스턴스 (동일)



  //    객체 생성
      p1 = new Phone();   // 클래스명과 동일한 이름, 뒤에는 ();



  //    객체 선언 및 생성 문법
  //    클래스명 객체명 = new 클래스명();
  //    new : 새로운 인스턴스를 생성하세요

      Phone p2 = new Phone();


  //    객체에 포함된 멤버변수에 접근하는 문법
  //    -> 객체명.멤버변수명;

  //    p1 인스턴스의 가격정보를 출력
      System.out.println(p1.price);
  //    p1.price = 500;

  //    p1 인스턴스의 모델명을 "S20"으로 변경
      System.out.println(p1.modelName); // 결과값 null -> 선언 후 초기화x, String = 기본값 null.
      p1.modelName = "s20";
      System.out.println(p1.modelName);
  //    p2.modelName = "iphone 14 pro";
      System.out.println(p2.modelName);


  //    객체에 포함된 메서드 호출 문법
  //    -> 객체명.메서드호출;
      p1.sendSms("안녕하세요");


    }
  }
}
