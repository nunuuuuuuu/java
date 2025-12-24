public class Test2_3 {
  public static void main(String[] args) {

    int[] arr1 = {1,2,3};
    int[] arr2 = {4,5,6};

    int[] newArr = new int[arr1.length + arr2.length];
//    단순 숫자x, ex)arr1.length로

//    newArr 배열에 arr1배열의 모든 요소를 저장
    for(int i = 0; i < arr1.length ; i++){
      newArr[i] = arr1[i];
      System.out.println(arr1[i]);
    }

    for (int i = 0; i <arr2.length ; i++){
      newArr[i + arr1.length] = arr2[i];
    }

    for (int i = 0; i <newArr.length; i++) {
      System.out.println(newArr[i] + " ");
    }




  }
}
