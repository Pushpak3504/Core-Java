import java.util.Scanner;
class GoodPrimeNumber
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int num = input.nextInt();
        int dup = num;

        boolean isPrime = isPrime(num);

        if(isPrime)
        {
            System.out.println("The whole number is prime number .");

            boolean flag = false;

            while(num>0)
            {
                int digit = num % 10;

                if(isPrime(digit))
                {
                    flag=true;  
                }
                else
                {
                    flag=false; 
                    break;  
                }
                num/=10;
            }

            if(flag)
            {
                System.out.println("The number is good prime number .");
            }
             else
            {
                System.out.println("The number is prime but not a good prime number ");
            }

        }
        else
        {
            System.out.println("The number is not prime number .");
        }
  
    }

    public static boolean isPrime(int num)
    {
        if(num<2)
        {
            return false;
        }
        int i =2;
        while(i<num)
        {
            if(num % i == 0)
            {
                return  false;
            }
            i++;
        }

        return   true;
    }
}