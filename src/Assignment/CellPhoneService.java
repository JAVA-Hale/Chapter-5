package Assignment;

import java.util.Scanner;

public class CellPhoneService {

    public static void main(String[] args){

        int minUsed;
        int textSent;
        int gbUsed;
        String result = null;

        Scanner input = new Scanner(System.in);

        System.out.println("How many minutes are you going to use >>>");
        minUsed = input.nextInt();

        System.out.println("How many text messages are you going to send >>>");
        textSent = input.nextInt();

        System.out.println("How many Gigabytes are you going to use >>>");
        gbUsed = input.nextInt();

        if (minUsed < 500 && textSent == 0 && gbUsed == 0) {
            result = "plan A";
        }
        else if(minUsed < 500 && textSent >= 1 && textSent <= 99 && gbUsed == 0 ) {
            result = "Plan B";
        }
        else if(minUsed >= 500 && textSent <= 100 && gbUsed == 0 ){
            result = "Plan C";
        }
        else if(minUsed > 500 && textSent >= 100 && gbUsed == 0){
            result = "Plan D";
        }
        else if(minUsed >= 500 && textSent > 100 && gbUsed>= 1){
            if(gbUsed < 2){
                result = "Plan E $78";
                }
                else if(gbUsed >= 2){
                result = "Plan E $87";
            }
        }

        System.out.println("The plan you need is " + result);
        }

    }
