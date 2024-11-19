import java.util.HashMap;
import java.util.Scanner;

public class Anagrams{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first string:");
        String s = sc.nextLine();
        
        System.out.println("Enter the second string:");
        String t = sc.nextLine();

        if (isAnagram(s, t)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
        
        sc.close();
    }
    

    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> count = new HashMap<>();

        for(char x : s.toCharArray()){
            count.put(x,count.getOrDefault(x,0)+1);
        }

        for(char x : t.toCharArray()){
            count.put(x,count.getOrDefault(x,0)-1);
        }

        for(int val : count.values()){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}
