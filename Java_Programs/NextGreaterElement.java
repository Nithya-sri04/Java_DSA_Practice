import java.util.Stack;
import java.util.Arrays;

public class NextGreaterElement {

    public static int[] findNextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 9, 2, 16};
        int[] result1 = findNextGreaterElements(arr1);
        System.out.println("Input: " + Arrays.toString(arr1));
        System.out.println("Next Greater Elements: " + Arrays.toString(result1));

        int[] arr2 = {-13, 1, 0, 12};
        int[] result2 = findNextGreaterElements(arr2);
        System.out.println("Input: " + Arrays.toString(arr2));
        System.out.println("Next Greater Elements: " + Arrays.toString(result2));
    }
}

