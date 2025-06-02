package com.example.leetcode.bits;

public class SingleNumberIII1 {
    public int[] singleNumber(int[] nums) {
        int[] answer = new int[2];
        int index = 0;

        for(int i=0; i<nums.length; i++){
            boolean def = false;
            int now = nums[i];
            for(int j=0; j<nums.length; j++){
                if(i != j && now == nums[j]) {
                    def = true;
                    break;
                }
            }

            if(!def){
                answer[index] = nums[i];
                index++;
                if(index == 2) break;
            }
        }
        return answer;
    }
}
