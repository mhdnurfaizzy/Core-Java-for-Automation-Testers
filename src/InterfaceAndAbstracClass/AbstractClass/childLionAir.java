package InterfaceAndAbstracClass.AbstractClass;

public class childLionAir extends parentAirCraft{


    @Override
    public void bodyColor() {
        System.out.println("Red Color on Body");
    }

    public static void main(String[] args) {
        childLionAir lion = new childLionAir();
        lion.engine();
        lion.Safety();
        lion.bodyColor();

        // parentAirCraft p = new parentAirCraft(); / Cant create object because class on parent is abstract, delete abstract to create object in child class
    }
}
