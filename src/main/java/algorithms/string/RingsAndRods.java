package algorithms.string;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RingsAndRods {

    public static void main(String[] args) {
        String rings = "B0B6G0R6R0R6G9";
        System.out.println(countPoints(rings));
    }

    public static int countPoints(String rings) {

        Map<Integer, List<String>> map = new HashMap<>();
        for (int i = 0; i < rings.length() ; i+=2) {
            String colorCode = String.valueOf(rings.charAt(i));
            Integer position =  Integer.parseInt(String.valueOf(rings.charAt(i+1))) ;
            List<String> colors = map.get(position);
            if (colors == null || colors.isEmpty()) {
                List<String> col = new LinkedList<>();
                col.add(colorCode);
                map.put(position, col );
            } else {
                if (!colors.contains(colorCode)) {
                    colors.add(colorCode);
                    map.put(position, colors );
                }
            }
        }

        int res = 0;
        for ( Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            if (entry.getValue().size()==3) {
                res++;
            }
        }


        return res;
    }
}
