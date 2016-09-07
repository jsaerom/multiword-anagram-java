import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Anagrams{

  public static boolean runAnagram(String firstInput, String secondInput) {
    boolean isAnagram = false;
    if (firstInput.length() != secondInput.length()) {
      isAnagram = false;
    }
    else {
      firstInput = firstInput.toLowerCase();
      secondInput = secondInput.toLowerCase();
      char[] firstInputArray = firstInput.toCharArray();
      char[] secondInputArray = secondInput.toCharArray();
      Arrays.sort(firstInputArray);
      Arrays.sort(secondInputArray);
      isAnagram = Arrays.equals(firstInputArray, secondInputArray);
    }
  return isAnagram;
  }
}
