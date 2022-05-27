/*
    Name : Gurpreet Kaur
    Student Number : A00252915
    Program : JAV-1001 - 50733 - App Development for Android - 202205 - 001
*/
import java.util.Scanner;

public class Conversion {
    /*
     * Main function
     * Execution starts from here
     */
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("------------This is metric conversion system--------------");
        System.out.println("\n");
        System.out.println("Please enter any value to convert");
        Scanner scanner = new Scanner(System.in);
        // 1: To store user's input
        double userInput = scanner.nextDouble();
        System.out.println("Please select metric option from below:-");
        System.out.println("1 - Km to Mil");
        System.out.println("2 - Mil to Km");
        System.out.println("3 - Cm to Inch");
        System.out.println("4 - Inch to Cm");
        System.out.println("5 - kg to lb ");
        System.out.println("6 - lb to kg ");
        System.out.println("7 - g to oz");
        System.out.println("8 - oz to g");
        System.out.println("9 - c to f");
        System.out.println("10 - c to k ");
        System.out.println("11 - f to c ");
        System.out.println("12 - f to k");
        System.out.println("13 - l to cups");
        System.out.println("14 - cup to l");
        System.out.println("\n");

        // 2: Input from user for metric
        int userInputMetricOption = scanner.nextInt();
        scanner.nextLine();

        if (userInputMetricOption == 1) {
            // 1: Convert Km to Mil . This part is executed
            // 1km = 0.62mi
            double output = 0.62 * userInput;
            System.out.println(userInput + " KM equals to " + output + " Mil");
        } else if (userInputMetricOption == 2) {
            // 2: This part is executed
            // 1mil = 1.61km
            double output = 1.61 * userInput;
            System.out.println(userInput + " Mil equals to " + output + " km"); 
        } else if (userInputMetricOption == 3) {
            // 3: This part is executed
            // 1cm = 0.39in
            double output = 0.39 * userInput;
            System.out.println(userInput + " CM equals to " + output + " inch");
        } else if (userInputMetricOption == 4) {
            // 4: This part is executed
            //1in = 2.54cm
            double output = 2.54 * userInput;
            System.out.println (userInput + " inch equals to" + output + " cm");
        } else if (userInputMetricOption == 5) {
            // 5: This part is executed
            //1kg = 2.2lb
            double output = 2.2 * userInput;
            System.out.println (userInput + " kg equals to " + output + " lb");
        } else if (userInputMetricOption == 6) {
             // 6: This part is executed 
            // 1lb = 0.45kg
            double output = 0.45 * userInput;
            System.out.println(userInput + " lb equals to " + output + " kg");
        } else if (userInputMetricOption == 7) {
            // 7 : This part is executed
            // 1g = 0.04 oz 
            double output = 0.04 * userInput;
            System.out.println(userInput + " g equals to " + output + " oz" );
        } else if (userInputMetricOption == 8) {
            // 8 : This part is executed
            // 1oz = 28.35 g
            double output = 28.35 * userInput; 
            System.out.println(userInput + " oz equals to " + output + " g");
        } else if (userInputMetricOption == 9) {
            //9 : This part is executed
            // c to f (  userinput * 9/5) + 32
            double output = (userInput * 9/5)  + 32 ;
            System.out.println(userInput + " C equals to " + output + " F");
        } else if (userInputMetricOption == 10) {
            //10 : This part is executed
            // c to k (userinput * 273.15)
             double output = (userInput * 273.15);
             System.out.println(userInput + " C equals to " + output + " k");
        } else if (userInputMetricOption == 11) {
            // 11 : This part is executed 
            //f to c ( userinput - 32) * 5/9 )
            double output = (userInput - 32 * 5/9);
            System.out.println(userInput + " f equals to " + output + " C");
        } else if (userInputMetricOption == 12) {
            //12 : This part is executed
            // f to k ( userinput - 32)  * 5/9 + 273.15
            double output = (userInput - 32) * 5/9 + 273.15 ;
            System.out.println(userInput + " f equals to " + output + " k");
        } else if (userInputMetricOption == 13)  {
            //13 : This part is executed
            // 1l = 4.17 cups 
            double output = 4.17 * userInput;
            System.out.println( userInput + " l equals to " + output + " cups");
        } else if  (userInputMetricOption == 14) {
            //14 : This part is executed
            //1cup= 0.24l 
            double output = 0.24 * userInput;
            System.out.println(userInput + " 1 cup equals to " + output + " l");
        } else {
            // else: This part is executed
            System.out.println("Wrong option selected!!!");
        }
    }
}
