package algorithms.array;

public class NumberStudentsDoingHomeworkatGivenTime {
    public static void main(String[] args) {

        int[]startTime = new int[]{9,8,7,6,5,4,3,2,1};
        int[]endTime = new int[]{10,10,10,10,10,10,10,10,10};
        System.out.println(busyStudent(startTime, endTime, 5));
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int c = 0;
        for (int i = 0; i < startTime.length ; i++) {

            int timeStartStudent = startTime[i];
            int timeEndStudent = endTime[i];

            if (timeStartStudent<=queryTime && timeEndStudent>=queryTime) {
                c++;
            }

        }
        return c;
    }
}
