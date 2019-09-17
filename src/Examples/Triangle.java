package Examples;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args){

        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("What are you solving for?  \n 1 - for right triangle \n "+
                "2 - for Isosceles \n 3 - for Equilateral \nChoice >>>>>");
        choice = input.nextInt();

        if (choice == 1){
            rightTriangle();

        }
        else if (choice == 2){
            isoscelestriangle();

        }
        else if (choice == 3){

        }

    }

    public static void rightTriangle(){
        Scanner input = new Scanner(System.in);
        String choice = null;
        double side1;
        double side2;
        System.out.println("Which side do you want to solve for?\n"+
                "A-side\nB- side\nC- side");
        choice = input.next();
        if(choice.equalsIgnoreCase("A")){
            System.out.println("Please enter for side B >>>>");
            side1 = input.nextDouble();
            System.out.println("Please enter for side C >>>>");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1, side2, choice);
            solvePerimeter(side1, side2, choice);
        }
       else if(choice.equalsIgnoreCase("B")){
            System.out.println("Please enter for side A >>>>");
            side1 = input.nextDouble();
            System.out.println("Please enter for side C >>>>");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1, side2, choice);
            solvePerimeter(side1, side2, choice);

        }
        else if(choice.equalsIgnoreCase("C")){
            System.out.println("Please enter for side A >>>>");
            side1 = input.nextDouble();
            System.out.println("Please enter for side B >>>>");
            side2 = input.nextDouble();
            rightTriangleMathC(side1, side2, choice);
            solvePerimeter(side1, side2, choice);

        }



        }

    public static void solvePerimeter(double side1, double side2, String choice) {
        String Perimeter;
        Perimeter = ((side1 + side2 + choice));
        System.out.println("The perimeter is " + Perimeter);
    }

    public static void rightTriangleMathC(double side1, double side2, String choice){
        double C;
        C = Math.sqrt((side2*side2)-(side1 * side1));
        System.out.println("The answer for C is >>>>");

    }
    public static void rightTriangleMathAB(double side1, double side2, String choice){
        double notC;
        notC = Math.sqrt((side2 * side2)-(side1 * side1));
        System.out.println("The Side " + choice + " is " + notC);


    }
    public static void isoscelestriangle(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of the triangle >>>> ");
        double base = input.nextDouble();
        System.out.println("Enter one the equal sides ");
        double equalSide = input.nextDouble();
        base = base/2;
        rightTriangleMathAB(base, equalSide, "Height" );


    }


    }





