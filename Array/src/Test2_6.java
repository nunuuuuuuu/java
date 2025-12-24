public class Test2_6 {
  public static void main(String[] args) {

    int max = 0;
    int[] array = {1,5,3,8,2};


    for (int i = 0; i < array.length ; i++) {
      if (max < array[i]){
        max = array[i];
      }
    }

//    작성 위치 ( max 변수에 배열의 요소 중 가장 큰 수를 저장하는 코드)

    System.out.println("max : " + max);


  }
}
