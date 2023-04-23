/*
Description:

Given a string licensePlate and an array of strings words, find the shortest completing word in words.

A completing word is a word that contains all the letters in licensePlate. Ignore numbers and spaces in licensePlate, and treat letters as case insensitive. If a letter appears more than once in licensePlate, then it must appear in the word the same number of times or more.

For example, if licensePlate = "aBc 12c", then it contains letters 'a', 'b' (ignoring case), and 'c' twice. Possible completing words are "abccdef", "caaacab", and "cbca".

Return the shortest completing word in words. It is guaranteed an answer exists. If there are multiple shortest completing words, return the first one that occurs in words.

Example 1:

Input: licensePlate = "1s3 PSt", words = ["step","steps","stripe","stepple"]
Output: "steps"
Explanation: licensePlate contains letters 's', 'p', 's' (ignoring case), and 't'.
"step" contains 't' and 'p', but only contains 1 's'.
"steps" contains 't', 'p', and both 's' characters.
"stripe" is missing an 's'.
"stepple" is missing an 's'.
Since "steps" is the only word containing all the letters, that is the answer.
Example 2:

Input: licensePlate = "1s3 456", words = ["looks","pest","stew","show"]
Output: "pest"
Explanation: licensePlate only contains the letter 's'. All the words contain 's', but among these "pest", "stew", and "show" are shortest. The answer is "pest" because it is the word that appears earliest of the 3.
 
Constraints:

1 <= licensePlate.length <= 7
licensePlate contains digits, letters (uppercase or lowercase), or space ' '.
1 <= words.length <= 1000
1 <= words[i].length <= 15
words[i] consists of lower case English letters.
*/

import java.util.List;
import java.util.ArrayList;

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        /*
        My Approach #1
        int wordLen = Integer.MAX_VALUE;
        String shortestWord = "";
        List<Character> licensePlateChars = new ArrayList<Character>();
        for(int i = 0; i < licensePlate.length(); i++) {
            int ch = licensePlate.charAt(i);
            if(ch >= 65 && ch <= 90) {
                licensePlateChars.add((char)(ch + 32));
            } else if(ch >= 97 && ch <= 122) {
                licensePlateChars.add((char)ch);
            }   
        }
    
        for(String word : words) {
            List<Character> charsList = new ArrayList<Character>(licensePlateChars);
            for(int i = 0; i < word.length(); i++) {
                
                charsList.remove((Character)word.charAt(i));
                System.out.println(i + " " + charsList.toString());
            }
            if(charsList.size() == 0 && word.length() < wordLen) {
                wordLen = word.length();
                shortestWord = word;
            }
        }
        return shortestWord;
        */

        // Approach #2 (Referred from others solution)
        int wordLen = Integer.MAX_VALUE;
        int idx = -1;
        List<Character> licensePlateChars = new ArrayList<Character>();
        String licenseNum = licensePlate.toLowerCase();
        for(int i = 0; i < licenseNum.length(); i++) {
            char ch = licenseNum.charAt(i);
            if(ch >= 97 && ch <= 122) {
                licensePlateChars.add(ch);
            }   
        }
        
        for(int i = 0; i < words.length; i++) {
            if(words[i].length() < wordLen && isEquals(licensePlateChars, words[i])) {
                wordLen = words[i].length();
                idx = i;
            }
        }

        return words[idx];
    }

    boolean isEquals(List<Character> licensePlateChars, String word) {
        if(licensePlateChars.size() > word.length()) {
            return false;
        }
        
        int[] chars = new int[26];
        for(int j = 0; j < word.length(); j++) {
            chars[word.charAt(j) - 'a']++;
        }

        for(int j = 0; j < licensePlateChars.size(); j++) {
            if(chars[licensePlateChars.get(j) - 'a'] == 0)
                return false;
            chars[licensePlateChars.get(j) - 'a']--;
        }

        return true;
    }
}

/*
Performance:

Runtime
2 ms (100% Beats)

Memory
42.6 MB (91.58% Beats)
*/

