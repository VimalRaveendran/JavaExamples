package examples;

import java.util.Arrays;

public class FindIsland {
    public static void main(String[] args) {
        /*
        *
        * 1 1 1 1 0
        * 1 1 0 1 0
        * 1 1 0 0 0
        * 0 0 0 0 0
        */

        //int[][] inputArr = {{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}};
        int[][] inputArr = {{1,1,0,0,0},{1,1,0,0,0},{0,0,1,0,0},{0,0,0,1,1}};
        int islandCount = 0;
        for(int i = 0; i < inputArr.length; i++) {
            for(int j=0; j < inputArr[i].length; j++){
                if(inputArr[i][j] == 1) {
                    islandCount += 1;
                    findIslandLimits(inputArr, i, j);
                    System.out.println(Arrays.deepToString(inputArr));
                }
            }
        }
        System.out.println("Island count = "+islandCount);
    }

    private static void findIslandLimits(int[][] inputArr, int i, int j) {
        System.out.println("i="+i+",j="+j);
        if(i < 0 || i >= inputArr.length || j < 0 || j >= inputArr[i].length || inputArr[i][j] == 0)
            return;
        System.out.println("value="+inputArr[i][j]);
        inputArr[i][j] = 0;
        findIslandLimits(inputArr, i, j-1);
        findIslandLimits(inputArr, i, j+1);
        findIslandLimits(inputArr, i-1, j);
        findIslandLimits(inputArr, i+1, j);
    }
}
