/*
Description:

You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0

Constraints:

1 <= jewels.length, stones.length <= 50
jewels and stones consist of only English letters.
All the characters of jewels are unique.
*/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean alphabets[] = new boolean[58];
        int jewelsCount = 0;

        for(int i = 0; i < jewels.length(); i++) {
            alphabets[jewels.charAt(i) - 65] = true;
        }

        for(int i = 0; i < stones.length(); i++) {
            if(alphabets[stones.charAt(i) - 65]) {
                jewelsCount++;
            }
        }

        return jewelsCount;
    }
}

/*
Performance:

Runtime
0 ms (100% Beats)

Memory
40.7 MB (89.31% Beats)
*/
