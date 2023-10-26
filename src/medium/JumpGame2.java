package medium;

import java.util.Arrays;
import java.util.Collections;

public class JumpGame2 {
    public static void main(String[] args) {

        /*Input: nums = [2,3,1,1,4]
        Output: 2
        Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.*/

        int [] nums = {2,3,1,1,4};

        System.out.println( jump(nums));

    }

    public static int jump(int[] nums) {
        int j = 0;
        int position = 0;
        int max = 0;
        for (int i = 0; i < nums.length-1; i++) {
            max = Math.max(max,i+nums[i]);
            if(i == position){
                j++;
                position = max;
            }
        }
        return j;
    }
}
