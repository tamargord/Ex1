import java.util.Scanner;
public class Ex1Main {


        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            String numBase1 = "", numBase2 = "", quit = "quit";
            while (!numBase1.equals(quit) && !numBase2.equals(quit)) {
                System.out.println();
                System.out.println("Ex1 class solution:");
                System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
                numBase1 = sc.next();
                if(numBase1.equals(quit)){
                    break;
                }
                    System.out.println("the given number+base:" + numBase1);
                    System.out.println("value: " + Ex1.number2Int(numBase1));
                    System.out.println(Ex1.isNumber(numBase1));

                System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
                numBase2 = sc.next();
                if(numBase2.equals(quit)){
                    break;
                }
                    System.out.println("value: " + Ex1.number2Int(numBase2));
                    System.out.println(Ex1.isNumber(numBase2));
                    // System.out.println(equals(numBase1,numBase2));

               }


            sc.close();
        }
    }



