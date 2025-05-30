package com.example.leetcode.string;

public class ReverseStringsWithPointer {
    public String reverseWords(String s) {
        String[] arr = s.split("\\s+");

        int left = 0;
        int right = arr.length -1;

        while(left < right){
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        StringBuilder builder = new StringBuilder();
        for(String str: arr){
            if(!str.isEmpty()){
                if(builder.length() > 0){
                    builder.append(" ");
                }
                builder.append(str);
            }
        }
        return builder.toString();
    }
}
