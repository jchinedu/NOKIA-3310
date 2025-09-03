import java.util.*;
public class Kata {
  public static int[] sortArray(int[] array) {
    List<Integer>odd = new ArrayList<>();
    for(int num:array){
      if(num % 2 ==1){
        odd.add(num);
      }
    }
    Collections.sort(odd);
     int oddIndex = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 != 0) {
        array[i] = odd.get(oddIndex++);
      }
    }
    return array;
  }
}