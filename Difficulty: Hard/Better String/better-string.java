//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();

            Solution obj = new Solution();
            String ans = obj.betterString(str1, str2);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public static int countDistinctSubsequences(String str) {
        int n = str.length();
        int[] dp = new int[n + 1]; // DP array
        dp[0] = 1; // Base case: empty string has 1 subsequence (the empty subsequence)

        // Map to track the last occurrence of each character
        HashMap<Character, Integer> lastOccurrence = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            char currentChar = str.charAt(i - 1);

            // Each character doubles the number of subsequences
            dp[i] = 2 * dp[i - 1];

            // If the character has appeared before, subtract the subsequences
            // that were counted twice due to this character
            if (lastOccurrence.containsKey(currentChar)) {
                dp[i] -= dp[lastOccurrence.get(currentChar) - 1];
            }

            // Update the last occurrence of the current character
            lastOccurrence.put(currentChar, i);
        }

        return dp[n];
    }

    public static String betterString(String str1, String str2) {
        // Count distinct subsequences for both strings
        int count1 = countDistinctSubsequences(str1);
        int count2 = countDistinctSubsequences(str2);

        // Compare the counts and return the better string
        return count1 >= count2 ? str1 : str2;
    }
}