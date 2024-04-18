class Solution:
  def longestPalindrome(self, s):
      from collections import Counter

      freq = Counter(s)
      length = 0
      odd_found = False

      for count in freq.values():
          if count % 2 == 0:
              length += count
          else:
              length += count - 1
              odd_found = True

      if odd_found:
          length += 1

      return length

def main():
  # Create an instance of the Solution class
  sol = Solution()

  # Prompt the user to enter a string
  input_string = input("Enter a string of lowercase and/or uppercase letters: ")

  # Compute the longest palindrome length
  result = sol.longestPalindrome(input_string)

  # Print the result
  print("The length of the longest palindrome that can be built is:", result)

if __name__ == "__main__":
  main()