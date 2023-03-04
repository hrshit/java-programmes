import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class PrimeFactorial {
    public static void main(String[] args) {
        System.setProperty("server.port", "4000");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
//        System.out.println(Arrays.toString(primeFactit(n)));
        primeFactit(n);
    }
    public static void primeFactit(int n)
    {
       ArrayList<Integer> list=new ArrayList<>();
       int i=2;
       while (n>0)
       {
           if(n==i) {
               list.add(n);
               n = 0;
           }
          else if (n%i==0 && i<n) {
               if(isPrime(i)==true)
                   list.add(i);
               n=n/i;
           }
           else
           {
               i++;
           }
       }
        System.out.println(Arrays.toString(list.toArray()));




    }
    public static boolean isPrime(int num)
    {
        for (int i = 2; i<=Math.sqrt(num) ; i++) {
            if(num%i==0)
            {
              return false;
            }
        }
        return true;
    }
}
