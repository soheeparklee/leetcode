package com.example.leetcode.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumsOf3Numbers {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;

            int lt = i+1;
            int rt = n-1;
            while(lt < rt){
                int first = nums[i];
                int left = nums[lt];
                int right = nums[rt];

                int sum = first + left + right;
                if(sum == 0){
                    answer.add(Arrays.asList(first, left, right));
                    while(lt < rt && nums[lt] == nums[lt+1]) lt++;
                    while(lt < rt && nums[rt] == nums[rt-1]) rt--;
                    lt++;
                    rt--;
                }else if(sum < 0){
                    lt++;
                }else{
                    rt--;
                }
            }
        }
        return answer;
    }
}
