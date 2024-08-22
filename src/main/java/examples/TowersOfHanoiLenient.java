package examples;

import java.util.Stack;

public class TowersOfHanoiLenient {

    public static void towersOfHanoi(Stack<Integer> from, Stack<Integer> to, boolean isFinalStack) {
        /*
        * A-(1,2,3) B C
        * A-(1,2) B-3 C
        * A-1 B-(3,2) C
        * A B-(3,2) C-1
        * A B-3 C-(1,2)
        * A B C-(1,2,3)
        *
        * A-(1,2) B C
        * A-1 B-2 C
        * A B-2 C-1
        * A B C-(1,2)
        *
        * Move A into B until 1 disc remains
        * Move last A disc to C
        * Move each disc from B into C
        */

        if(from.size() == 1 && !isFinalStack)
            return;
        for(int i = from.size() - 1, j = 0; i >= 0; i--,j++) {
            if(!isFinalStack && from.size() == 1)
                break;
            to.push(from.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>(), b = new Stack<>(), c = new Stack<>();
        a.push(10);
        a.push(20);

        System.out.println("A - "+ a);
        towersOfHanoi(a, b, false);
        System.out.println("A - "+ a);
        System.out.println("B - "+ b);
        towersOfHanoi(a, c, true);
        System.out.println("A - "+ a);
        System.out.println("B - "+ b);
        System.out.println("C - "+ c);
        towersOfHanoi(b, c, true);
        System.out.println("A - "+ a);
        System.out.println("B - "+ b);
        System.out.println("C - "+ c);
    }
}
