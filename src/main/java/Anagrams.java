import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Anagrams{

  public static String runAnagram(String input) {
    String[] inputArray = input.split(" ");
    List<String> anagramArray = new ArrayList<String>();
    String holder = null;
    for (int i = 0; i < inputArray.length; i++){
      holder = inputArray[i];
      char[] holderArray = holder.toCharArray();
      Arrays.sort(holderArray);
      String sortedHolder = String.valueOf(holderArray);
      for (int j = 0 ; j < inputArray.length; j++){
        char[] testingArray = inputArray[j].toCharArray();
        Arrays.sort(testingArray);
        String sortedTest = String.valueOf(testingArray);
        if (sortedHolder.equals(sortedTest) && !anagramArray.contains(inputArray[i])){
          anagramArray.add(inputArray[i]);
        }
      }
    }
    String output = String.join(" ", anagramArray);
    return output;
  }
}
