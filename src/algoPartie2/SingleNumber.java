package algoPartie2;

import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {


        /*
        Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
        You must implement a solution with a linear runtime complexity and use only constant extra space.

        Example 1:

        Input: nums = [2,2,1]
        Output: 1
        Example 2:

        Input: nums = [4,1,2,1,2]
        Output: 4
        Example 3:

        Input: nums = [1]
        Output: 1*/

        int [] nums = {4,1,2,1,2};
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(nums[0],1);

        for (int i = 1; i < nums.length; i++) {
            if(hm.get(nums[i]) == null){
                hm.put(nums[i],1);
            }else{
                hm.put(nums[i], hm.get(nums[i]) + 1);
            }
        }
        for (Object value : hm.values()) {
           System.out.println(value);
        }

    }
}
