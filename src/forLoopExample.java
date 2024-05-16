public class forLoopExample {

    public void printOut(){
            int[] numbers = {11,22,33,44,55,66,77,88,99};

            for (int i = 0; i < numbers.length; i++) {
                if (i % 2 == 0) {
                    System.out.print("-*");
                } else {
                    System.out.print(numbers[i]);
                    System.out.print("*");
                }
            }
            System.out.print("-");
    }



    public void oddNumber() { //print angka ganjil
        int number = 10;
        System.out.print("List of odd numbers from 1 to " + number + ": ");
        for (int i = 1; i <= number; i++) {
            //logic to check if the number is even or not
            //if i%2 is equal to zero, the number is even
            if (i%2!=0){
                System.out.print(i + " ");
            }
        }
    }



    public void evenNumber() { //print angka genap
        int number = 10;
        System.out.print("List of even numbers from 1 to " + number + ": ");
        for (int i = 1; i <= number; i++) {
            //logic to check if the number is even or not
            //if i%2 is equal to zero, the number is even
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void ifElse() {
        if(5>2) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
    }

    public void forExample() {
        for (int i=0;i<=10;i++) {
            if (i==8) {
                System.out.println(i + " shown");
            } else {
                System.out.println("not found");
            }
        }
    }

//    for (initialization;condition;increment) {
//
//    }
    public void forLoop() {
        for(int i=1;i<=10;i++) {
            System.out.println(i);
        }
    }

    public void fibonaci(int n) {
        int a=0;
        int b=1;

        for(int i=1;i<n;i++){
            System.out.println(a + "");

            // Swap
            int num3 = b + a;
            a = b;
            b = num3;
        }

    }

    public void factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("factorial from " + n + " is = " + fact);


    }

    public void primeNumber() {
        int num = 4;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }


    public static void main(String[] args) {
        forLoopExample fl = new forLoopExample();
        fl.ifElse();
        fl.forExample();
        fl.forLoop();
        fl.fibonaci(10);
        fl.factorial(5);
        fl.primeNumber();
        fl.evenNumber();
        fl.oddNumber();
        fl.printOut();

    }

}
