import java.util.Scanner;


public class CountDigits
{
    public static int countDigits(int n)
    {
        int res = 0;
        while(n != 0)
        {
            res++;
            n = n / 10;
        }
        return res; 
    }

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        System.out.println(countDigits(n));
        sc.close();

    }

}