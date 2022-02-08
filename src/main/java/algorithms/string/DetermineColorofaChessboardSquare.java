package algorithms.string;

public class DetermineColorofaChessboardSquare {
    public static void main(String[] args) {

        System.out.println(squareIsWhite("c7"));
    }

    public static boolean squareIsWhite(String coordinates) {
        int[][] tables = new int[][]{
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1},
                {1,0,1,0,1,0,1,0}
        };


        String[] split = coordinates.split("");

        int column = getColumn(split[0]);
        int row = Integer.parseInt(split[1])-1;

        return tables[column][row] == 1;
    }

    public static int getColumn(String a) {
        if (a.equals("a")) {
            return 0;
        } else if ("b".equals(a)) {
            return 1;
        } else if ("c".equals(a)) {
            return 2;
        }else if ("d".equals(a)) {
            return 3;
        }else if ("e".equals(a)) {
            return 4;
        }else if ("f".equals(a)) {
            return 5;
        }else if ("g".equals(a)) {
            return 6;
        }else {
            return 7;
        }
    }
}
