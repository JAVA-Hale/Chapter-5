package Examples;

import java.util.Scanner;

public class WeekDay {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String day;
        String result;
        System.out.println("Enter a day of the week >>>");
        day = input.next();

        switch (day)
        {
            case "Monday":
                result = "Reserve room for Friday meeting";
                break;
            case "Tuesday":
                result = "Prepare Powerpoint slides";
                break;
            case "Wednesday":
                result = "Send out meeting reminders";
                break;
            case "Thrusday":
                result = "Getting ready for football friday";
                break;
            case "Friday":
                result = "Wear spirit wear for game SPACE THEME";
                break;
                default:
                    result = "Invalid";
        }
        System.out.println(result);
    }
}
