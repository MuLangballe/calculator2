import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

// "char" kan bruges ligesom string og int. Det må dog kun være et tegn.
        double num1;
        double num2;
        char charInput;
        double result;

        while (true){
            System.out.println("Velkommen til regnemaskinen");
            System.out.println(" + for addition ");
            System.out.println(" - for substraktion");
            System.out.println(" * for multiplikation");
            System.out.println(" / for division");
            System.out.println(" q for quit");
            charInput = input.next().charAt(0);

            if (charInput =='q')
                break;

            num1 = inputDouble("Write first number : ");

            num2 = inputDouble("Write second number : ");

            switch (charInput){
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.print("Ugyldig oprator (regne tegn)");
                    input.nextLine();
                    continue;
            } //switch end
            System.out.print("RESULT = " + result);
            System.out.println();

        }// while løkke slut
    }//main


    static double inputDouble(String promt) {
        Scanner input = new Scanner(System.in);
        boolean isInputOk = false;
        double inputNumber = 0;

        do {
            try {
                System.out.print(promt);
                inputNumber = input.nextDouble();
                isInputOk = true;
            } catch (InputMismatchException e) {
                System.out.println("wrong input, try again");
            }
        } while (!isInputOk);
        return inputNumber;
    }
}
