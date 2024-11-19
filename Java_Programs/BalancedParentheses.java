import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of parentheses:");
        String input = sc.nextLine();
        
        if (balancedOrNot(input)) {
            System.out.println("The parentheses are balanced.");
        } else {
            System.out.println("The parentheses are not balanced.");
        }
        
        sc.close();
    }

    public static boolean balancedOrNot(String str){

        Stack<Character> st = new Stack<>();
        
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.peek();
                if ((top == '(' && ch == ')') || (top == '{' && ch == '}') || (top == '[' && ch == ']')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        
        return st.isEmpty();


        
        
    }
    
}
