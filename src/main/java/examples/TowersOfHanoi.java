package examples;

import java.util.PriorityQueue;

public class TowersOfHanoi {
    public static void towersOfHanoi(int n, char from_rod, char aux_rod, char to_rod) {
        /*
         * Note: Discs of lower value cannot go on top of higher valued disc
         *  A-(30,20,10) B C
         *  A-(30, 20) B-10 C
         *  A-30 B-10 C-20
         *  A-30 B C-(20,10)
         *  A B-30 C-(20,10)
         *  A-10 B-30 C-20
         *  A-10 B-(30,20) C
         *  A B-(30,20,10) C
         *
         *
         *
         *  A-20,10 B C
         *  A-20 B-10 C
         *  A B-10 C-20
         *  A B C-20,10
         */
        if (n == 0)
            return;
        System.out.printf("Moving %d from %c to %c \n", n, from_rod, to_rod);
        towersOfHanoi(n-1, from_rod, aux_rod, to_rod);
    }

    public static void main(String[] args) {
        towersOfHanoi(2, 'A', 'B', 'C');
    }
}


