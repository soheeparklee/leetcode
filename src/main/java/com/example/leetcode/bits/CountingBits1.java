package com.example.leetcode.bits;

public class CountingBits1 {
    public int getOnes(int i){
        String binary = Integer.toBinaryString(i);
        int count = 0;
        for(char a: binary.toCharArray()){
            if(a == '1') count++;
        }
        return count;
    }

    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0; i<=n; i++){
            int count = getOnes(i);
            ans[i] = count;
        }

        return ans;
    }
}
