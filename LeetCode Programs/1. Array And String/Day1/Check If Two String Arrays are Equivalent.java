/*
Description:

Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.

 

Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
Example 3:

Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
 

Constraints:

1 <= word1.length, word2.length <= 103
1 <= word1[i].length, word2[i].length <= 103
1 <= sum(word1[i].length), sum(word2[i].length) <= 103
word1[i] and word2[i] consist of lowercase letters.
*/

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        // Approach #1
        String word1Str = "";
        String word2Str = "";

        for(String word : word1) {
            word1Str += word;
        }
        
        for(String word : word2) {
            word2Str += word;
        }

        return word1Str.equals(word2Str);

        /*
        // Approach #2
        int w1Index = 0, c1Index = 0, w2Index = 0, c2Index = 0;

        while(w1Index < word1.length && w2Index < word2.length) {
            if(word1[w1Index].charAt(c1Index) != word2[w2Index].charAt(c2Index))
                return false;
            
            if(c1Index == word1[w1Index].length() - 1) {
                c1Index = 0;
                w1Index++;
            } else {
                c1Index++;
            }

            if(c2Index == word2[w2Index].length() - 1) {
                c2Index = 0;
                w2Index++;
            } else {
                c2Index++;
            }
        }

        return w1Index == word1.length && w2Index == word2.length; 
        */
    }
}


/*
Performance:

Runtime
1 ms (78.71% Beats)

Memory
40.7 MB (51.8% Beats)
*/