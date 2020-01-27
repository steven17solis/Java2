/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass4phonekeypads;

import java.util.Scanner;

/**
 *
 * @author Steven Solis
 */
public class Ass4Phonekeypads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a letter: ");
        String a = input.nextLine();
        char ch = a.charAt(0);
        ch = Character.toUpperCase(ch);
        
        int number = 0;
        if (Character.isLetter(ch))
        {
            if (ch >= 'W')
                number = 9;
            else if (ch >= 'T')
                number = 8;
            else if (ch >= 'P')
                number = 7;
            else if (ch >= 'M')
                number = 6; 
            else if (ch >= 'J')
                number = 5;
            else if (ch >= 'G')
                number = 4;
            else if (ch >= 'D')
                number = 3;
            else if (ch >= 'A')
                number = 2;
            System.out.println("The corresponding number is " + number);
        }
        else 
            System.out.println(ch + " is an invalid input");
    }
    
}


