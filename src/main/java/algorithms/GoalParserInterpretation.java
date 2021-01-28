package algorithms;

/**
 * @author freakbelka
 * <p>
 * Challenge description:
 * https://leetcode.com/problems/goal-parser-interpretation/
 */
class GoalParserInterpretation {
    public String interpretWithRegex(String command) {
        // Runtime = 6 ms, memory = 39.6 MB
        return command.replaceAll("\\(\\)", "o")
                .replaceAll("\\(al\\)", "al");
    }

    public String interpret(String command) {
        // Runtime = 0 ms, memory =	37.7 MB
        String al = "(al)", o = "()";
        StringBuilder result = new StringBuilder();

        int index = 0;
        while (index < command.length()) {
            if (command.charAt(index) == 'G') {
                result.append('G');
                index++;
            } else if (o.equals(command.substring(index, index + o.length()))) {
                result.append("o");
                index += o.length();
            } else if (al.equals(command.substring(index, index + al.length()))) {
                result.append("al");
                index += al.length();
            } else {
                break;
            }
        }
        return result.toString();
    }
}