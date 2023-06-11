/*
Description:
Given a string s, partition the string into one or more substrings such that the characters in each substring are unique. That is, no letter appears in a single substring more than once.

Return the minimum number of substrings in such a partition.

Note that each character should belong to exactly one substring in a partition.

Example 1:

Input: s = "abacaba"
Output: 4
Explanation:
Two possible partitions are ("a","ba","cab","a") and ("ab","a","ca","ba").
It can be shown that 4 is the minimum number of substrings needed.
Example 2:

Input: s = "ssssss"
Output: 6
Explanation:
The only valid partition is ("s","s","s","s","s","s").
 
Constraints:

1 <= s.length <= 105
s consists of only English lowercase letters.
*/

class Solution {
    public int partitionString(String s) {
        int subStrCnt = 1;
        boolean[] alphabets = new boolean[26];
        for(char ch : s.toCharArray()) {
            if(alphabets[ch - 97] == true) {
                subStrCnt++;
                alphabets = new boolean[26];
            }
            alphabets[ch - 97] = true;
        }

        return subStrCnt;
    }
}
Runtime
8 ms
Beats
95.80%
Memory
44.6 MB
Beats
30.77%
/*
Performance:

Runtime
8 ms (95.80% Beats)

Memory
44.6 MB (30.77% Beats)
*/
