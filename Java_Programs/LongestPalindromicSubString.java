public class LongestPalindromicSubstring {
    public static String longestPalindrome(String str) {
        if (str == null || str.length() < 1) return "";
        
        int start = 0, end = 0;
        
        for (int i = 0; i < str.length(); i++) {
            int len1 = expandAroundCenter(str, i, i);
            int len2 = expandAroundCenter(str, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        return str.substring(start, end + 1);
    }

    private static int expandAroundCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; 
    }

    public static void main(String[] args) {
        String str1 = "forgeeksskeegfor";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(str1)); 
        
        String str2 = "Geeks";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(str2)); 
        
        String str3 = "abc";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(str3)); 
        
        String str4 = "";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(str4)); 

        String str5 = "abacdfgdcaba";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(str5)); 
        
        String str6 = "aabcdcb";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(str6));
    }
}
