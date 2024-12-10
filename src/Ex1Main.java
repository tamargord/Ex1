import java.util.Scanner;
import java.util.Arrays;

public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numBase1 = "", numBase2 = "", quit = "quit";

        while (true) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            numBase1 = sc.next();
            if (numBase1.equals(quit)) {
                break;
            }

            System.out.print("num1: " + numBase1 + " ");
            System.out.print("is number: " + Ex1.isNumber(numBase1) + " ");
            System.out.print(", value: " + Ex1.number2Int(numBase1) + " ");
            System.out.println();

            if (!Ex1.isNumber(numBase1)) {
                System.out.println("ERR: num1 is in the wrong format!");
                continue;
            }

            System.out.println();
            System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
            numBase2 = sc.next();
            if (numBase2.equals(quit)) {
                break;
            }

            System.out.print("num2: " + numBase2 + " ");
            System.out.print("is number: " + Ex1.isNumber(numBase2) + " ");
            System.out.print(", value: " + Ex1.number2Int(numBase2) + " ");
            System.out.println();

            if (!Ex1.isNumber(numBase2)) {
                System.out.println("ERR: num2 is in the wrong format!");
                continue;
            }

            System.out.println();
            System.out.println("Enter a base ,a number from 2 to 16:");
            int baseF = sc.nextInt();
            if (baseF < 2 || baseF > 16) {
                System.out.println("Not a valid base.");
                continue;
            }


            int num1 = Ex1.number2Int(numBase1);
            int num2 = Ex1.number2Int(numBase2);


            int sumPlus = num1 + num2;
            int sumKefel = num1 * num2;


            String sumString1 = Ex1.int2Number(sumPlus, baseF);
            String sumString2 = Ex1.int2Number(sumKefel, baseF);

            System.out.println(numBase1 + " + " + numBase2 + " = " + sumString1);
            System.out.println(numBase1 + " * " + numBase2 + " = " + sumString2);

            String[] arr = {numBase1, numBase2, sumString1, sumString2};
            int max = Ex1.maxIndex(arr);

            //converts an array into a string representation.
            System.out.println("Max number over " + Arrays.toString(arr) + " is: " + arr[max]);




        }
    }
}
