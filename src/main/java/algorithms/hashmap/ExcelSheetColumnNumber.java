package algorithms.hashmap;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }

    public static int titleToNumber(String columnTitle) {
        int s = 0;
        for(int i = 0; i < columnTitle.length(); i++){
            char a = columnTitle.charAt(i);
            s = s * 26 +  (a - 'A' + 1);

        }
        return s;
    }
}
