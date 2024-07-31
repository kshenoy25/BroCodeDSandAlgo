package packageStack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // stack = LIFO data structure/ Last - In First - Out
        //         stores objects into a sort of "vertical tower"
        //         push() to add to the top
        //         pop() to remove from the top


        // uses of stacks?
        // 1) undo/redo features in text editors
        // 2) moving back/forward through browser history
        // 3) backtracking algorithms (maze, file directories)
        // 4) calling functions (call stack)
        Stack<String> stack = new Stack<String>();
        stack.push("Minecraft");
        stack.push("Batman Arkham Knight");
        stack.push("Hogwarts Legacy");
        stack.push("The Walking Dead");
        //stack.pop();
        //stack.pop();
        //stack.pop();
        // pop all items in stack and exception will display: EmptyStackException

        // retrieving from top of stack
        //String myFavGame = stack.pop();


        // take a peek of the top stack object
        //stack.peek();
        //System.out.println(stack.peek());
        //System.out.println(stack);

        //System.out.println(stack);
        //System.out.println(myFavGame);

        //System.out.println(stack.search("The Walking Dead"));

        // ran out of memory
        // :(
        /*
        for (int i = 0; i < 1000000000; i++){
            stack.push("Fallout76");
        }

         */

    }
}
