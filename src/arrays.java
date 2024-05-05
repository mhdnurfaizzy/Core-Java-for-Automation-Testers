import java.util.Arrays;

public class arrays {
    //2Dimension array
    public void easyWayMultiDimensionalArrays() {
        int arr[][] = {{1,2,3}, {1,2,3}, {1,2,3}};

        for (int n = 0 ; n < arr.length ; n++)
        {
            System.out.println(Arrays.toString(arr[n]));
        }

    }

    public void otherMultiDimensionalArrays() {
        int a[][] = new int [2][3]; //initialized [2] 2 row [3] 3 colomn

        a[0][0] = 2;
        a[0][1] = 3;
        a[0][2] = 0;
        a[1][0] = 2;
        a[1][1] = 6;
        a[1][2] = 8; //random number

        for(int i=0;i<2;i++) { //print rows
            for (int j=0;j<3;j++) { //print colomn
                System.out.println(a[i][j]);
            }
        }


    }
    public void multiDimensionalArrays() {
        int a[][] = new int [2][3]; //initialized [2] 2 row [3] 3 colomn

        a[0][0] = 2;
        a[0][1] = 3;
        a[0][2] = 0;
        a[1][0] = 2;
        a[1][1] = 6;
        a[1][2] = 8; //random number

        System.out.println("Multidimensional array number is = " + a[0][1]);
    }
    //End of 2Dimension array


    //1Dimension array
    public void otherArrays() {
        int[] b = {5,9,1,3,0}; //declare and array then allocate to memmory, and initialized value

        for(int i=0;i<b.length;i++) {
            System.out.println(b[i]);
        }
    }
    public void arrays() {
        int a[] = new int[5]; //Declare an array and aloccate to memory
        a[0] = 4;
        a[1] = 2;
        a[2] = 9;
        a[3] = 1;
        a[4] = 7; // initialized value into array

        for (int i=1;i<=a.length;i++) {
            System.out.println(a[0]); //Retrieve values present in array [0]
        }
    }
    //end of 1Dimension array


    public static void main(String[] args) {

        arrays ar = new arrays();

        ar.arrays();
        System.out.println("====");
        ar.otherArrays();
        System.out.println("====");
        ar.multiDimensionalArrays();
        System.out.println("====");
        ar.easyWayMultiDimensionalArrays();
        System.out.println("====");
        ar.otherMultiDimensionalArrays();
    }
}
