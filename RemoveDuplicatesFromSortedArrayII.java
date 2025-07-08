class Solution {
    public int removeDuplicates(int[] nums) {
        // 0,0,1,1,1,1,2,3,3
        // 0,0,1,1,2,3,3,3,3
        
        int n = nums.length;
        if (nums == null || n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return n;
        }
        int start = 0;
        int i = 1;
        
        while (i < n) {
            int count = 1;
            while (i > 0 && i < n && nums[i] == nums[i - 1]) {
                ++count;
                ++i;
            }

            nums[start++] = nums[i - 1];
            if (count >= 2) {
                nums[start++] = nums[i - 1];
            }
            ++i;
        }


        if (nums[n - 1] == nums[n - 2]) {
            return start;
        }

        nums[start] = nums[n - 1];
        return start + 1;

    }
}