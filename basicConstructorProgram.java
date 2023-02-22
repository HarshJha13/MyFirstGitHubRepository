import java.util.Scanner;

public class powerOftheNumber 
{
    static void printPower(int number,int number_2, int power, int fact)
    {
        if (power == 0)
        {
            System.out.println("The answer is :" +1);
            return ;
        }
        if (fact ==0)
        {
            System.out.print("The answer is : "+number_2);
            return ;
        }
        fact--;
        printPower(number,number_2*=number, power, fact);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide the number :");
        int num = sc.nextInt();
        System.out.print("Give the power :");
        int pow = sc.nextInt();
        int fact = pow;
        int num_2 =1 ;
        printPower(num,num_2,pow,fact);
    }
    
    
}