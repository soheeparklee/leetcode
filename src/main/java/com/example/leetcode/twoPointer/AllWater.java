package com.example.leetcode.twoPointer;

public class AllWater {
    public int trap(int[] height) {
        int lt = 0;
        int rt = height.length-1;
        int left = height[lt];
        int right = height[rt];
        int water = 0;

        while(lt < rt){
            if(left<right){
                lt++;
                left = Math.max(left, height[lt]);
                water += left - height[lt];
            }else{
                rt--;
                right = Math.max(right, height[rt]);
                water += right - height[rt];
            }
        }
        return water;
    }
}
