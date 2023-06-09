/*
Description:

Every valid email consists of a local name and a domain name, separated by the '@' sign. Besides lowercase letters, the email may contain one or more '.' or '+'.

For example, in "alice@leetcode.com", "alice" is the local name, and "leetcode.com" is the domain name.
If you add periods '.' between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name. Note that this rule does not apply to domain names.

For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
If you add a plus '+' in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered. Note that this rule does not apply to domain names.

For example, "m.y+name@email.com" will be forwarded to "my@email.com".
It is possible to use both of these rules at the same time.

Given an array of strings emails where we send one email to each emails[i], return the number of different addresses that actually receive mails.

Example 1:

Input: emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
Output: 2
Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails.
Example 2:

Input: emails = ["a@leetcode.com","b@leetcode.com","c@leetcode.com"]
Output: 3
 
Constraints:

1 <= emails.length <= 100
1 <= emails[i].length <= 100
emails[i] consist of lowercase English letters, '+', '.' and '@'.
Each emails[i] contains exactly one '@' character.
All local and domain names are non-empty.
Local names do not start with a '+' character.
Domain names end with the ".com" suffix.
*/

import java.util.Set;
import java.util.HashSet;

class Solution {
    public int numUniqueEmails(String[] emails) {
        /*
        Set<String> emailSet = new HashSet<String>();
        // My Approach #1
        for(String email : emails) {
            StringBuilder correctedEmail = new StringBuilder();

            boolean isPlusOccured = false;
            boolean isAtOccured = false;
            for(int i = 0; i < email.length(); i++) {
                char ch = email.charAt(i);
                if(isAtOccured || (!isPlusOccured && ch >= 97 && ch <= 122)) {
                    correctedEmail.append(ch);
                }

                if(ch == '+') {
                    isPlusOccured = true;
                }

                if(ch == '@') {
                    isAtOccured = true;
                    correctedEmail.append(ch);
                    isPlusOccured = false;
                }
            }
            emailSet.add(correctedEmail.toString());
        }

        return emailSet.size();
        */

        // Approach #2 (Referred from other's solution)
        Set<String> emailSet = new HashSet<String>();

        for(String email : emails) {
            StringBuilder localName = new StringBuilder();

            int atIndex = email.indexOf('@');
            for (int i = 0; i < atIndex; i++) {
                char ch = email.charAt(i);

                if(ch == '.') {
                    continue;
                } 
                
                if(ch == '+') {
                    break;
                } 
                
                localName.append(ch);
            }

            localName.append(email.substring(atIndex));
            emailSet.add(localName.toString());
        }
        return emailSet.size();
    }
}

/*
Performance:

Runtime
8 ms (92.84% Beats)

Memory
43 MB (63.86% Beats)
*/

