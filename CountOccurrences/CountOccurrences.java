import java.util.*;

class Main {

  public static void main(String[] args) {
    String series = "20 20 30 30 30 15 15 7 42 42 42 42 42";

	// Array method
    String[] array = series.split(" ");

    for (int i = 0; i < array.length; i++) {
      if (array[i] != "-") {
        int num = Integer.valueOf(array[i]);
        int count = 0;
        for (int j = 0; j < array.length; j++) {
          if (array[j] != "-" && num == Integer.valueOf(array[j])) {
            array[j] = "-";
            count++;
          }
        }
        System.out.print(count + " " + num + " ");
      }

    }
    System.out.println();

	// LinkedHashMap method
    String[] array2 = series.split(" ");

    LinkedHashMap<Integer, Integer> countMap = new LinkedHashMap<Integer, Integer>();
    for (int i = 0; i < array2.length; i++) {
      int num = Integer.valueOf(array2[i]);
      if (countMap.containsKey(num)) {
        countMap.put(num, countMap.get(num) + 1);
        // System.out.println(num);
      } else {
        countMap.put(num, 1);
        // System.out.println(num);
      }
    }
    // System.out.print(countMap);
    for (int i : countMap.keySet()) {
      System.out.print(countMap.get(i) + " " + i + " ");
    }
  }

}
