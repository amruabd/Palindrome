public class Palindrome {
  /*
  * Given an array of strings, return the longest Palindrome string.
  * Each string may contain only alphanumeric characters in addition to spaces
  * a String is Palindrome when it reads the same forward or backword
  *
  * Example 1
  * array = ["eye", "california", "12321", "Level", "Was it a cat saw"]
  * answer = "Was it a cat i saw"
  *
  * Example 2
  * array = ["Dubai", "amman", "Cairo", "fes"]
  * answer = -1
  * */

  public static String longestPalindromeInArray(String[] words){
    String longestPalindrome = " ";
    for (String word : words) {
      String cleanWord = word.replaceAll("\\s+", "").toLowerCase();
      if (isPalindrome(cleanWord)) {

        if (cleanWord.length() > longestPalindrome.length()) {
          longestPalindrome = word;
        }
      }
    }
    if (longestPalindrome.isEmpty()) {
      return "-1"; // Return -1 if no palindrome is found
    } else {
      return longestPalindrome; // Return the longest palindrome found
    }

  }



  // check if word is Palindrome recursion
  private static boolean isPalindrome(String word){
    if (word == null || word.isEmpty() ) {
      return false;
    }
    if (word.length() == 1){
      return true;
    }
    if (word.charAt(0) == word.charAt(word.length()-1)){
      return isPalindrome(word.substring(1, word.length()-1));
    }

    return false;
  }

  // Check if word is a palindrome left right
//  private static boolean isPalindromeLR(String word) {
//    int left = 0;
//    int right = word.length() - 1;
//    while (left < right) {
//      if (word.charAt(left) != word.charAt(right)) {
//        return false;
//      }
//      left++;
//      right--;
//    }
//    return true;
//  }
}
