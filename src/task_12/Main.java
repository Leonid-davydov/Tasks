package task_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);
        System.out.println(isCorrect(line));
    }

    public static boolean isCorrect(String line) {
        Stack stack = new Stack();

        for(int i = 0; i < line.length(); i++){
            Character ch = line.charAt(i);
            if (ch == '[' || ch == '{' || ch == '<' || ch == '(') {
                stack.push(ch);
            }
            if (ch == ']' && (stack.size() == 0 || stack.pop() != '[')) {
                return false;
            }
            if (ch == '}' &&(stack.size() == 0 || stack.pop() != '{')) {
                return false;
            }
            if (ch == '>' && (stack.size() == 0 || stack.pop() != '<')) {
                return false;
            }
            if (ch == ')' && (stack.size() == 0 || stack.pop() != '(')) {
                return false;
            }
        }
        return stack.size() == 0;
    }
}
