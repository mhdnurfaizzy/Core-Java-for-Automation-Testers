package OverloadingAndOverriding;

public class parentClass {

    public void getData(int a)
    {
        System.out.println(a);
    }
    public void getData(String a)
    {
        System.out.println(a);
    }
    public void getData(int a,int b)
    {
        System.out.println(b);
    }
    public static void main(String[] args) {
// TODO Auto-generated method stub

        parentClass cl=new parentClass();
        cl.getData(2);
        cl.getData("hello");
        cl.getData(2, 5);

    }

}

