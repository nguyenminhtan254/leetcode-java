
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "([{])[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> store = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '(' ||
                temp == '[' ||
                temp == '{') {
                    store.push(temp);
                } else {
                    if (store.isEmpty()) {
                        return false;
                    }
                    char open = store.pop();
                    if (!(open == '(' && temp == ')' ||
                        open == '['  && temp == ']' ||
                        open == '{' && temp == '}')) {
                            return false;
                        }
                }
        }
        
        return store.isEmpty();
    }
}