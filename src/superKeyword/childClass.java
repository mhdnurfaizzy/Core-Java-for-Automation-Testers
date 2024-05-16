package superKeyword;

public class childClass extends parentClass{
    String name = "Child String Demo";

    public childClass() {
        super(); //This should be at first line
        System.out.println("Im in chilld class constructor");
    }

    public void getStringData()  {
        System.out.println(name);
        System.out.println(super.name);
    }

    public void getData() {
        super.getData();
        System.out.println("Im in child class");
    }


    public static void main(String[] args) {
        childClass cd = new childClass();
        cd.getStringData();
        cd.getData();

    }
}
