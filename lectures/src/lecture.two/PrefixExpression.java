package lecture.two;
public class PrefixExpression {
    // <prefix> => <operand> | <operator> <prefix> <prefix>
    // <operand> => 0 | ... | 9
    // <operator> => + | - | * | /

    public static void main(String[] args) {
        s = args[0];
        if (prefix() && s.length() == 0) {
            System.out.println("The string \"" + args[0] + "\" is a prefix expression.");
        } else {
            System.out.println("The string \"" + args[0] + "\" is not a prefix expression.");
        }
    }
    private static boolean prefix() {
        if (operand()) {
            return true;
        }
        else if (operator()) {
            if (prefix()) {
                if (prefix()) {
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean operand() {
        if (i < s.length() && '0' <= s.charAt(i) && s.charAt(i) <= '9') {
            i++;
            return true;
        }
        return false;
    }
    private static boolean operator() {
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-' ||
                    s.charAt(i) == '*' || s.charAt(i) == '/')) {
            i++;
            return true;
        }
        return false;
    }

    static String s;
    static int i;
}
