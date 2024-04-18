import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public int longestPalindrome(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        int length = 0;

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        boolean oddFound = false;
        for (int count : freq.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                if (!oddFound) {
                    oddFound = true;
                    length += 1; 
                }
            }
        }

        return length;
    }

    public static void main(String[] args) {
  
        Solution sol = new Solution();

        
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter a string of lowercase and/or uppercase letters: ");
        String inputString = scanner.nextLine();

      
        int result = sol.longestPalindrome(inputString);


        System.out.println("The length of the longest palindrome that can be built is: " + result);

   
        scanner.close();
    }
}
