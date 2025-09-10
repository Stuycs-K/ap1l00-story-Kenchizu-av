import java.util.Scanner;
import java.util.Arrays;

  public class Tester {

      public static boolean isPrime(int x){
          int t = 0;
          for (int i = 1; i <= x; i+=1)
          {
            if (x%i==0)
            {
                t += 1;
            }
          }
          if (t>2)
          {
            return false;
          }
          else
          {
            return true;
          }
      }

      public static int nthPrime(int n){
          if (n==0)
          {
            return 2;
          }
          int t = 0;
          int i = 2;
          int p = 0;
          while (t<=n)
          {
            if (isPrime(i))
            {
                t +=1;
                p = i;
            }
            i +=1;
          }
          return p;
      }

      public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many prime numbers you want: ");
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int j = 0; j < size; j+=1)
        {
            nums[j] = j;
        }
        int[] primes = new int[size];
        for (int i = 0; i < size; i+=1)
        {
            primes[i] = nthPrime(i);
        }
        System.out.println(Arrays.toString(nums));
        System.out.print(Arrays.toString(primes));
      }
  }
