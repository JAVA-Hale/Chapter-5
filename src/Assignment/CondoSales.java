package Assignment;

import java.util.Scanner;

public class CondoSales {

    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Which condo so you prefer \n 1 - for Park view \n " +
                "2 - for Golf course \n 3 - for lake view \nChoice >>>>>");
        choice = input.nextInt();

        if (choice == 1) {
            System.out.println("A Park View condo is $150,000");

        }
        if (choice == 1) {
            System.out.println("A Golf course is $170,000");

        }

    }
}
