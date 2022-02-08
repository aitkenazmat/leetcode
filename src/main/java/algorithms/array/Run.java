package algorithms.array;

public class Run {

    public static void main(String[] args) {


       // int[][] rectangle = new int[][]{{1, 2, 3}, {4, 5, 6},{7, 8, 9}};
//        int[][] rectangle = new int[][]{{5,2,5,9,4}, {10,7,1,4,1},{7,3,1,3,8},{9,7,9,4,9}};
//        int[][] rectangle = new int[][]{{2,8}, {8,8},{7,4}};
        int[][] rectangle = new int[][]{{3,9,4}, {5,6,10}};

        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(rectangle);
        subrectangleQueries.updateSubrectangle(1,1,1,1,5);
        subrectangleQueries.updateSubrectangle(0,0,1,0,6);


        String va = "";


       // System.out.println(subrectangleQueries.getValue(1, 1));
    }
}
