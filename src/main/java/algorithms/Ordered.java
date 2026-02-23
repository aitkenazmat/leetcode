package algorithms;

public class Ordered {

    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int z = 3;

        boolean success = true;
        boolean xy = x < y;
        boolean yz = y < z;

        success = xy && yz;

        System.out.println(success);


    }



    public void check(int x, int y, int z) {
        boolean success = true;

        boolean xy = x < y;
        boolean yz = y < z;
        success = xy && yz;
    }

}
