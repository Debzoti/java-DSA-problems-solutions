package arshGoyalSheet.Strings;

import java.util.Stack;
public class SimplifyPath {
    public static void main(String[] args) {
        String path = "/a/./b/../d/e/../c/";
        String res = simplifyPath(path);
        System.out.println(res);
    }

    public static String simplifyPath(String path) {
        String[] parts = path.split("/");
        Stack<String> stack = new Stack<>();

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                // Ignore empty parts and current directory references
                continue;
            }else if(part.equals("..")) {
                // If we encounter "..", pop from the stack if it's not empty
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Otherwise, push the part onto the stack
                stack.push(part);
            }
        }
        // Build the simplified path from the stack
        StringBuilder simplifiedPath = new StringBuilder();
        for (String dir : stack) {
            simplifiedPath.append("/").append(dir);
        }

        // If the stack is empty, return root "/"
        return simplifiedPath.length() == 0 ? "/" : simplifiedPath.toString();
    }
}
