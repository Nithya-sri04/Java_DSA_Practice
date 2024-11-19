import java.util.Arrays;
import java.util.Scanner;

public class LongestPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        
        int index = 0;
        while (index < s1.length() && index < s2.length()) {
            if (s1.charAt(index) == s2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        
        return s1.substring(0, index);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of strings:");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] strs = new String[n];
        System.out.println("Enter each string:");
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.nextLine();
        }

        String result = longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
        if(result == ""){
            System.out.println("-1");
        }

        scanner.close();
    }
}

