/*
 *  UCF COP3330 Summer 2021 Assignment 6 Solution
 *  Copyright 2021 Brandon Powell
 */
/*
Exercise 6 - Retirement Calculator

Your computer knows what the current year is, which means you can incorporate that into your programs. You just have to figure out how your programming language can provide you with that information.

Create a program that determines how many years you have left until retirement and the year you can retire. It should prompt for your current age and the age you want to retire and display the output as shown in the example that follows.

Example Output
What is your current age? 25
At what age would you like to retire? 65
You have 40 years left until you can retire.
It's 2015, so you can retire in 2055.
Constraints

Again, be sure to convert the input to numerical data before doing any math.
Don’t hard-code the current year into your program. Get it from the system time via your programming language.
Challenge

Handle situations where the program returns a negative number by stating that the user can already retire.
*/

import java.util.Calendar;
import java.util.Scanner;
public class ex06 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("What is your current age? ");
        String string1 = in.nextLine();
        int number1 = Integer.parseInt(string1);

        System.out.print("At what age would you like to retire? ");
        String string2 = in.nextLine();
        int number2 = Integer.parseInt(string2);

        int results = number2-number1;
        System.out.println(String.format("You have %d years left until you can retire.",results));

        int year1 = Calendar.getInstance().get(Calendar.YEAR);
        int year2 = year1 + results;
        System.out.print(String.format("Its %d, so you can retire in %d.",year1,year2));

    }
}
