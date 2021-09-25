package algorithms.array;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        convertToTitle(45);
    }

    public static String convertToTitle(int columnNumber) {

        String[] array = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P",
                "Q","R","S","T","U","V", "W","X", "Y", "Z"};

        Map<Integer,String>  map = new HashMap<>();
        for (int i = 0; i < array.length ; i++) {
            map.put(i+1, array[i]);
        }


        return "";

    }
}
