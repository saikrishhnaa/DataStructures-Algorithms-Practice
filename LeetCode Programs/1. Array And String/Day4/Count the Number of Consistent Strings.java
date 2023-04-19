/*
Description:

You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.

Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
Example 2:

Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.
Example 3:

Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
Output: 4
Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
 
Constraints:

1 <= words.length <= 104
1 <= allowed.length <= 26
1 <= words[i].length <= 10
The characters in allowed are distinct.
words[i] and allowed contain only lowercase English letters.
*/

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        /*
        // Approach #1
        int consistentStringsCount = 0;
        for(String word : words) {
            boolean isStringConsistent = false;
            for(int i = 0; i < word.length(); i++) {
                isStringConsistent = false;
                for(int j = 0; j < allowed.length(); j++) {
                    if(allowed.charAt(j) == word.charAt(i)) {
                        isStringConsistent = true;
                        break;
                    }
                }
                if(!isStringConsistent)
                    break;
            }
            if(isStringConsistent) {
                consistentStringsCount++;
            }
        }
        return consistentStringsCount;
        */

        // Approach #2 (Refered from othes's solution)
        boolean[] allowedChars = new boolean[26];
        for(int i = 0; i < allowed.length(); i++) {
            allowedChars[allowed.charAt(i) - 97] = true;
        }

        int consistentStringsCount = 0;

        for(String word : words) {
            consistentStringsCount++;
            if(!word.equals(allowed)) {
                for(int i = 0; i < word.length(); i++) {
                    if(!allowedChars[word.charAt(i) - 97]) {
                        consistentStringsCount--;
                        break;
                    }
                }
            }
        }
        return consistentStringsCount;
    }
}

/*
Performance:

Runtime
8 ms (82.71% Beats)

Memory
43.3 MB (71.39% Beats)
*/
