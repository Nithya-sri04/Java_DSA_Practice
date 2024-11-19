import java.util.HashMap;
import java.util.Scanner;

public class NonReapeatingChar {
    static char nonRepeatingChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] c = s.toCharArray();
        for(int i =0;i<c.length;i++){
            map.put(c[i],map.getOrDefault(c[i],0)+1);
            
        }
        
        for(int i =0;i<c.length;i++){
            if(map.get(c[i]) == 1){
                return c[i];
                
            }
        }
        
        return '$';
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scanner.nextLine();
    char result = nonRepeatingChar(input);
    if (result != '$') {
        System.out.println("First non-repeating character: " + result);
    } else {
        System.out.println("No non-repeating character found.");
    }

    scanner.close();
    }

    
}
