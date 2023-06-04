/*
Description:

Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.
*/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        answer.add(new ArrayList<Integer>());
        for(int i = 0; i < nums.length; i++) {
            int answerLen = answer.size();
            for(int j = 0; j < answerLen; j++) {
                List<Integer> answerItem = new ArrayList<Integer>(answer.get(j));
                answerItem.add(nums[i]);
                answer.add(answerItem);
            }
        }
        return answer; 
    }
}

/*
Performance:

Runtime
1 ms (74.9% Beats)

Memory
41.9 MB (96.85% Beats)
*/
