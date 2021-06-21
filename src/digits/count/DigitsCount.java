/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digits.count;

import java.util.Scanner;

/**
 *
 * @author konda babu
 */
public class DigitsCount 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
            int n=input.nextInt();
            int count=0;
            while(n!=0)
            {
                n=n/10;
                count++;
            }
            if(count==1)
            {
                System.out.println(1);
            }
            else if(count==2)
            {
                System.out.println(2);
            }
            else if(count==3)
            {
                System.out.println(3);
            }
            else
            {
                System.out.println("More than 3 digits");
            }
    }
}


   
