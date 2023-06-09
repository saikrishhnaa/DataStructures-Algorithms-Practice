/*
Description:

A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

s[i] == 'I' if perm[i] < perm[i + 1], and
s[i] == 'D' if perm[i] > perm[i + 1].
Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.

Example 1:

Input: s = "IDID"
Output: [0,4,1,3,2]
Example 2:

Input: s = "III"
Output: [0,1,2,3]
Example 3:

Input: s = "DDI"
Output: [3,2,0,1]
 
Constraints:

1 <= s.length <= 105
s[i] is either 'I' or 'D'.
*/

class Solution {
    public int[] diStringMatch(String s) {
        int sLen = s.length();
        int iCounter = 0;
        int dCounter = sLen;
        int[] perm = new int[sLen + 1];

        for(int i = 0; i < sLen; i++) {
            if(s.charAt(i) == 'I') {
                perm[i] = iCounter;
                iCounter++;
            } else {
                perm[i] = dCounter;
                dCounter--;
            }
        }
        if(s.charAt(sLen - 1) == 'I') {
            perm[sLen] = iCounter;
        } else {
            perm[sLen] = dCounter;
        }
        return perm;
    }
}

/*
Performance:

Runtime
2 ms (97.31% Beats)

Memory
43.4 MB (40.25% Beats)
*/

