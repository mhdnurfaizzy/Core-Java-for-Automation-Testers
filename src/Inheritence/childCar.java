package Inheritence;

public class childCar extends parentCar{

    public void engine() {
        System.out.println("new engine");
    }

    public void carColour() {
        System.out.println(colour);
    }

    public static void main(String[] args) {
        childCar cc = new childCar();
        cc.carColour(); // call method carColour and get value colour from parentCar
    }

}
