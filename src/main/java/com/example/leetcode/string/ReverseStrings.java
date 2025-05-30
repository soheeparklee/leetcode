package com.example.leetcode.string;

public class ReverseStrings {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuffer buffer = new StringBuffer();

        for(int i=arr.length-1; i>=0; i--){
            if(i!=0){
                buffer.append(arr[i]);
                buffer.append(" ");
            }else{
                buffer.append(arr[i]);
            }
        }
        return buffer.toString();
    }
}
