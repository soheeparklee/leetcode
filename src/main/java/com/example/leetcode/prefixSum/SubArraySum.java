package com.example.leetcode.prefixSum;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int answer = 0;
        int sum = 0;
        for(int num: nums){
            sum += num;

            if(map.containsKey(sum-k)){ //0번 key
                answer += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return answer;
    }
}
