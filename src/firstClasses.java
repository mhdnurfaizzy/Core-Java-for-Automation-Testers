public class firstClasses {

    int a = 2;

    //Method return string
    public String string() {
        return "String";
    }

    //Method return int
    public Integer number() {
        int a =1;
        return a;
    }

    //Method
    public void getData() {
        System.out.println("Im in method");
    }

    public static void main(String[] args) {
        firstClasses fc = new firstClasses(); //Memory allocation to call method in a class
        fc.getData(); //calling method using object

        //Try call method in diffrent classes file
        secondClasses sc = new secondClasses();
        sc.setData(); //calling method from diffrent classes and run on firstClasses file

        System.out.println(fc.a); // using object we can call a variable too
        System.out.println("Hello world!");
    }
}