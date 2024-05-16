public class instacneAndStaticUsage {

    // learn what are Instance Variables
    //learn what are Local Variables
    //learn what are class variables

    //use of Static keyword in Java
    // Importance of Static method and Static variables
    //How Static blok are defined

    String name; // Instance variable
    String address;
    static String city = "Serang"; // static is class variable, so it can call by class name
    static int i=0;

    //blok of static
    static {
        String country;
        int b=2;
    }

    instacneAndStaticUsage(String name, String address) { //using constructor
        this.name = name;
        this.address = address;
        i++; // count by instance variable implementation, related line in 39.40
        System.out.println(i);
    }

    public void getAddress() {
        System.out.println(address + " " + city);
    }

    public static void getCity(){
        System.out.println(city);
    }

    public static void main(String[] args) {
        //call variable using inctance variable
        instacneAndStaticUsage obj = new instacneAndStaticUsage("izi", "serang");
        instacneAndStaticUsage obj1 = new instacneAndStaticUsage("izi izi", "jakarta");


        obj.getAddress(); // call method with creating an object first
        obj1.getAddress();

        instacneAndStaticUsage.getCity(); // in static, you can call method without create an object, by call with class name and methode should be static
        instacneAndStaticUsage.i=4;
    }

}
