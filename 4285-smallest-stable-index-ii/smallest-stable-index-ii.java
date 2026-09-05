class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;

        int[] suffixMin = new int[n];

        // Build suffix minimum
        suffixMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }

        // Find first stable index
        int max = nums[0];

        for (int i = 0; i < n; i++) {

            max = Math.max(max, nums[i]);

            int score = max - suffixMin[i];

            if (score <= k) {
                return i;
            }
        }

        return -1;
    }
}