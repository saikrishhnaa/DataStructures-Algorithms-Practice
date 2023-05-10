/*
Description:

Given a list of strings words and a string pattern, return a list of words[i] that match pattern. You may return the answer in any order.

A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.

Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.

Example 1:

Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
Output: ["mee","aqq"]
Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}. 
"ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation, since a and b map to the same letter.
Example 2:

Input: words = ["a","b","c"], pattern = "a"
Output: ["a","b","c"]
 
Constraints:

1 <= pattern.length <= 20
1 <= words.length <= 50
words[i].length == pattern.length
pattern and words[i] are lowercase English letters.
*/

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> matchedList = new ArrayList<String>();

        for(int cntr = 0; cntr < words.length; cntr++) {
            boolean isPatternMatched = true;
            Map<Character, Character> patternMap = new HashMap<Character, Character>();
            for(int i = 0; i < words[cntr].length(); i++) {
                if(patternMap.containsKey(words[cntr].charAt(i))) {
                    if(patternMap.get(words[cntr].charAt(i)) != pattern.charAt(i)) {
                        isPatternMatched = false;
                        break;
                    }
                } else if(patternMap.containsValue(pattern.charAt(i))) {
                    isPatternMatched = false;
                    break;
                } else {
                    patternMap.put(words[cntr].charAt(i), pattern.charAt(i));
                }
            }
            if(isPatternMatched) {
                matchedList.add(words[cntr]);
            }
        }
        return matchedList;
    }
}

/*
Performance:

Runtime
2 ms (40.47% Beats)

Memory
42.9 MB (20.13% Beats)
*/

