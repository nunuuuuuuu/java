import java.util.Arrays;

public class Array_4 {
  public static void main(String[] args) {

    // 배열이 자료형 이라는 의미
    int[] a1 = {1,2,3};
//    String[] a2 = a1; a1과 a2는 자료형이 다르다!!
//    int d = a1; -> 오류, 정수형배열 x

    int[] a3 = a1;

    int a = 5;
    int b = a;
// 기본 자료형은 값이 복사.
// 참조 자료형은 값 복사x , 배열 데이터가 들어있는 위치값(주소)을 참조(불러오기)

//    13_ 두 번째, 아래 코드의 실행 결과는?
//    a[0]; 3
//    b[0]; 3


// 변수 - (하나의) 데이터를 저장하는 공간
//               || x
// int[] arr = new int[5]; - 배열 데이터가 들어있는 위치값(주소)을 참조(불러오기)



    int[] arr1 = {1,3,5};
    int[] arr2 = {4,5};
    arr2 = arr1;
    arr2[0] = 6;
    arr1[1] = 7;

    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));

// 이해 안 가면 그림으로 그려보기
// 위치값(주소)을 1000번대, 2000번대 가상 주소로 기억


  }

}
