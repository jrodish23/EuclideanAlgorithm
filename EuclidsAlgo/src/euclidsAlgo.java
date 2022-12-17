/* Implementing Euclids Algorithm to find the GCD   */
/* of two integers whether they are positive or 	*/
/*	negative.										*/
/*	Jarrad Self										*/
/*	HW2 CS3626 SO2									*/
/*	Question 2										*/

import java.util.Scanner;

public class euclidsAlgo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
	
        int a;
        int b;

        while (true) {

            System.out.println("Please provide two positive or negative integers you want the GCD of...");
            System.out.println("");
            System.out.print("First number: ");
            String cmd = scan.nextLine();
            if (cmd.equals("")) {
                break;
            }
            int number1 = Integer.valueOf(cmd);
            System.out.print("Second number: ");
            int number2 = Integer.valueOf(scan.nextLine());
	
            if (number1 < 0) { 			//checking for positive integers and placing them in correct order. 
                number1 = -1 * number1;
            }
            if (number2 < 0) {
                number2 = -1 * number2;
            }
            if (number1 <= number2) {
                a = number1;
                b = number2;
            } else {
                a = number2;
                b = number1;
            }
            
            while (true) {				//implementing euclids algoritms inside the while loop
                if (a == 0 && b == 0) {
                    System.out.println("Cannot compute gcd(a,b)");
                    break;
                }
                if (a == 0) {
                    System.out.println("gcd(" + number1 + "," + number2 + ") = " + b + " \n");
                    break;
                }
                if (b == 0) {
                    System.out.println("gcd(" + number1 + "," + number2 + ") = " + a + " \n");
                    break;
                }

                int r = a % b;		//Finding the remainder for when a is divided by b 

                if (r == 0) {
                    System.out.println("gcd(" + number1 + "," + number2 + ") = " + b + ". \n");
                    break;
                } else {
                    a = b;
                    b = r;
                }
            }
        }
    }
}