import java.util.*;
public class SmithNumber
{
    static int sumOfDigits(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum=sum+(n%10);
            n=n/10;
        }
        return sum;
    }

    static int sumOfPrime(int n)
    {
        int sum=0;
        int i = n;
        int j =2;
        while(i>1)
        {
            if(i%j==0 && isPrime(j))
            {
                sum=sum+sumOfDigits(j);
                i=i/j;
            }
            else 
                j++;

        }
        return sum;
    }

    static boolean isPrime(int n)
    {
        int ctr = 0;
        for(int i = 1; i<=n;i++)
        {
            if(n%i==0)
            {
                ctr++;
            }
        }
        return(ctr==2);

    }

    static boolean isSmith(int n)
    {
        return(sumOfDigits(n)==sumOfPrime(n));
    }
}