import java.util.Scanner;

public class nestedLoops {
    public void otherPyramid() {

        int k=1;

        for(int i=1;i<4;i++) {
            for(int j=1;j<=4-i;j++) {
                System.out.print(k);
                System.out.print("\t");
                k++;
            }
            System.out.println(" ");
        }

    }

    public void otherPyramid2() {

        int k=1;

        for(int i=1;i<4;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(k);
                System.out.print("\t");
                k++;
            }
            System.out.println(" ");
        }

    }

    public void pyramidNestedLoops() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int rows = sc.nextInt();

        // loop to iterate for the given number of rows
        for(int i=1; i <= rows; i++) {
            // loop to print the number of spaces before the star
            for(int j=rows; j >= i; j--) {
                System.out.println(" ");
            }
            // loop to print the number of stars in each row
            for (int k=1; k <= i;k++) {
                System.out.print("*");
            }
            // for new line after printing each row
            System.out.println();
        }
        sc.close();
    }

    public static void main(String[] args) {
        nestedLoops nl = new nestedLoops();
        nl.pyramidNestedLoops();

        System.out.println();

        nl.otherPyramid();
        System.out.println();
        nl.otherPyramid2();

        for (int i=1;i<=3;i++) { //looping for 3 times
            System.out.println("Outer loop started");
            for (int j=1;j<=5;j++) { //inner loop for 5 times
                System.out.println("Inner loops");
            }
            System.out.println("Inner loop finished");
        }
    }
}
