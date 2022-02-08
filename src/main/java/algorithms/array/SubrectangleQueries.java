package algorithms.array;

public class SubrectangleQueries {
    private int[][] rectangle1;

    public SubrectangleQueries(int[][] rectangle) {
        rectangle1 = rectangle;
    }

//    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
//        boolean col1Call = false;
//        boolean col2Call = false;
//        boolean eq = false;
//
//        for (int i = 0; i < rectangle1.length; i++) {
//            for (int j = 0; j < rectangle1[i].length; j++) {
//
//
//                if (row1 == row2 && col1 == col2 && !eq) {
//                    eq = true;
//                    col1Call = true;
//                    col2Call = true;
//                    rectangle1[row1][col1] = newValue;
//                    break;
//                }
//
//                if (i == row1 && col1 == j && !col1Call) {
//                    col1Call = true;
//                    rectangle1[i][j] = newValue;
//                    continue;
//                }
//                if (i == row2 && col2 == j && !col2Call) {
//                    col2Call = true;
//                    rectangle1[i][j] = newValue;
//                    continue;
//                }
//
//                if (col1Call && !col2Call)
//                    rectangle1[i][j] = newValue;
//            }
//        }
//    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {


        for (int i = row1; i <= row2; i++) {

            for (int j = col1; j <= col2; j++) {
                rectangle1[i][j] = newValue;
            }
            
        }
    }

    public int getValue(int row, int col) {
        return rectangle1[row][col];
    }
}
