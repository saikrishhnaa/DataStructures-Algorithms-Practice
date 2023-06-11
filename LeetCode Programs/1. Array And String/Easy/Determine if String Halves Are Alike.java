/*
Description:

You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

Example 1:

Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
Example 2:

Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.
 
Constraints:

2 <= s.length <= 1000
s.length is even.
s consists of uppercase and lowercase letters.
*/

class Solution {
    public boolean halvesAreAlike(String s) {
        // String str = s.toLowerCase();
        // int[] vowels = new int[] { 97, 101, 105, 111, 117 };
        // int[] alphabets1 = new int[26];
        // int[] alphabets2 = new int[26];

        // int strLen = str.length();
        // for(int i = 0; i < strLen / 2; i++) {
        //     alphabets1[str.charAt(i) - 97]++;
        //     alphabets2[str.charAt(strLen - 1 - i) - 97]++;
        // }

        // int vowelsCnt1 = 0;
        // int vowelsCnt2 = 0;

        // for(int vowel : vowels) {
        //     vowelsCnt1 += alphabets1[vowel - 97];
        //     vowelsCnt2 += alphabets2[vowel - 97];
        // }

        // if(vowelsCnt1 == vowelsCnt2)
        //     return true;
        // return false;

        int vowelsCnt1 = 0;
        int vowelsCnt2 = 0;
        int strLen = s.length();
        for(int i = 0; i < strLen / 2; i++) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(strLen - 1 - i);
            if(ch1 == 'A' || ch1 == 'a' || ch1 == 'E' || ch1 == 'e' || ch1 == 'I' || ch1 == 'i' || ch1 == 'O' || ch1 == 'o' ||  ch1 == 'U' || ch1 == 'u') {
                vowelsCnt1++;
            }

            if(ch2 == 'A' || ch2 == 'a' || ch2 == 'E' || ch2 == 'e' || ch2 == 'I' || ch2 == 'i' || ch2 == 'O' || ch2 == 'o' ||  ch2 == 'U' || ch2 == 'u') {
                vowelsCnt2++;
            }
        }

        if(vowelsCnt1 == vowelsCnt2)
            return true;
        return false;
    }
}

/*
Performance:

Runtime
3 ms (90.53% Beats)

Memory
40.9 MB (65.72% Beats)
*/
