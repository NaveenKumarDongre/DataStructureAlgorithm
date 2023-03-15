import java.util.Scanner;

public class FactorialOfNumber {
    
    public static int factorialOfNumber(int n)
    {
        if(n <= 1)
        return 1;
        
        int res = 1;
        for(int i = 2; i <= n; i++){
            res *=i;
        }
        return res;
    

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        System.out.println(factorialOfNumber(n));
        sc.close();

    }
}
