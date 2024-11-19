import java.util.Stack;
public class DeleteMiddle {
    public static void deleteMiddle(Stack<Integer> stack, int currentIndex, int middleIndex) {
        // Base case
        if (currentIndex == middleIndex) {
            stack.pop();
            return;
        }
        int topElement = stack.pop();
        deleteMiddle(stack, currentIndex + 1, middleIndex);
        stack.push(topElement);
    }

    public static void deleteMiddleElement(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int middleIndex = stack.size() / 2;
        deleteMiddle(stack, 0, middleIndex);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5); 
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.println("Original Stack: " + stack); 
        deleteMiddleElement(stack);
        System.out.println("Stack after deleting middle element: " + stack);
    }
}
