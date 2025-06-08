package com.example.leetcode.twoPointer;

public class MostWater {
    public int maxArea(int[] height) {
        int lt = 0;
        int rt = height.length - 1;
        int answer = 0;

        while(lt<rt){
            int left = height[lt];
            int right = height[rt];
            int h = Math.min(left, right);
            int w = rt - lt;
            int water = h * w;

            if(left < right){
                lt++;
            }else{
                rt--;
            }
            answer = Math.max(water, answer);
        }
        return answer;
    }
}
