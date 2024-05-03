public class whileLoop {


    public void whileLoop() {
        int i = 0;
        while(i<10) {
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



    public static void main(String[] args) {
        whileLoop wl = new whileLoop();
        wl.whileLoop();
        wl.doWhileloop();

    }
}
