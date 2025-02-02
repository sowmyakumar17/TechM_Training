package week1_Tasks;

import java.util.ArrayList;
import java.util.List;
public class FindAllAnagrams {
	public static List<Integer> findingAnagrams(String inputText, String pattern) {
        List<Integer> result = new ArrayList<>();
        int[] patternCount = new int[26], windowCount = new int[26];
        int pLen = pattern.length(), tLen = inputText.length();
        if (tLen < pLen) return result;
        
        // Count frequency of characters in pattern and first window of input text
        for (int i = 0; i < pLen; i++) {
            patternCount[pattern.charAt(i) - 'a']++;
            windowCount[inputText.charAt(i) - 'a']++;
        }
        
        // Iterate through input text using sliding window technique
        for (int i = pLen; i <= tLen; i++) {
            if (matches(patternCount, windowCount)) result.add(i - pLen);
            if (i < tLen) {
                windowCount[inputText.charAt(i) - 'a']++;
                windowCount[inputText.charAt(i - pLen) - 'a']--;
            }
        }
        return result;
    }
	
	// Function to check if two frequency arrays match
    private static boolean matches(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String inputText = "cbaebabacd", pattern = "abc";
        System.out.println(findingAnagrams(inputText, pattern));
    }

}
