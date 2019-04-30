/*Write a program to reverse any string without using String Buffer. */

package com.stackroute;

//import java.util.Scanner;

public class ReverseString
{
    String str="Hello";
    String strint= "12345.15";
    //public static void main(String[] args)
    public String revmethod()
    {

        String rev="";

        /*System.out.println("Enter a String to reverse:");
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();*/
        int length=str.length();

        for (int i = length-1; i >= 0; i--)
        {
            rev=rev+str.charAt(i);
        }
        return  rev;
    }

    public  boolean checkNull()
    {
        if(str.equals(" "))
        {
            return true;
        }
        else
            {
            return false;
        }

    }



    public boolean checkisInteger()
    {
        boolean numeric = true;
        try
        {
            Double num = Double.parseDouble(strint);
        }
        catch (NumberFormatException e)
        {
            numeric = false;
        }

        if(numeric==true)
            {
                return true;
            }
        else
            {
                return false;
            }
    }


}




