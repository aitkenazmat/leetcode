package algorithms.string;

public class GoalParserInterpretation {
    public static void main(String[] args) {

        System.out.println(interpret("(al)G(al)()()G"));

    }

    public static String interpret(String command) {
        String[] split = command.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < split.length ; i++) {
            if (split[i].equals("G")) {
                stringBuilder.append("G");
                continue;
            }

            if ( split[i].equals("(") && split[i+1].equals(")")) {
                stringBuilder.append("o");
                continue;
            }

            if ( split[i].equals("(") && split[i+1].equals("a")){
                stringBuilder.append("al");
            }
        }

        return stringBuilder.toString();
    }
}
