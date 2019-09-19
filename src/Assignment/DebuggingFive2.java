package Assignment;

import java.util.Scanner;

public class DebuggingFive2 {
    public static void main(String args[]){
        int num = 1;
        int num2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        num = input.nextInt();
        System.out.print("Enter another number ");
        num2 = (int) input.nextDouble();
        if (num2 / num == 0) {
            System.out.println("Neither of these numbers is evenly divisible into the other");
        }
        else{
            System.out.println("One of these numbers is evenly divisible into the other");
        }





    }
}
