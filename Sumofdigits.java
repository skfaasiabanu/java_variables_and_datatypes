import java.util.*;
public class Sumofdigits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit=0;
        int sum=0;
        while(n>0)
        {
            digit=n%10;
            n=n/10;
            sum=sum+digit;
        }
        System.out.println(sum);
    }
}