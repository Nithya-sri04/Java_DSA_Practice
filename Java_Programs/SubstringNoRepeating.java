import java.util.*;

public class SubstringNoRepeating {
    public static int LongestSubstringWithNoRepeating(String s){
        int left = 0;
        int right = 0;
        int maxlen = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(right<s.length()){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right))+1,left);
            }
            map.put(s.charAt(right),right);
            maxlen = Math.max(maxlen,right-left+1);
            right++;
        }

        return maxlen;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        int result = LongestSubstringWithNoRepeating(s);
        System.out.println("The length of the longest substring without repeating characters is " + result);  

    }
    
}
