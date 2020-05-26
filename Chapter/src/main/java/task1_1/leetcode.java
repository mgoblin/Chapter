package task1_1;

public class leetcode {
    public int[] twoSum(int[] nums, int target) {
        int a = 0;
        int b = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    break;
                } else {
                    if (target != nums[i] + nums[j]) {
                        break;
                    } else {
                        a = i;
                        b = j;
                    }
                }
            }
        }
        return new int[]{b, a};
    }
    public int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
