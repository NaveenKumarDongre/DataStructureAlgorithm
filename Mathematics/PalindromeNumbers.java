import java.util.*;

public class PalindromeNumbers {

    public static boolean isPalindromeNumber(int n)
    {
        int original = n; 
        int rev = 0;
        while(n != 0){
            int rem = n % 10; 
            rev = (rev*10) + rem; 
            n = n / 10;
        }
        return original == rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();

        if(isPalindromeNumber(n) == true)
        System.out.println("Yes palindrome");
        else
        System.out.println("Not a palindrome");

        sc.close();
        
    }
    
}
