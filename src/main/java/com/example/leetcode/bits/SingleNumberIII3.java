package com.example.leetcode.bits;

public class SingleNumberIII3 {
    public int[] singleNumber(int[] nums) {
        int[] answer = new int[2];

        int xOr=0;
        for(int n: nums){
            xOr ^= n; //xOr = 6
        }

        int diffBit = xOr & -xOr; //find differentiating bit

        for(int n: nums){
            if((n & diffBit) == 0){
                answer[0] ^= n;
            }else{
                answer[1] ^= n;
            }
        }
        return answer;
    }
}
