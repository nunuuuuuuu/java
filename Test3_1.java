import java.util.Arrays;

public class Test3_1 {
  public static void main(String[] args) {

//    int[] a = {1,5,7,3};
//    int result = test6(a);
//    System.out.println(result);

    int[] b = {1,2,3,4,5};
    int[] result1 = test9(b);
    System.out.println(Arrays.toString(result1));

  }

//  public static int[] test6(int[] arr) { // arr = {1,5,7,3}
//    int max = arr[0]; // 배열[0]번째가 가장 큰 수로 가정
//    for (int i = 1; i < arr.length; i++) {
//      if(max < arr[i]){
//        max = arr[i];
//      }
//    }
////    return max;
//  }

  public static int[] test9(int[] arr) { // arr = {1,2,3,4,5} => [2,4]
//    배열 크기는 변경 불가 !! *중요*
//    1. 매개변수로 들어온 배열 요소에서 짝수의 갯수를 구함
    int cnt = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        cnt++;
      }
    }
//    답을 저장할 배열을 생성
    int[] resultArr = new int[cnt];

//    답이 들어갈 배열의 인덱스 번호
    int index = 0;

//    매개변수로 전달된 배열 요소 중 짝수면 결과 배열에 저장
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
//        resultArr[index] = arr[i];
//        index++;
//                | | (동일)
        resultArr[index++] = arr[i];
//        resultArr[++index] = arr[i]; - X
      }
    }
    return resultArr;
  }

}
