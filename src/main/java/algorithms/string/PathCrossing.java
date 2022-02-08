package algorithms.string;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PathCrossing {

    public static void main(String[] args) {

//        System.out.println(isPathCrossing("NES"));
//        System.out.println(isPathCrossing("NESWW"));
//        System.out.println(isPathCrossing("NNSWWEWSSESSWENNW"));
//        System.out.println(isPathCrossing("NESWW"));
        System.out.println(isPathCrossing("SN"));
    }

    public static boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        List<Coordinate> coordinates = new LinkedList<>();
        coordinates.add(new Coordinate(0,0));
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {
                y++;
                Coordinate coordinate = new Coordinate(x, y);
                if (exist(coordinates,coordinate)) {
                    return true;
                } else {
                    coordinates.add(coordinate);
                }
                continue;
            }
            if (path.charAt(i) == 'S') {
                y--;
                Coordinate coordinate = new Coordinate(x, y);
                if (exist(coordinates,coordinate)) {
                    return true;
                } else {
                    coordinates.add(coordinate);
                }
                continue;
            }

            if (path.charAt(i) == 'E') {
                x++;
                Coordinate coordinate = new Coordinate(x, y);
                if (exist(coordinates,coordinate)) {
                    return true;
                } else {
                    coordinates.add(coordinate);
                }
                continue;
            }
            if (path.charAt(i) == 'W') {
                x--;
                Coordinate coordinate = new Coordinate(x, y);
                if (exist(coordinates,coordinate)) {
                    return true;
                } else {
                    coordinates.add(coordinate);
                }
                continue;
            }
        }

        return false;

    }

    static boolean exist (List<Coordinate> coordinates, Coordinate coordinate) {

        for (Coordinate c :  coordinates) {
            if (c.x == coordinate.x && c.y == coordinate.y) {
                return true;
            }
        }

        return false;
    }

    public static class Coordinate {
        int x;
        int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
