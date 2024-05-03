public class forLoopExample {

    public void ifElse() {
        if(5>2) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
    }

    public void foLoop() {
        for (int i=0;i<10;i++) {
            if (i==8) {
                System.out.println(i + " shown");
            } else {
                System.out.println("not found");
            }
        }
    }

    public static void main(String[] args) {
        forLoopExample fl = new forLoopExample();
        fl.ifElse();
        fl.foLoop();
    }
}
