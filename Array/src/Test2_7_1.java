public class Test2_7_1 {
  public static void main(String[] args) {

    int[] arr1 = new int[10];

    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = (int) (Math.random() * 100 + 1);
      System.out.println(arr1[i]);
    }
    int max = arr1[0];

    for (int i = 0; i < arr1.length; i++) {
      if (max < arr1[i]) {
        max = arr1[i];
      }
    }
    System.out.println("max : " + max);

    int min = arr1[0];

    for (int i = 0; i < arr1.length; i++) {
      if (min > arr1[i]) {
        min = arr1[i];


        }
      }

    System.out.println("min : " + min);


  }
}





