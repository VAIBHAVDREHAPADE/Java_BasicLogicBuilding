package learn.basics.pattern;

import java.util.Scanner;

public class DiamondPattern {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            int middle = (input +1)/2;

            for (int i=1; i<= middle;i++){

                for(int j=middle; j > i;j--){
                    System.out.print(" ");
                }
                for(int k=1 ;k <= (i*2-1);k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i=1;i<=middle-1;i++){
                for(int k=1 ;k <= i;k++){
                    System.out.print(" ");
                }
                for (int j=1; j <=2*(middle-i)-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
