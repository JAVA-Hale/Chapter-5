package Assignment;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int Rock = 1;
        int Paper = 2;
        int Scissors = 3;
        int rand_pick;
        int userChoice;
        Random r = new Random();
        rand_pick = r.nextInt();

        System.out.println(" \n1-for Rock \n2-for Paper \n3-for Scissors");
        userChoice = input.nextInt();

        if (userChoice == 1)
        {
            if (rand_pick == 1)
            {
                System.out.println("Tie");
            }
            else if (rand_pick == 2)
            {
                System.out.println("Paper beats rock");
            }
            else if (rand_pick == 3)
                System.out.println("Rock beats Scissors");

        }
        if (userChoice == 2)
        {
            if (rand_pick == 2)
            {
                System.out.println("Tie");

            }
        }
        if (userChoice == 3)
        {
            if (rand_pick == 3)
            {
                System.out.println("Tie");
            }
        }
    }
}

