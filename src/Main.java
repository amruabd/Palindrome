public class Main {
  public static void main(String[] args) {
    String[] words = {"\nWas iT a Cat \n i saw \n", "eye", "caliForNia", "12321", "Level" };
    String is = Palindrome.longestPalindromeInArray(words);
    System.out.println("the answer is : " + is.replaceAll("\\s", "").toLowerCase());
    for (String word : words){
      System.out.println(word);
    }
  }



}