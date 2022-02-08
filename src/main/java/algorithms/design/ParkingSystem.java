package algorithms.design;

public class ParkingSystem {

    private int countBig;
    private int countMedium;
    private int countSmall;

    public ParkingSystem(int big, int medium, int small) {
        countBig = big;
        countMedium = medium;
        countSmall = small;
    }

    public boolean addCar(int carType) {
        if ( carType == 1 && countBig >= 1 ) {
            countBig--;
            return true;
        }

        if ( carType == 2 && countMedium >= 1 ) {
            countMedium--;
            return true;
        }

        if ( carType == 3 && countSmall >= 1 ) {
            countSmall--;
            return true;
        }
        return false;
    }
}
