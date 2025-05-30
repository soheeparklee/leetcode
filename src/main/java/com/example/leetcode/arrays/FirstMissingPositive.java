package com.example.leetcode.arrays;

public class FirstMissingPositive {
        public int firstMissingPositive(int[] nums) {
            //Arrays.sort(nums);

            int n = nums.length;

            for(int i=0; i<n; i++){
                while(nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]){
                    int temp = nums[nums[i]-1];
                    nums[nums[i]-1] = nums[i];
                    nums[i] = temp;
                }
            }

            int answer = 1;
            for(int num : nums){
                if(answer==num){
                    answer++;
                }
            }
            return answer;

        }
}
