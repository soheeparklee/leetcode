package com.example.leetcode.hash;

import java.util.HashSet;

public class LongestSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int answer =0;

        for(int n: nums){
            set.add(n);
        }

        for(int n: set){
            if(!set.contains(n-1)){
                int count = 1;
                int curr = n;
                while(set.contains(curr+1)){
                    count++;
                    curr++;
                }
                answer = Math.max(count, answer);
            }
        }
        return answer;
    }
}
