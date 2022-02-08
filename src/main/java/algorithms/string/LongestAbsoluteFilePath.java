package algorithms.string;

import java.util.List;

public class LongestAbsoluteFilePath {
    public static void main(String[] args) {

//        String input = """  """;
//        lengthLongestPath(""" dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext """);
    }

    public static int lengthLongestPath(String input) {


        getSubDir(input);

        return 0;
    }


    public static List<String> getSubDir(String dir){

        for (int i = 0; i < dir.length(); i++) {

            if (dir.charAt(i) == 't' && dir.charAt(i-1) == '\\' && dir.charAt(i+1) != 't') {
                System.out.println(i);
            }
        }

        return null;
    }
}
