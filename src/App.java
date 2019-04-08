/**
 * @Author Qraven
 * @Version 1.0 08-04-2019
 *
 * This is a simple app made in Java, which is calculating the famous 3x + 1 Conjecture/Collatz Conjecture
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); //Input Manager

        int input; //Variables

        System.out.println("Welcome in 3x + 1 Conjecture solver."); //Greeting
        System.out.println("For which number would you like to solve?"); //Question

        input = sc.nextInt(); //Taking the input to the variable


        while(input != 1) //Loop will end when  our variable would be equal to 1, so we won't go to an infinite loop
        {
            if(input % 2 == 0) //If variable is even
            {
                input = input/2; //Divide the variable by 2
                System.out.println(input); //Print the variable
            }else if(input % 2 != 0) //If the variable is odd
            {
                input = 3*input + 1; //Multiply the variable by 3 and add 1
                System.out.println(input);//Print the variable
            }
        }
    }

}
