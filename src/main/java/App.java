import java.io.Console;

public class App {
  public static void main(String[] args){
    Console myConsole = System.console();

    System.out.println("Wanna know if two words are an anagram?");
    System.out.println("Give me the first word");
    String userInputOne = myConsole.readLine();
    System.out.println("Give me the second word");
    String userInputTwo = myConsole.readLine();
    System.out.println(Anagrams.runAnagram(userInputOne, userInputTwo));
  }
}
