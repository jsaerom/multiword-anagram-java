import org.junit.*;
import static org.junit.Assert.*;

public class AnagramsTest{

  @Test
  public void runAnagram_checkLengthIsSame_boolean(){
    Anagrams testAnagrams = new Anagrams();
    boolean expectedOutput = true;
    assertEquals(expectedOutput, testAnagrams.runAnagram("yes", "sey"));
  }

  @Test
  public void runAnagram_checkIfWordsContainSameChar_boolean(){
    Anagrams testAnagrams = new Anagrams();
    boolean expectedOutput = false;
    assertEquals(expectedOutput, testAnagrams.runAnagram("cat", "bat"));
  }
}
