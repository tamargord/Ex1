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
                    //System.out.println(Ex1.equals(numBase1,numBase2));
                System.out.println("Enter a base for output: a number [2,16]");
                int baseF=sc.nextInt();
                if(baseF<2||baseF>16){
                    System.out.println("not valid base");
                    return;
                }
                int bIndex1 = numBase1.indexOf('b');
                int bIndex2 = numBase2.indexOf('b');

                String partBase1 = numBase1.substring( bIndex1+ 1);
                String partBase2 = numBase2.substring(bIndex2 + 1);
                int base1=Integer.parseInt(partBase1);
                int base2=Integer.parseInt(partBase2);
                int num1=Ex1.number2Int(numBase1);
                int num2=Ex1.number2Int(numBase2);
                int sum=num1+num2;
                String numBS=Ex1.int2Number(sum,baseF);
                System.out.println("numbs "+numBS);
                int realSum=Ex1.number2Int(numBS);

                System.out.println(Ex1.int2Number( num1, base1)+"+"+Ex1.int2Number(num2,base2)+"="+realSum);


               }


            sc.close();
        }
    }



