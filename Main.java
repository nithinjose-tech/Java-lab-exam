import java.util.Scanner;

import factorialnum.Factorialnum;
import reversenum.Reversenum;


public class Main
{

    public static void main(String args[])
    {  
        //Factorial Calculation part
       System.out.println("Enter the digit whose factorial has to be found:");
       Scanner s =new Scanner(System.in);
       int value=s.nextInt();
       Factorialnum f= new Factorialnum();
       int n=f.factorial(value);
       System.out.println("Factorial is: "+n);

        //Reverse Calculation part
       System.out.println("Enter the digit to be reversed");
        Scanner s1 =new Scanner(System.in);
        int value1=s.nextInt();
        Reversenum r =new Reversenum();
        int n1= r.reverse(value1);
        System.out.println("Reversed digit is: "+n1);

        

    }
}