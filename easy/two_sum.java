//Name: Rohan Gandhi 
//TwoSumProblem-LeetCode
//link: https://leetcode.com/problems/two-sum/
//Time Complexity - O(n^2) – two nested loops
//Space Complexity - O(1) – no extra data structures were used

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) { // Loop through each element
            for (int j = i + 1; j < nums.length; j++) {// Check against every other element after i
                if (nums[i] + nums[j] == target) { // If pair adds up to target, return their indices
                    return new int[] { i, j };
                }

            }

        }
        return null;// if no valid solution found, guarantees a solution exists
    }
}
