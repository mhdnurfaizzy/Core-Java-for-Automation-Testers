package superKeyword;

public class thisDemo {
        int a= 30;

        public void getData(){
            int a = 20;
            int b= a+this.a;

            System.out.println(a);
            System.out.println(this.a);
            System.out.println(b);
        }

    public static void main(String[] args) {
        thisDemo td = new thisDemo();
        td.getData();
    }
}
