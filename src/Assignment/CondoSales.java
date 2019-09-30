package Assignment;

import java.util.Scanner;

public class CondoSales {

    public static void main(String[] args) {
        int choice;
        int houseValue = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Which condo so you prefer \n 1 - for Park view \n " +
                "2 - for Golf course \n 3 - for lake view \nChoice >>>>>");
        choice = input.nextInt();

        if (choice == 1) {
            System.out.println("A Park View condo is $150,000");
            houseValue = 150000;

        }
        else if (choice == 2) {
            System.out.println("A Golf course is $170,000");
            houseValue = 170000;

        }
        else if (choice == 3) {
            System.out.println("A Lake view is $210,000");
            houseValue = 210000;

        } else if (choice > 3)
            System.out.println("$0");
        AddOnChoices(houseValue);


    }


    public static void AddOnChoices(int houseValue) {

        Scanner input = new Scanner(System.in);
        int choice;
        int total;


        System.out.println("Which do you want to add on \n 1 - for Garage \n " +
                "2 - for Parking space \nChoice >>>>>");
        choice = input.nextInt();
            total = houseValue + 5000;
        if (choice == 1) {
            System.out.println("A garage is an extra $5,000");
            total = houseValue + 5000;
        }
       else if (choice == 2) {
            System.out.println("A parking space is an extra $5,000");
            total = houseValue + 5000;
        }
        System.out.println("The total is going to be " + total);
    }
}


