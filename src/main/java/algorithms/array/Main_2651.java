package algorithms.array;

public class Main_2651 {
    public static void main(String[] args) {

    }


    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
       int diff = arrivalTime + delayedTime;

       if ( diff <= 23) {
           return diff;
       }

       if ( diff == 24) {
           return 0;
       }

       return diff - 24;
    }
}
