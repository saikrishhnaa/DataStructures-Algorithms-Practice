/*
Description:

Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.

Example 1:

Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: words = ["cool","lock","cook"]
Output: ["c","o"]

Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 100
words[i] consists of lowercase English letters.
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> commonCharacters = new ArrayList<String>();
        Map<Character, Integer> charOccurrence = new HashMap<Character, Integer>();
        for(char ch : words[0].toCharArray()) {
            if(charOccurrence.containsKey(ch)) {
                charOccurrence.put(ch, charOccurrence.get(ch) + 1);
            } else {
                charOccurrence.put(ch, 1);
            }
        }

        for(int i = 1; i < words.length; i++) {
            Map<Character, Integer> charOccurrenceMap = new HashMap<Character, Integer>(charOccurrence);
            for(char ch : words[i].toCharArray()) {
                if(charOccurrenceMap.containsKey(ch)) {
                    charOccurrenceMap.put(ch, charOccurrenceMap.get(ch) - 1);
                } else {
                    charOccurrence.put(ch, 0);
                }
            }
                for(Map.Entry<Character, Integer> entry: charOccurrenceMap.entrySet()) {
                if(entry.getValue() > 0 && charOccurrence.containsKey(entry.getKey())) {
                    int newValue = charOccurrence.get(entry.getKey()) - entry.getValue();
                    charOccurrence.put(entry.getKey(), newValue);
                }              
            }
        }

        for(Map.Entry<Character, Integer> entry: charOccurrence.entrySet()) {
            for(int i = 0; i < entry.getValue(); i++) {
                commonCharacters.add(Character.toString(entry.getKey()));
            }
        }
        return commonCharacters;
    }
}

/*
Performance:

Runtime
20 ms (21.11% Beats)

Memory
43 MB (37.46% Beats)
*/

