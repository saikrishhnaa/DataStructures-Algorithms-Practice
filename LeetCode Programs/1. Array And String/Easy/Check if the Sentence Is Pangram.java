/*
Description:

A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
 
Constraints:

1 <= sentence.length <= 1000
sentence consists of lowercase English letters.
*/

class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26)
            return false;

        int alphabets[] = new int[26];
        int alphabetsCount = 0;
        
        for(char letter : sentence.toCharArray()) {
            if(alphabets[letter - 97] == 0) {
                alphabetsCount++;
                alphabets[letter - 97]++;
            }
        }
        if(alphabetsCount == 26)
            return true;
        return false;
    }
}

/*
Performance:

Runtime
1 ms (86.43% Beats)

Memory
40.6 MB (76.11% Beats)
*/
