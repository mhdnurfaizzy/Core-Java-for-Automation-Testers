package Exception;

public class exceptionDemo {

    public static void main(String[] args) {
        int b=2;
        int c=0;

        try{
            int k=b/c;
            System.out.println(k);
        } catch (Exception e) {
            System.out.println("I caught the error/exception");
        }
//        catch (ArithmeticException a) {
//            System.out.println("I caught the arithmetic error");
//        }
        finally {
            System.out.println("delete cookies"); // no meter ist pass or failed it will run finally output
        }
    }
}
