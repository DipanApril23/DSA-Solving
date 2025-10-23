//Longest Consecutive Sequence

import java.util.HashSet;
public class Problem3 {
    // This method returns the length of the longest consecutive sequence
    public int longestConsecutive(int[] nums) {
        // Create a HashSet and add all numbers for O(1) lookups
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        // Iterate through each number in the set
        for (int num : set) {
            // If num-1 is NOT in the set, num is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Keep counting consecutive numbers after currentNum
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the best (longest) streak found so far
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    // Simple test driver
    public static void main(String[] args) {
        Problem3 sol = new Problem3();
        int[] nums = {1,0,1,2};
        System.out.println("Longest Consecutive Sequence: "+sol.longestConsecutive(nums));
    }
}
