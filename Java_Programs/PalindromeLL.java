import java.util.ArrayList;
import java.util.List;

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
public class PalindromeLL {

    public static boolean isPalindrome(ListNode head){
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }

        int left = 0;
        int right = list.size()-1;

        while(left<right && list.get(left) == list.get(right)){
            left++;
            right--;
        }

        return left>=right;
    }

   
    public static void main(String[] args) {
        
        
        ListNode node5 = new ListNode(1, null);
        ListNode node4 = new ListNode(2, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        System.out.println("Test case 1: " + PalindromeLL.isPalindrome(node1)); 

       
        ListNode node6 = new ListNode(3, null);
        ListNode node7 = new ListNode(2, node6);
        ListNode node8 = new ListNode(1, node7);
        System.out.println("Test case 2: " + PalindromeLL.isPalindrome(node8)); 

        
        ListNode node9 = new ListNode(1, null);
        System.out.println("Test case 3: " + PalindromeLL.isPalindrome(node9)); 

        
        System.out.println("Test case 4: " + PalindromeLL.isPalindrome(null)); 
    
    
}

    
}
