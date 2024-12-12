import java.util.Scanner;
import java.util.Arrays;

public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numBase1 = "", numBase2 = "", quit = "quit";////  input strings and way to  quit

        while (!numBase1.equals(quit) && !numBase2.equals(quit)) {//loop until either input equals "quit"
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            numBase1 = sc.next();//input of first number
            if (numBase1.equals(quit)) {//check if user wants to quit
                break;
            }
            // print the first number and convert it to an integer if vali
            System.out.print("num1: " + numBase1 + " ");
            System.out.print("is number: " + Ex1.isNumber(numBase1) + " ");
            System.out.print(", value: " + Ex1.number2Int(numBase1) + " ");
            System.out.println();

            if (!Ex1.isNumber(numBase1)) {//checks if the number is in the right format
                System.out.println("ERR: num1 is in the wrong format!");
                continue;
            }

            System.out.println();
            System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
            numBase2 = sc.next();//input of second number
            if (numBase2.equals(quit)) {//check if user wants to quit
                break;
            }
            // print the second number and convert it to an integer if valid
            System.out.print("num2: " + numBase2 + " ");
            System.out.print("is number: " + Ex1.isNumber(numBase2) + " ");
            System.out.print(", value: " + Ex1.number2Int(numBase2) + " ");
            System.out.println();

            if (!Ex1.isNumber(numBase2)) {//checks if the number is in the right format
                System.out.println("ERR: num2 is in the wrong format!");
                continue;
            }

            System.out.println();
            System.out.println("Enter a base ,a number from 2 to 16:");
            int baseF = sc.nextInt();//base input
            if (baseF < 2 || baseF > 16) {//checks if base is in the right range
                System.out.println("Not a valid base.");
                continue;
            }
            //convert inputs to integers
            int num1 = Ex1.number2Int(numBase1);
            int num2 = Ex1.number2Int(numBase2);
            // perform addition and multiplication with the numbers values in decimal
            int sumPlus = num1 + num2;
            int sumKefel = num1 * num2;
            //convert the results to strings in the specified base
            String sumString1 = Ex1.int2Number(sumPlus, baseF);
            String sumString2 = Ex1.int2Number(sumKefel, baseF);
            // print the results
            System.out.println(numBase1 + " + " + numBase2 + " = " + sumString1);
            System.out.println(numBase1 + " * " + numBase2 + " = " + sumString2);
            //array of the first numbers from the user's input and the sum of them in addition and multiplication
            String[] arr = {numBase1, numBase2, sumString1, sumString2};
            int max = Ex1.maxIndex(arr);// finds the index of the maximum value in the array

            //converts an array into a string representation.
            System.out.println("Max number over " + Arrays.toString(arr) + " is: " + arr[max]);




        }
    }
}
