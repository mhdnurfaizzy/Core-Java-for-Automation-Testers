public class forLoopExample {

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


    public static void main(String[] args) {
        forLoopExample fl = new forLoopExample();
        fl.ifElse();
        fl.forExample();
        fl.forLoop();
        fl.fibonaci(10);
    }
}
