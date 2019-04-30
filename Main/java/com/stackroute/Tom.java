/*2. Write a program which accepts an integer number as input from the user and perform the
following conditional checks:
a. Print Tom if number is odd and exists between 20 to 30
b. Print Jerry, if number is even and exists between 20 and 30*/


package com.stackroute;


public class Tom
{
        int num = 25;
        public String checkEvenOdd()
        {
            if ((num >= 20) && (num <= 30))
            {
                if (num % 2 != 0)
                {
                    return "jerry";
                }

            }
            return "tom";
        }


        public String checkRange()
        {
            if (num < 20 || num > 30)
            {
                return "False";
            }
            else {
                return "True";
            }
        }

        public boolean checkNull()
        {
            if (num == ' ')
            {
                System.out.println("Enter Some Input: ");
                return false;
            }
            else
                {
                return true;
            }
        }


}


