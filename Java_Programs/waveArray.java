import java.util.Scanner;

public class waveArray {
    public void convertToWave(int[] arr) {
       
          int i=0;
        while(i<arr.length-1){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i+=2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        waveArray obj = new waveArray();
        obj.convertToWave(arr);

        System.out.println("Array after sorting in wave form:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
   
    
}
