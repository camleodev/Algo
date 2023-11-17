package algoPartie2;

public class HouseRobber {
    public void main(String[] args) {

        /*You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

        Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.



        Example 1:

        Input: nums = [1,2,3,1]
        Output: 4
        Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
                Total amount you can rob = 1 + 3 = 4.

        Example 2:

        Input: nums = [2,7,9,3,1]
        Output: 12
        Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
                Total amount you can rob = 2 + 9 + 1 = 12.*/

        int [] nums = {2,7,9,3,1};
        System.out.println(this.rob(nums));;



    }

    public int rob(int[] nums) {
        if(nums.length==1) return nums[0]; // cas d'une seule entrée dans le tab[2]
        int dp[]=new int[nums.length]; // Exemple [2,7,9,3,1]
        dp[0]=nums[0]; // 2
        dp[1]=Math.max(nums[0],nums[1]); // 2,7
        for(int i=2;i<nums.length;i++){
            if(dp[i]>0) return dp[i];
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]); //1er passage 2,7,11
            // 2 ième 2,7,11,11
            // 3 ième 2,7,11,11,12
        }
        return dp[nums.length-1]; //12
    }
}
