/*5. Write a program that reads an unspecified number of integer arguments using Scanner Class
and adds them together. The program should display total of the given input number and should
only consider integer value.The program should display an error message if there are any non
integer values
Input : 12 23 2 4
Output : 41*/

package com.stackroute;
import java.util.Scanner;
public class CheckIfIntAndSum
 {
    public static void main(String[] args)
    {
        int total = 0, count = 0;
        int number;
        System.out.println("Enter the number: ");
        Scanner s = new Scanner(System.in);
        number = s.nextInt();

        System.out.println("Enter the elements: ");
        int n;
        Scanner s1 = new Scanner(System.in);


        while ((n = s1.nextInt()) != 0)
        {
            total += n;
            count++;
        }
        System.out.println("The total is " + total);


    }
 }

