class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) 
    { 
        this.val = val;
     }
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next;
     }
    
}
public class RemoveElementsLL {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = head;
        ListNode prev = dummy;
       

        while(curr!=null){
            if(curr.val == val){
                prev.next = curr.next;
            }

            else{
                 prev = curr;
            }

            curr = curr.next;
        
        }
        return dummy.next;
        
    }

public static void main(String[] args){
    RemoveElementsLL solution = new RemoveElementsLL();
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(8);
    head.next.next.next.next.next = new ListNode(5);
    

    System.out.println("Original Linked List:");
    printList(head);

    int valToRemove = 8;
    ListNode updatedHead = solution.removeElements(head, valToRemove);

    System.out.println("\nUpdated Linked List after removing " + valToRemove + ":");
    printList(updatedHead);
}


        public static void printList(ListNode head) {
            ListNode curr = head;
            while (curr != null) {
                System.out.print(curr.val + " ");
                curr = curr.next;
            }
            System.out.println();
            }
            
}
