package controllers;

import java.util.HashMap;
import java.util.Map;

public class Ejercicios {

    
    public static boolean areAnagrams(String str1, String str2) {
   

      if (str1.length() != str2.length()) return false;

      Map<Character, Integer> freqMap = new HashMap<>();

      for (char c : str1.toLowerCase().toCharArray()) {
         freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
      }

      for (char c : str2.toLowerCase().toCharArray()) {
         if (!freqMap.containsKey(c)) return false;
         freqMap.put(c, freqMap.get(c) - 1);
         if (freqMap.get(c) == 0) {
            freqMap.remove(c);
         }
        }

      return freqMap.isEmpty();
    }

    public int[] sumatoriaDeDos(int[] nums, int objetivo) {

        Map<Integer, Integer> hmap = new HashMap<>(); 

        for (int i = 0; i < nums.length; i++) {
        int complemento = objetivo - nums[i]; 

        if (hmap.containsKey(complemento)) { 
         return new int[]{hmap.get(complemento), i};
        }

        hmap.put(nums[i], i); 
   }

   return null; 
    }
}