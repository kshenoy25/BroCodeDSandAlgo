package packageRecursion;

public class Main {
    // recursion = When a thing is defined in terms of itself.
    //             Apply the result of a procedure, to a procedure.
    //             A recursive method calls itself. Can be a substitute for iteration (repetition of a process).
    //             Divide a problem into sub-problems of the same type as the original.
    //             Commonly used with advanced sorting algorithms and navigating trees

    //             Advantages
    //             ----------
    //             easier to read/write
    //             easier to debug

    //             Disadvantages
    //             -------------
    //             sometimes slower
    //             uses more memory
    public static void main(String[] args) {
        walk(5);


    }
    public static void walk(int steps) {
        /*
        for(int i = 0; i < steps; i++) {
            System.out.println("You take a step");
         */
        // base case ** when to stop
        if (steps < 1){
            return;
        }
        System.out.println("You take a step");
        walk(steps - 1); // recursive case

    }
}


