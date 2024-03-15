import java.util.Stack;

public class reversewords {
    public static String reverseWords(String str) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                stack.push(ch);
            } else {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
                result.append(' '); // Add space between words
            }
        }

        // Process the remaining characters
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Hello world Ashish Sir";
        System.out.println("Input: " + input);
        System.out.println("Output: " + reverseWords(input));
    }
}