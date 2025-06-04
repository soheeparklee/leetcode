package com.example.leetcode.hash;

import java.util.*;

public class Anagram {
        public List<List<String>> groupAnagrams(String[] strs) {

            Map<String, List<String>> map = new HashMap<>();
            for(String str: strs){
                char[] charArr = str.toCharArray();
                Arrays.sort(charArr); //똑같이 만들기
                String key = new String(charArr);

                map.computeIfAbsent(key, s -> new ArrayList<>()).add(str);
            }

            return new ArrayList<>(map.values());
        }
}
