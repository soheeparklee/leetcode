package com.example.leetcode.bits;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberIII2 {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> result = new HashMap<>();
        int[] answer = new int[2];
        int index=0;

        for(int n: nums){
            result.put(n, result.getOrDefault(n, 0) +1);
        }

        for(Map.Entry<Integer, Integer> entry : result.entrySet()){
            if(entry.getValue() == 1){
                answer[index] = entry.getKey();
                index++;
                if(index == 2) break;
            }
        }
        return answer;
    }
}
