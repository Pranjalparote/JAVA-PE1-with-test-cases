/*10. Write a program for the following condition:
Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should
repeat n number of times in the output String.*/

package com.stackroute;
import java.util.Scanner;
public class RepeatNTimes
 {

        public static void main(String[] args)
        {
            RepeatNTimes.repeatPrint();
        }

        static void repeatPrint()
        {
            Scanner s=new Scanner(System.in);

            System.out.println("Enter String: ");
            String str1=s.nextLine();

            System.out.println("Enter Number: ");
            int n=s.nextInt();

            int index=str1.length()-n;

            String str2=str1.substring(index);

            System.out.print(str1);

            while(n!=0)
            {
                System.out.print(str2);
                n--;
            }
        }

 }

