import java.math.BigInteger;
import java.util.*;

public class FactorialBig {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number n");
       int n = sc.nextInt();
       BigInteger res = factorial(n);
       System.out.println(res);

    }

    public static BigInteger factorial(int n){
        BigInteger result = BigInteger.ONE; 
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i)); 
        }
        
        return result;

    }
    
}
