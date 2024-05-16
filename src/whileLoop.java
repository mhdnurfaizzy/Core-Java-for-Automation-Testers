import java.util.Scanner;

public class whileLoop {


    public void whileLoop() {
        int i = 0;
        while(i<=10) {
            System.out.println(i);
            i++; //to stop the infinity loop, after increment to 9 it will stop
        }
    }

    public void doWhileloop() {
        int j = 20;
        do{
            System.out.println(j);
            j++;
        } while (j>30);
    }

    public void count() {
        int i = 1;
        while(i<=5) {
            System.out.println(i);
            i++;
        }
    }

    public void sumOfDIgits() {

        int number, digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        while(number > 0)
        {
//finds the last digit of the given number
            digit = number % 10;
//adds last digit to the variable sum
            sum = sum + digit;
//removes the last digit from the number
            number = number / 10;
        }
//prints the result
        System.out.println("Sum of Digits: "+sum);
    }




    public static void main(String[] args) {
        whileLoop wl = new whileLoop();
        wl.whileLoop();
        wl.doWhileloop();
        wl.count();
        wl.sumOfDIgits();

    }
}
