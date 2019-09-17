package Examples;

import java.util.Scanner;

public class AgeInsultGenerator {

    public static void main(String[] args){

        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age >>> ");
        age = input.nextInt();

        if(age < 12){
            System.out.println("Your just a kid get out of here. ");
        }
        else if(age >= 12 && age < 19){
            System.out.println("Your old enough to know better, hopefully. ");

        }
        else if(age >= 19 && age < 25){
            System.out.println("Get a job you bum. ");
        }
        if (age <= 25 && age > 35){
            System.out.println("Your older than you think you are. ");
        }


    }
}
